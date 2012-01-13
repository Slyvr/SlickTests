package com.slyvr.init;

import org.newdawn.slick.GameContainer;

import org.newdawn.slick.SlickException;

import com.slyvr.beans.*;

public class Initializer {

	public static void init(GameContainer container, Global global) throws SlickException{
		
		//container.setMouseGrabbed(true);
		
		InitImages.init(global);
		InitMenus.init(global);
		InitMusic.init(global);
		InitSounds.init(global);
	}
}
