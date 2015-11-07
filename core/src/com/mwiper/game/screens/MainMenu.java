package com.mwiper.game.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mwiper.game.GravityGame;
import com.mwiper.game.utils.Constants;

/**
 * Created by Matt on 11/4/2015.
 */
public class MainMenu implements Screen{
    Game game;
    private Viewport viewport;
    private Stage stage;

    public MainMenu(Game game){
        this.game = game;
        viewport = new FitViewport(Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT, new OrthographicCamera());
        stage = new Stage(viewport, ((GravityGame) game).batch);

        Label.LabelStyle font = new Label.LabelStyle(new BitmapFont(), Color.WHITE);

        Table table = new Table();
        table.center();
        table.setFillParent(true);

        Label gameLabel = new Label("Gravity", font);
        Label playLabel = new Label("Click to Play!", font);

        table.add(gameLabel).expandX();
        table.row();
        table.add(playLabel).expandX().padTop(10f);

        stage.addActor(table);
    }
    @Override
    public void render(float delta) {
        if(Gdx.input.justTouched()) {

        }
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.draw();
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
