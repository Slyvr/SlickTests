package com.slyvr.init;

import java.util.ArrayList;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

import com.slyvr.beans.*;

public class InitImages {

	public static void init(Global global){
		ArrayList<Img> images = new ArrayList<Img>();
		ArrayList<ImgSheet> sheets = new ArrayList<ImgSheet>();
		
		try{
			images.add(new Img(new Image("resources/imgs/btn_cursor.png"),"btn_cursor"));
			images.add(new Img(new Image("resources/imgs/btns.png"),"btns"));
			
			sheets.add(new ImgSheet(new SpriteSheet(new Image("resources/imgs/btns.png"),193,58), "btns"));
		}catch(SlickException e){
			e.printStackTrace();
		}
		
		global.setSheets(sheets);
		global.setImages(images);
	}
}
