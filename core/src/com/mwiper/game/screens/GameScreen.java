package com.mwiper.game.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mwiper.game.GravityGame;
import com.mwiper.game.utils.Constants;
import com.mwiper.game.utils.WorldUtils;

/**
 * Created by Matt on 11/4/2015.
 */
public class GameScreen implements Screen {

    private World world;
    private Body ground;
    private Box2DDebugRenderer renderer;

    private GravityGame game;

    private OrthographicCamera gameCamera;

    private Viewport gamePort;
    public GameScreen(GravityGame game) {
        this.game = game;

        world = WorldUtils.createWorld();
        ground = WorldUtils.createGround(world);

        renderer = new Box2DDebugRenderer();

        setupCamera();
    }
    private void setupCamera(){
        gameCamera = new OrthographicCamera(20, 13);
        gameCamera.position.set(gameCamera.viewportWidth / 2, gameCamera.viewportHeight / 2, 0f);
        gameCamera.update();
    }
    @Override
    public void render(float delta) {

        //Clear the game screen with Black
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        renderer.render(world, gameCamera.combined);
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void show() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}
