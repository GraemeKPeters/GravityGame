package com.mwiper.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mwiper.game.screens.MainMenu;

public class GravityGame extends Game {

	public SpriteBatch batch;
	@Override
	public void create () {
		batch = new SpriteBatch();
		setScreen(new MainMenu(this));
	}

	@Override
	public void dispose() {
		super.dispose();
		batch.dispose();
	}

}
