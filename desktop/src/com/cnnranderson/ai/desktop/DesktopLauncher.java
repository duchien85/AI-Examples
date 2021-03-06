package com.cnnranderson.ai.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.cnnranderson.ai.Application;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = Application.TITLE + " v" + Application.VERSION;
		config.width = Application.V_WIDTH;
		config.height = Application.V_HEIGHT;
		config.backgroundFPS = 60;
		config.foregroundFPS = 60;
		new LwjglApplication(new Application(), config);
	}
}
