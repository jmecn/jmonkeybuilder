package com.ss.editor.ui.tooltip;

import com.ss.editor.manager.JavaFXImageManager;
import com.ss.editor.ui.css.CSSIds;

import org.jetbrains.annotations.NotNull;

import java.nio.file.Path;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.GridPane;

/**
 * THe implementation of tooltip for showing image channels.
 *
 * @author JavaSaBr
 */
public class ImageChannelPreview extends CustomTooltip<GridPane> {

    private static final JavaFXImageManager IMAGE_MANAGER = JavaFXImageManager.getInstance();

    /**
     * The red image.
     */
    private final WritableImage redImage;

    /**
     * The green image.
     */
    private final WritableImage greenImage;

    /**
     * The blue image.
     */
    private final WritableImage blueImage;

    /**
     * The alpha image.
     */
    private final WritableImage alphaImage;

    /**
     * The red image view.
     */
    private ImageView redView;

    /**
     * The green image view.
     */
    private ImageView greenView;

    /**
     * The blue image view.
     */
    private ImageView blueView;

    /**
     * The alpha image view.
     */
    private ImageView alphaView;

    public ImageChannelPreview() {
        redImage = new WritableImage(120, 120);
        greenImage = new WritableImage(120, 120);
        blueImage = new WritableImage(120, 120);
        alphaImage = new WritableImage(120, 120);
    }

    /**
     * @return the alpha image.
     */
    private WritableImage getAlphaImage() {
        return alphaImage;
    }

    /**
     * @return the red image.
     */
    private WritableImage getRedImage() {
        return redImage;
    }

    /**
     * @return the blue image.
     */
    private WritableImage getBlueImage() {
        return blueImage;
    }

    /**
     * @return the green image.
     */
    private WritableImage getGreenImage() {
        return greenImage;
    }

    @Override
    protected void createContent(@NotNull final GridPane root) {
        root.setId(CSSIds.IMAGE_CHANNEL_PREVIEW);

        super.createContent(root);

        redView = new ImageView();
        redView.setId(CSSIds.IMAGE_CHANNEL_PREVIEW_IMAGE_CONTAINER);
        redView.setImage(getRedImage());

        greenView = new ImageView();
        greenView.setId(CSSIds.IMAGE_CHANNEL_PREVIEW_IMAGE_CONTAINER);
        greenView.setImage(getGreenImage());

        blueView = new ImageView();
        blueView.setId(CSSIds.IMAGE_CHANNEL_PREVIEW_IMAGE_CONTAINER);
        blueView.setImage(getBlueImage());

        alphaView = new ImageView();
        alphaView.setId(CSSIds.IMAGE_CHANNEL_PREVIEW_IMAGE_CONTAINER);
        alphaView.setImage(getAlphaImage());

        root.add(redView, 0, 0);
        root.add(greenView, 1, 0);
        root.add(blueView, 0, 1);
        root.add(alphaView, 1, 1);
    }

    @NotNull
    @Override
    protected GridPane createRoot() {
        return new GridPane();
    }

    /**
     * @return the alpha image view.
     */
    private ImageView getAlphaView() {
        return alphaView;
    }

    /**
     * @return the blue image view.
     */
    private ImageView getBlueView() {
        return blueView;
    }

    /**
     * @return the green image view.
     */
    private ImageView getGreenView() {
        return greenView;
    }

    /**
     * @return the red image view.
     */
    private ImageView getRedView() {
        return redView;
    }

    /**
     * Show the file.
     */
    public void showImage(final Path file) {

        final Image image = file == null ? null : IMAGE_MANAGER.getTexturePreview(file, 120, 120);

        if (file == null || image.getWidth() != 120) {

            final ImageView redView = getRedView();
            redView.setImage(null);

            final ImageView greenView = getGreenView();
            greenView.setImage(null);

            final ImageView blueView = getBlueView();
            blueView.setImage(null);

            final ImageView alphaView = getAlphaView();
            alphaView.setImage(null);
            return;
        }

        final PixelReader pixelReader = image.getPixelReader();

        final WritableImage alphaImage = getAlphaImage();
        final PixelWriter alphaWriter = alphaImage.getPixelWriter();

        final WritableImage redImage = getRedImage();
        final PixelWriter redWriter = redImage.getPixelWriter();

        final WritableImage greenImage = getGreenImage();
        final PixelWriter greenWriter = greenImage.getPixelWriter();

        final WritableImage blueImage = getBlueImage();
        final PixelWriter blueWriter = blueImage.getPixelWriter();

        for (int y = 0, height = (int) image.getHeight(); y < height; y++) {
            for (int x = 0, width = (int) image.getWidth(); x < width; x++) {

                final int argb = pixelReader.getArgb(x, y);

                final int alpha = argb >>> 24;
                final int red = (argb >> 16) & 0xff;
                final int green = (argb >> 8) & 0xff;
                final int blue = (argb) & 0xff;

                redWriter.setArgb(x, y, ((255 << 24) | (red << 16) | (red << 8) | red));
                greenWriter.setArgb(x, y, ((255 << 24) | (green << 16) | (green << 8) | green));
                blueWriter.setArgb(x, y, ((255 << 24) | (blue << 16) | (blue << 8) | blue));
                alphaWriter.setArgb(x, y, ((255 << 24) | (alpha << 16) | (alpha << 8) | alpha));
            }
        }

        final ImageView redView = getRedView();
        redView.setImage(null);
        redView.setImage(redImage);

        final ImageView greenView = getGreenView();
        greenView.setImage(null);
        greenView.setImage(greenImage);

        final ImageView blueView = getBlueView();
        blueView.setImage(null);
        blueView.setImage(blueImage);

        final ImageView alphaView = getAlphaView();
        alphaView.setImage(null);
        alphaView.setImage(alphaImage);
    }
}
