package com.mwiper.game.utils;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;

/**
 * Created by Matt on 11/7/2015.
 */
public class WorldUtils {

    public static World createWorld(){
        return new World(Constants.WORLD_GRAVITY, true);
    }

    public static Body createGround(World world){
        BodyDef bodyDef = new BodyDef();
        bodyDef.position.set(new Vector2(Constants.GROUND_X, Constants.GROUND_Y));
        Body body = world.createBody(bodyDef);
        PolygonShape shape = new PolygonShape();
        shape.setAsBox(Constants.GROUND_WIDTH /2, Constants.GROUND_HEIGHT/2);
        body.createFixture(shape, Constants.GROUND_DENSITY);
        shape.dispose();
        return body;
    }

    public static Body createPlayer(World world){
        BodyDef bodyDef = new BodyDef();
        bodyDef.type = BodyDef.BodyType.DynamicBody;
        bodyDef.position.set(50f, 50f);
        PolygonShape shape = new PolygonShape();
        shape.setAsBox(5f,5f);
        Body body = world.createBody(bodyDef);
        body.createFixture(shape, 0.5f);
        body.resetMassData();
        shape.dispose();
        return body;
    }

    public void movePlayer(Body player){
    }
}
