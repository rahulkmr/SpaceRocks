package com.mygdx.game.spacerocks;


public class SpaceRocks extends BaseGame {
	public void create() {
		super.create();
		setActiveScreen(new LevelScreen());
	}
}