package com.slyvr.init;

import java.util.ArrayList;

import org.newdawn.slick.geom.Rectangle;

import com.slyvr.beans.*;

public class InitMenus {

	static int width = 193;
	static int height = 58;
	public static void init(Global global){
		
		global.setMenus(new ArrayList<Menu>());
		
		global.getMenus().add(initConstant(global));
		global.getMenus().add(initMain(global));
		global.getMenus().add(initOptions(global));
		global.getMenus().add(initPause(global));
		global.getMenus().add(initGame(global));
		
		global.getCurrent().setMenu(global.getMenuByName("main"));
	}
	public static Menu initConstant(Global global){
		Menu menu = new Menu();
		ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();
		
		try{
			menuItems.add(new MenuItem("btn_cursor",global.getImageByName("btn_cursor"),new Rectangle(0,0,30,30)));
		}catch(Exception e){
			e.printStackTrace();
		}
		
		menu.setName("constant");
		menu.setMenuItems(menuItems);
		return menu;
	}
	public static Menu initMain(Global global){
		Menu menu = new Menu();
		ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();
		
		try{
			menuItems.add(new MenuItem("btn_play",global.getSheetByName("btns"),0,1,new Rectangle(300,200,width,height)));
			menuItems.add(new MenuItem("btn_options",global.getSheetByName("btns"),0,2,new Rectangle(300,280,width,height)));
			menuItems.add(new MenuItem("btn_exit",global.getSheetByName("btns"),0,4,new Rectangle(300,360,width,height)));
		}catch(Exception e){
			e.printStackTrace();
		}
		
		menu.setName("main");
		menu.setMenuItems(menuItems);
		return menu;
	}
	public static Menu initOptions(Global global){
		Menu menu = new Menu();
		ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();
		
		try{
			menuItems.add(new MenuItem("btn_back",global.getSheetByName("btns"),0,6,new Rectangle(300,360,width,height)));
		}catch(Exception e){
			e.printStackTrace();
		}
		
		menu.setName("options");
		menu.setMenuItems(menuItems);
		return menu;
	}
	public static Menu initPause(Global global){
		Menu menu = new Menu();
		ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();
		
		try{
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		menu.setName("pause");
		menu.setMenuItems(menuItems);
		return menu;
	}
	public static Menu initGame(Global global){
		Menu menu = new Menu();
		ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();
		
		try{
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		menu.setName("game");
		menu.setMenuItems(menuItems);
		return menu;
	}
}
