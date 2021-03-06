package com.ss.editor.plugin.api.property.control;

import static com.ss.rlib.util.ClassUtils.unsafeCast;
import static com.ss.rlib.util.ObjectUtils.notNull;
import com.ss.editor.Messages;
import com.ss.editor.annotation.FxThread;
import com.ss.editor.ui.Icons;
import com.ss.editor.ui.css.CssClasses;
import com.ss.editor.plugin.api.property.PropertyDefinition;
import com.ss.editor.ui.util.DynamicIconSupport;
import com.ss.rlib.ui.util.FXUtils;
import com.ss.rlib.util.VarTable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.DataFormat;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.HBox;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.util.List;
import java.util.Set;

/**
 * The control to edit resource values.
 *
 * @author JavaSaBr
 */
public abstract class ResourcePropertyEditorControl<T> extends PropertyEditorControl<T> {

    /**
     * The constant NOT_SELECTED.
     */
    @NotNull
    protected static final String NOT_SELECTED = Messages.RESOURCE_PROPERTY_EDIT_CONTROL_NOTHING_IS_SELECTED;

    /**
     * The label with name of the resource.
     */
    @Nullable
    private Label resourceLabel;

    protected ResourcePropertyEditorControl(@NotNull final VarTable vars, @NotNull final PropertyDefinition definition,
                                            @NotNull final Runnable validationCallback) {
        super(vars, definition, validationCallback);
        setOnDragOver(this::dragOver);
        setOnDragDropped(this::dragDropped);
        setOnDragExited(this::dragExited);
        FXUtils.addClassTo(this, CssClasses.ABSTRACT_RESOURCE_PROPERTY_CONTROL);
    }

    @Override
    @FxThread
    protected void createComponents() {
        super.createComponents();

        resourceLabel = new Label(NOT_SELECTED);

        final Button changeButton = new Button();
        changeButton.setGraphic(new ImageView(Icons.ADD_16));
        changeButton.setOnAction(event -> processSelect());

        final HBox container = new HBox(resourceLabel, changeButton);
        container.prefWidthProperty().bind(widthProperty().multiply(DEFAULT_FIELD_W_PERCENT));

        resourceLabel.prefWidthProperty().bind(container.widthProperty());

        FXUtils.addToPane(container, this);

        FXUtils.addClassesTo(container, CssClasses.DEF_HBOX, CssClasses.TEXT_INPUT_CONTAINER);
        FXUtils.addClassesTo(changeButton, CssClasses.FLAT_BUTTON, CssClasses.INPUT_CONTROL_TOOLBAR_BUTTON);
        FXUtils.addClassTo(resourceLabel, CssClasses.ABSTRACT_PARAM_CONTROL_ELEMENT_LABEL);

        DynamicIconSupport.addSupport(changeButton);
    }

    /**
     * Process select a resource.
     */
    @FxThread
    protected void processSelect() {

    }

    /**
     * Handle grad exiting.
     */
    @FxThread
    private void dragExited(@NotNull final DragEvent dragEvent) {
    }

    /**
     * Handle dropped files to editor.
     */
    @FxThread
    private void dragDropped(@NotNull final DragEvent dragEvent) {

        final Dragboard dragboard = dragEvent.getDragboard();
        final List<File> files = unsafeCast(dragboard.getContent(DataFormat.FILES));

        if (files == null || files.size() != 1) {
            return;
        }

        final File file = files.get(0);
        if (!canAccept(file)) {
            return;
        }

        handleFile(file);
    }

    /**
     * Handle a dropped file.
     *
     * @param file the dropped file.
     */
    @FxThread
    protected void handleFile(@NotNull final File file) {
    }

    /**
     * Handle drag over.
     */
    @FxThread
    private void dragOver(@NotNull final DragEvent dragEvent) {

        final Dragboard dragboard = dragEvent.getDragboard();
        final List<File> files = unsafeCast(dragboard.getContent(DataFormat.FILES));

        if (files == null || files.size() != 1) {
            return;
        }

        final File file = files.get(0);
        if (!canAccept(file)) {
            return;
        }

        final Set<TransferMode> transferModes = dragboard.getTransferModes();
        final boolean isCopy = transferModes.contains(TransferMode.COPY);

        dragEvent.acceptTransferModes(isCopy ? TransferMode.COPY : TransferMode.MOVE);
        dragEvent.consume();
    }

    @FxThread
    protected boolean canAccept(@NotNull final File file) {
        return false;
    }

    /**
     * @return the label with name of the resource.
     */
    @FxThread
    protected @NotNull Label getResourceLabel() {
        return notNull(resourceLabel);
    }
}
