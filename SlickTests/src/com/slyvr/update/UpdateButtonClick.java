package com.slyvr.update;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.geom.Rectangle;

import com.slyvr.beans.*;
import com.slyvr.tools.Tools;

public class UpdateButtonClick {

	static Input prevInput;
	static Menu prevMenu;
	
	public static void update(GameContainer container, Global global){
		Input input = container.getInput();
		//Check current menu button clicks
		if (input.isMousePressed(Input.MOUSE_LEFT_BUTTON) && !prevInput.isMousePressed(Input.MOUSE_LEFT_BUTTON)){
			Color[] mouseColor = new Color[1];
			mouseColor[0] = new Color(1,1,1);
			Rectangle mousePosition = new Rectangle(input.getMouseX(),input.getMouseY(),1,1);
			for(int i=0; i<global.getCurrent().getMenu().getMenuItems().size(); i++){
				MenuItem item = global.getCurrent().getMenu().getMenuItems().get(i);
				if (item.getImg()==null && item.getSheet()==null){
				}
				else{
					//Helps performance
					if (item.getPosition().intersects(mousePosition)){
						Image img = null;
						if (item.getImg()!=null) img = item.getImg().getImage();
						else if (item.getSheet()!=null)img = item.getSheet().getSheet().getSubImage(item.getSubImgX(), item.getSubImgY());
						Color[] imgColor = Tools.getColorData(img);
						Boolean collision = Tools.IntersectPixels(mousePosition, mouseColor, item.getPosition(), imgColor);
						if(!collision){
							//Collision found
							if (item.getName().contains("btn")) global.getSoundByName("cursor1").getSfx().play();
							if (item.getName().equals("btn_exit")){
								container.exit();
								break;
							}
							if (item.getName().equals("btn_options")){
								prevMenu = global.getCurrent().getMenu();
								global.getCurrent().setMenu(global.getMenuByName("options"));
								break;
							}
							if (item.getName().equals("btn_back")){
								global.getCurrent().setMenu(prevMenu);
								break;
							}
							if (item.getName().equals("btn_play")){
								global.getCurrent().setMenu(global.getMenuByName("play"));
								break;
							}
						}
					}
				}
			}
		}
		prevInput = input;
	}
}
