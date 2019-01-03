package com.mygdx.game.spacerocks;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class Spaceship extends BaseActor {
    public Spaceship(float x, float y, Stage s) {
        super(x, y, s);

        loadTexture("spaceship.png");
        setBoundaryPolygon(8);

        setAcceleration(200);
        setMaxSpeed(100);
        setDeceleration(10);
    }

    public void act(float delta) {
        super.act(delta);

        float degreesPerSecond = 120;
        
        if (Gdx.input.isKeyPressed(Keys.LEFT))
            rotateBy(degreesPerSecond * delta);
        if (Gdx.input.isKeyPressed(Keys.RIGHT))
            rotateBy(-degreesPerSecond * delta);
        if (Gdx.input.isKeyPressed(Keys.UP))
            accelerateAtAngle(getRotation());

        applyPhysics(delta);
        wrapAroundWorld();
    }
}