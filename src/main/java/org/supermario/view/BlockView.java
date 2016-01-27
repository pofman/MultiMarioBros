package org.supermario.view;

import java.util.Observer;

import javafx.scene.canvas.GraphicsContext;

import org.supermario.common.Vector2D;
import org.supermario.model.Block;
import org.supermario.model.GameConstants;

public class BlockView extends GameElementView implements Observer {
	private Block block;
	
	public BlockView(Block block, GraphicsContext gc) {
		super(gc, "img/Block.png");
		this.block = block;
	}

	@Override
	public int getElementHeight() {
		return GameConstants.BLOCK_SIDE_SIZE;
	}

	@Override
	public int getElementWidth() {
		return GameConstants.BLOCK_SIDE_SIZE;
	}

	@Override
	public Vector2D getElementPosition() {
		return this.block.getPosition();
	}

}
