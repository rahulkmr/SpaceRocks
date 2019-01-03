package com.mygdx.game.spacerocks;

import com.badlogic.gdx.Input.Keys;

public class LevelScreen extends BaseScreen {
    private Spaceship spaceship;

    public void initialize() {
        BaseActor space = new BaseActor(0, 0, mainStage);
        space.loadTexture("space.png");
        space.setSize(800, 600);
        BaseActor.setWorldBounds(space);

        spaceship = new Spaceship(400, 300, mainStage);

        new Rock(600, 500, mainStage);
        new Rock(600, 300, mainStage);
        new Rock(600, 100, mainStage);
        new Rock(400, 100, mainStage);
        new Rock(200, 100, mainStage);
        new Rock(200, 300, mainStage);
        new Rock(200, 500, mainStage);
        new Rock(400, 500, mainStage);

    }

    public void update(float dt) {
    }

    public boolean keyDown(int keycode) {
        if (keycode == Keys.X)
            spaceship.warp();
        else if (keycode == Keys.SPACE)
            spaceship.shoot();
        return false;
    }
}