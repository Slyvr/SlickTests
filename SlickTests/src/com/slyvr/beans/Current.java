package com.slyvr.beans;

import org.newdawn.slick.Music;

public class Current {

	private Menu menu;
	private Music song;
	
	public Current(){
	
	}
	
	//Current Menu
	public Menu getMenu(){
		return menu;
	}
	public void setMenu(Menu menu){
		this.menu=menu;
	}
	//Current Song
	public Music getSong(){
		return song;
	}
	public void setSong(Music song){
		this.song=song;
	}
}
