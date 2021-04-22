package com.cs2.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.cs2.game.Donkeys;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title="Donkeys";
		config.width=800;
		config.height=480;
		new LwjglApplication(new Donkeys(), config);
	}
}
