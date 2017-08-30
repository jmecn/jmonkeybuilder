package com.ss.editor.ui.component.asset.tree.context.menu.action;

import com.ss.editor.Messages;
import com.ss.editor.ui.component.asset.tree.resource.ResourceElement;
import com.ss.editor.util.EditorUtil;
import javafx.event.ActionEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The action to open a file in an external editor.
 *
 * @author JavaSaBr
 */
public class OpenFileByExternalEditorAction extends FileAction {

    public OpenFileByExternalEditorAction(@NotNull final ResourceElement element) {
        super(element);
    }

    @Override
    protected @NotNull String getName() {
        return Messages.ASSET_COMPONENT_RESOURCE_TREE_CONTEXT_MENU_OPEN_FILE_BY_EXTERNAL_EDITOR;
    }


    @Override
    protected void execute(@Nullable final ActionEvent event) {
        super.execute(event);
        EditorUtil.openFileInExternalEditor(getElement().getFile());
    }
}
