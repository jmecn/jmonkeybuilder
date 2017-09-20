package com.ss.editor.ui.control.model.node.control;

import com.jme3.scene.control.Control;
import com.ss.editor.annotation.FXThread;
import com.ss.editor.annotation.FromAnyThread;
import com.ss.editor.extension.Named;
import com.ss.editor.extension.scene.control.EditableControl;
import com.ss.editor.ui.Icons;
import com.ss.editor.ui.control.model.tree.action.RemoveControlAction;
import com.ss.editor.ui.control.tree.NodeTree;
import com.ss.editor.ui.control.tree.node.TreeNode;
import javafx.collections.ObservableList;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The implementation of the {@link TreeNode} to show a {@link Control} in the tree.
 *
 * @param <T> the type parameter
 * @author JavaSaBr
 */
public class ControlTreeNode<T extends Control> extends TreeNode<T> {

    public ControlTreeNode(@NotNull final T element, final long objectId) {
        super(element, objectId);
    }

    @Override
    @FXThread
    public void fillContextMenu(@NotNull final NodeTree<?> nodeTree, @NotNull final ObservableList<MenuItem> items) {
        items.add(new RemoveControlAction(nodeTree, this));
        super.fillContextMenu(nodeTree, items);
    }

    @Override
    @FXThread
    public @Nullable Image getIcon() {
        return Icons.GEAR_16;
    }

    @Override
    @FXThread
    public boolean canCopy() {
        return true;
    }

    @Override
    @FXThread
    public boolean canMove() {
        return true;
    }

    @Override
    @FromAnyThread
    public @NotNull String getName() {

        final T element = getElement();

        if (element instanceof EditableControl) {
            return ((EditableControl) element).getName();
        } else if (element instanceof Named) {
            return ((Named) element).getName();
        }

        return element.getClass().getSimpleName();
    }
}
