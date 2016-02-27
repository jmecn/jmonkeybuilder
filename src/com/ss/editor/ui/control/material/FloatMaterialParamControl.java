package com.ss.editor.ui.control.material;

import com.jme3.material.MatParam;
import com.jme3.material.Material;
import com.ss.editor.manager.ExecutorManager;
import com.ss.editor.ui.css.CSSClasses;

import javafx.geometry.Insets;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.layout.HBox;
import rlib.ui.util.FXUtils;

import static com.ss.editor.ui.css.CSSIds.MATERIAL_PARAM_CONTROL_SPINNER;

/**
 * Реализация контрола для установки дробных значения.
 *
 * @author Ronn
 */
public class FloatMaterialParamControl extends MaterialParamControl {

    public static final Insets ELEMENT_OFFSET = new Insets(0, 0, 0, 3);

    private static final ExecutorManager EXECUTOR_MANAGER = ExecutorManager.getInstance();

    /**
     * Контрол для установки дробных значения.
     */
    private Spinner<Double> spinner;

    public FloatMaterialParamControl(final Material material, final String parameterName) {
        super(material, parameterName);
    }

    @Override
    protected void createComponents() {
        super.createComponents();

        final SpinnerValueFactory<Double> valueFactory = new SpinnerValueFactory.DoubleSpinnerValueFactory(-50, 50, 0, 0.01);

        spinner = new Spinner<>();
        spinner.setId(MATERIAL_PARAM_CONTROL_SPINNER);
        spinner.setValueFactory(valueFactory);
        spinner.setEditable(true);
        spinner.valueProperty().addListener((observable, oldValue, newValue) -> processChange(newValue));

        FXUtils.addToPane(spinner, this);

        HBox.setMargin(spinner, ELEMENT_OFFSET);

        FXUtils.addClassTo(spinner, CSSClasses.MAIN_FONT_13);

        FXUtils.bindFixedWidth(getParamNameLabel(), widthProperty().subtract(90));
    }

    /**
     * Процесс обновления дробных значения.
     */
    private void processChange(final Double newValue) {

        if(isIgnoreListeners()) {
            return;
        }
        
        EXECUTOR_MANAGER.addEditorThreadTask(() -> processChangeImpl(newValue));
    }

    /**
     * Процесс изменения дробных значения.
     */
    private void processChangeImpl(final Double newValue) {

        final Material material = getMaterial();

        if(newValue == null) {
            material.clearParam(getParameterName());
        } else {
            material.setFloat(getParameterName(), newValue.floatValue());
        }

        EXECUTOR_MANAGER.addFXTask(() -> {
            changed();
            setIgnoreListeners(true);
            reload();
            setIgnoreListeners(false);
        });
    }

    @Override
    protected void reload() {
        super.reload();

        final Material material = getMaterial();
        final MatParam param = material.getParam(getParameterName());
        final SpinnerValueFactory<Double> valueFactory = spinner.getValueFactory();

        if (param == null) {
            valueFactory.setValue(0D);
            return;
        }

        final Float value = (Float) param.getValue();
        valueFactory.setValue(value.doubleValue());
    }
}