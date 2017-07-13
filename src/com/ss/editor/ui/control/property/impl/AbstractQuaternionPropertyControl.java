package com.ss.editor.ui.control.property.impl;

import static com.ss.rlib.geom.util.AngleUtils.degreeToRadians;
import static com.ss.rlib.geom.util.AngleUtils.radiansToDegree;
import com.jme3.math.Quaternion;
import com.ss.editor.model.undo.editor.ChangeConsumer;
import com.ss.editor.ui.control.model.property.control.ModelPropertyControl;
import com.ss.editor.ui.control.property.AbstractPropertyControl;
import com.ss.editor.ui.css.CSSClasses;
import com.ss.editor.ui.util.UIUtils;
import com.ss.rlib.function.SixObjectConsumer;
import com.ss.rlib.ui.control.input.FloatTextField;
import com.ss.rlib.ui.util.FXUtils;
import com.ss.rlib.util.array.ArrayFactory;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;
import java.util.function.BiConsumer;

/**
 * The implementation of the {@link ModelPropertyControl} to edit {@link Quaternion} values.
 *
 * @param <C> the type parameter
 * @param <T> the type parameter
 * @author JavaSaBr
 */
public abstract class AbstractQuaternionPropertyControl<C extends ChangeConsumer, T>
        extends AbstractPropertyControl<C, T, Quaternion> {

    /**
     * The field Y.
     */
    private FloatTextField xField;

    /**
     * The field X.
     */
    private FloatTextField yFiled;

    /**
     * The field Z.
     */
    private FloatTextField zField;

    /**
     * Instantiates a new Abstract quaternion property control.
     *
     * @param propertyValue  the property value
     * @param propertyName   the property name
     * @param changeConsumer the change consumer
     * @param changeHandler  the change handler
     */
    public AbstractQuaternionPropertyControl(@Nullable final Quaternion propertyValue, @NotNull final String propertyName,
                                             @NotNull final C changeConsumer,
                                             @NotNull final SixObjectConsumer<C, T, String, Quaternion, Quaternion, BiConsumer<T, Quaternion>> changeHandler) {
        super(propertyValue, propertyName, changeConsumer, changeHandler);
    }

    @Override
    protected void createComponents(@NotNull final HBox container) {
        super.createComponents(container);

        final Label xLabel = new Label("x:");

        xField = new FloatTextField();
        xField.setOnKeyReleased(this::updateRotation);
        xField.addChangeListener((observable, oldValue, newValue) -> updateRotation(null));
        xField.prefWidthProperty().bind(widthProperty().divide(3));

        final Label yLabel = new Label("y:");

        yFiled = new FloatTextField();
        yFiled.setOnKeyReleased(this::updateRotation);
        yFiled.addChangeListener((observable, oldValue, newValue) -> updateRotation(null));
        yFiled.prefWidthProperty().bind(widthProperty().divide(3));

        final Label zLabel = new Label("z:");

        zField = new FloatTextField();
        zField.setOnKeyReleased(this::updateRotation);
        zField.addChangeListener((observable, oldValue, newValue) -> updateRotation(null));
        zField.prefWidthProperty().bind(widthProperty().divide(3));

        FXUtils.addToPane(xLabel, container);
        FXUtils.addToPane(xField, container);
        FXUtils.addToPane(yLabel, container);
        FXUtils.addToPane(yFiled, container);
        FXUtils.addToPane(zLabel, container);
        FXUtils.addToPane(zField, container);

        FXUtils.addClassTo(xLabel, yLabel, zLabel, CSSClasses.ABSTRACT_PARAM_CONTROL_NUMBER_LABEL);
        FXUtils.addClassTo(xField, yFiled, zField, CSSClasses.ABSTRACT_PARAM_CONTROL_VECTOR3F_FIELD);
    }

    /**
     * @return the field X.
     */
    private FloatTextField getXField() {
        return xField;
    }

    /**
     * @return the field Y.
     */
    private FloatTextField getYFiled() {
        return yFiled;
    }

    /**
     * @return the field Z.
     */
    private FloatTextField getZField() {
        return zField;
    }

    @Override
    protected void reload() {

        final float[] angles = new float[3];

        final Quaternion element = getPropertyValue();
        Objects.requireNonNull(element, "The property value can't be null.");

        element.toAngles(angles);

        final FloatTextField xField = getXField();
        xField.setValue(radiansToDegree(angles[0]));
        xField.positionCaret(xField.getText().length());

        final FloatTextField yFiled = getYFiled();
        yFiled.setValue(radiansToDegree(angles[1]));
        yFiled.positionCaret(yFiled.getText().length());

        final FloatTextField zField = getZField();
        zField.setValue(radiansToDegree(angles[2]));
        zField.positionCaret(zField.getText().length());
    }

    /**
     * Updating rotation.
     */
    private void updateRotation(@Nullable final KeyEvent event) {
        UIUtils.consumeIfIsNotHotKey(event);

        if (isIgnoreListener() || (event != null && event.getCode() != KeyCode.ENTER)) return;

        final Quaternion oldValue = getPropertyValue();
        Objects.requireNonNull(oldValue, "The old value can't be null.");

        final FloatTextField xField = getXField();
        final float x = degreeToRadians(xField.getValue());

        final FloatTextField yFiled = getYFiled();
        final float y = degreeToRadians(yFiled.getValue());

        final FloatTextField zField = getZField();
        final float z = degreeToRadians(zField.getValue());

        final Quaternion newValue = new Quaternion();
        newValue.fromAngles(ArrayFactory.toFloatArray(x, y, z));

        changed(newValue, oldValue.clone());
    }
}
