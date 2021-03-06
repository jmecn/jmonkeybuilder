package com.ss.editor.ui.control.tree.action.impl.audio;

import com.jme3.audio.AudioNode;
import com.ss.editor.Messages;
import com.ss.editor.annotation.FxThread;
import com.ss.editor.model.undo.editor.ModelChangeConsumer;
import com.ss.editor.ui.Icons;
import com.ss.editor.ui.control.tree.node.impl.spatial.AudioTreeNode;
import com.ss.editor.ui.control.tree.action.AbstractNodeAction;
import com.ss.editor.ui.control.tree.NodeTree;
import com.ss.editor.ui.control.tree.node.TreeNode;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javafx.scene.image.Image;

/**
 * The action to stop an audio node.
 *
 * @author JavaSaBr
 */
public class StopAudioNodeAction extends AbstractNodeAction<ModelChangeConsumer> {

    public StopAudioNodeAction(@NotNull final NodeTree<?> nodeTree, @NotNull final TreeNode<?> node) {
        super(nodeTree, node);
    }

    @Override
    @FxThread
    protected @Nullable Image getIcon() {
        return Icons.STOP_16;
    }


    @Override
    @FxThread
    protected @NotNull String getName() {
        return Messages.MODEL_NODE_TREE_ACTION_AUDIO_STOP;
    }

    @Override
    @FxThread
    protected void process() {
        super.process();

        final AudioTreeNode audioModelNode = (AudioTreeNode) getNode();
        final AudioNode audioNode = audioModelNode.getElement();

        EXECUTOR_MANAGER.addJmeTask(audioNode::stop);
    }
}
