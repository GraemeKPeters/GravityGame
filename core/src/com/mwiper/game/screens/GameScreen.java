package com.mwiper.game.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.viewport.FillViewport;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mwiper.game.GravityGame;
import com.mwiper.game.utils.Constants;

/**
 * Created by Matt on 11/4/2015.
 */
public class GameScreen implements Screen {

    private GravityGame game;

    private OrthographicCamera gameCamera;

    private Viewport gamePort;
    public GameScreen(GravityGame game) {
        this.game = game;

        gameCamera = new OrthographicCamera();

        gamePort = new FitViewport(Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT, gameCamera);




    }

    @Override
    public void render(float delta) {

        //update(delta);

        //Clear the game screen with Black
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
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
