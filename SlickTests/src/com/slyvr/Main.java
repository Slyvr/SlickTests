package com.slyvr;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import com.slyvr.beans.Global;
import com.slyvr.init.Initializer;
import com.slyvr.render.Renderer;
import com.slyvr.update.Updater;

public class Main extends BasicGame {

	static int screenWidth=800;
	static int screenHeight=600;
	static Global global;
	
	public Main() {
		super("ThisIsTheTitle");
	}
	
	@Override
	public void init(GameContainer container) throws SlickException {
		global = new Global();
		Initializer.init(container, global);
	}

	@Override
	public void update(GameContainer container, int delta) throws SlickException {
		Updater.update(container, delta, global);
	}
	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		Renderer.render(container, g, global);
	}
	
	public static void main(String[] args) {
		try{
			AppGameContainer app = new AppGameContainer(new Main());
			app.setDisplayMode(screenWidth, screenHeight, false);
			app.start();
		}catch(SlickException e){
			e.printStackTrace();
		}
	}
}
