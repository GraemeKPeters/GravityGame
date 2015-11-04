package com.mwiper.game;

import com.badlogic.gdx.Game;
import com.mwiper.game.screens.MainMenu;

public class GravityGame extends Game {
	
	@Override
	public void create () {
		setScreen(new MainMenu());
	}

}
