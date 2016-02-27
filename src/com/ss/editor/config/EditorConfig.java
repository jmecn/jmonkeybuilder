package com.ss.editor.config;

import com.jme3.asset.AssetEventListener;
import com.jme3.asset.AssetKey;
import com.jme3.asset.TextureKey;
import com.jme3.system.AppSettings;
import com.ss.editor.Editor;
import com.ss.editor.EditorContext;

import java.awt.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

import rlib.logging.Logger;
import rlib.logging.LoggerManager;

/**
 * Набор настроек, изменяемых пользователем.
 *
 * @author Ronn
 */
public final class EditorConfig implements AssetEventListener {

    private static final Logger LOGGER = LoggerManager.getLogger(EditorConfig.class);

    public static final String EDITOR_NAME = "jME3 SpaceShift Editor";

    public static final String GRAPHICS_ALIAS = "Graphics";
    public static final String ASSET_ALIAS = "ASSET";

    public static final String PREF_GRAPHIC_SCREEN_SIZE = GRAPHICS_ALIAS + "." + "screenSize";
    public static final String PREF_CURRENT_ASSET = ASSET_ALIAS + "." + "currentAsset";

    private static EditorConfig instance;

    public static EditorConfig getInstance() {

        if (instance == null) {

            final EditorConfig config = new EditorConfig();
            config.init();

            instance = config;
        }

        return instance;
    }

    /**
     * Используемое разрешение экрана.
     */
    private volatile ScreenSize screenSize;

    /**
     * Текущий выбранный Asset.
     */
    private volatile Path currentAsset;

    @Override
    @SuppressWarnings("rawtypes")
    public void assetDependencyNotFound(final AssetKey parentKey, final AssetKey dependentAssetKey) {
    }

    @Override
    @SuppressWarnings("rawtypes")
    public void assetLoaded(final AssetKey key) {
    }

    @Override
    @SuppressWarnings("rawtypes")
    public void assetRequested(final AssetKey key) {

        if (key instanceof TextureKey) {
            //TODO можно указывать анизатропную фильтрацию
            ((TextureKey) key).setAnisotropy(0);
        }
    }

    /**
     * @return используемое разрешение экрана.
     */
    public ScreenSize getScreenSize() {
        return screenSize;
    }

    /**
     * @param screenSize используемое разрешение экрана.
     */
    public void setScreenSize(final ScreenSize screenSize) {
        this.screenSize = screenSize;
    }

    /**
     * @return текущий выбранный Asset.
     */
    public Path getCurrentAsset() {
        return currentAsset;
    }

    /**
     * @param currentAsset текущий выбранный Asset.
     */
    public void setCurrentAsset(Path currentAsset) {
        this.currentAsset = currentAsset;
    }

    /**
     * @return настройки движка.
     */
    public AppSettings getSettings() {

        final GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
        final GraphicsDevice device = graphicsEnvironment.getDefaultScreenDevice();
        final DisplayMode displayMode = device.getDisplayMode();

        final AppSettings settings = new AppSettings(true);
        settings.setRenderer("CUSTOM" + EditorContext.class.getName());
        settings.setTitle(EDITOR_NAME);
        settings.setFullscreen(false);
        settings.setResolution(screenSize.getWidth(), screenSize.getHeight());
        settings.setFrequency(displayMode.getRefreshRate());
        settings.setFrameRate(60);

        return settings;
    }

    /**
     * Инициализация.
     */
    private void init() {

        final Preferences prefs = Preferences.userNodeForPackage(Editor.class);

        this.screenSize = ScreenSize.sizeOf(prefs.get(PREF_GRAPHIC_SCREEN_SIZE, "1244x700"));
        //FIXME убрать когда будут настройки
        this.screenSize = ScreenSize.sizeOf("1600x900");

        final String currentAssetURI = prefs.get(PREF_CURRENT_ASSET, null);

        if(currentAssetURI != null) {
            try {
                this.currentAsset = Paths.get(new URI(currentAssetURI));
            } catch (URISyntaxException e) {
                LOGGER.error(e);
            }
        }
    }

    /**
     * Сохранения настроек.
     */
    public void save() {

        final Preferences prefs = Preferences.userNodeForPackage(Editor.class);

        prefs.put(PREF_GRAPHIC_SCREEN_SIZE, getScreenSize().toString());

        if(currentAsset != null) {
            prefs.put(PREF_CURRENT_ASSET, currentAsset.toUri().toString());
        } else {
            prefs.remove(PREF_CURRENT_ASSET);
        }

        if(currentAsset != null && !Files.exists(currentAsset)) {
            currentAsset = null;
        }

        try {
            prefs.flush();
        } catch (final BackingStoreException e) {
            throw new RuntimeException(e);
        }
    }
}