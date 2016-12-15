package com.ss.editor.ui.component.editor.impl.material;

import com.jme3.material.MatParam;
import com.jme3.material.Material;
import com.jme3.shader.VarType;
import com.ss.editor.model.undo.EditorOperation;
import com.ss.editor.ui.control.material.ColorMaterialParamControl;

import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

import rlib.ui.util.FXUtils;

/**
 * The component for editing material color properties.
 *
 * @author JavaSaBr
 */
public class MaterialColorsComponent extends AbstractMaterialPropertiesComponent {

    public MaterialColorsComponent(final Consumer<EditorOperation> changeHandler) {
        super(changeHandler);
    }

    @Override
    protected void buildFor(@NotNull final MatParam matParam, @NotNull final Material material) {

        final VarType varType = matParam.getVarType();
        if (varType != VarType.Vector4) return;

        FXUtils.addToPane(new ColorMaterialParamControl(getChangeHandler(), material, matParam.getName()), this);
    }
}
