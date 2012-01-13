package com.slyvr.render;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import com.slyvr.beans.*;

public class Renderer {

	public static void render(GameContainer container, Graphics g, Global global){
		
		//Always last on list, on top
		renderMenu(g, global);
	}
	public static void renderMenu(Graphics g, Global global){
		
		//Current Menu
		Menu currentMenu = global.getCurrent().getMenu();
		if (currentMenu!=null){
			for (int i=0; i<currentMenu.getMenuItems().size(); i++){
				MenuItem item = currentMenu.getMenuItems().get(i);
				//item.getImg().getImage().draw(item.getX(),item.getY());
				if (item.getSheet()==null) item.getImg().getImage().draw(item.getPosition().getX(),item.getPosition().getY());
				else{
					item.getSheet().getSheet().getSubImage(item.getSubImgX(), item.getSubImgY()).draw(item.getPosition().getX(),item.getPosition().getY());
				}
			}
		}
		
		//Constants Menu
		Menu constant = global.getMenuByName("constant");
		if (constant!=null){
			for (int i=0; i<constant.getMenuItems().size(); i++){
				MenuItem item = constant.getMenuItems().get(i);
				item.getImg().getImage().draw(item.getPosition().getX(),item.getPosition().getY());
			}
		}
	}
}
