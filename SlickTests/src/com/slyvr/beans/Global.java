package com.slyvr.beans;

import java.util.ArrayList;

public class Global {

	private Current current;
	private ArrayList<Img> images;
	private ArrayList<ImgSheet> sheets;
	private ArrayList<Menu> menus;
	private ArrayList<Song> songs;
	private ArrayList<Sfx> sounds;
	
	public Global(){
		current=new Current();
	}
	
	//Current
	public Current getCurrent(){
		return current;
	}
	public void setCurrent(Current current){
		this.current=current;
	}
	//Images
	public ArrayList<Img> getImages(){
		return images;
	}
	public void setImages(ArrayList<Img> images){
		this.images=images;
	}
	public Img getImageByName(String name){
		for (int i=0; i<images.size(); i++){
			if (images.get(i).getName().equals(name)){
				return images.get(i);
			}
		}
		return null;
	}
	//Sheets
	public ArrayList<ImgSheet> getSheets(){
		return sheets;
	}
	public void setSheets(ArrayList<ImgSheet> sheets){
		this.sheets=sheets;
	}
	public ImgSheet getSheetByName(String name){
		for(int i=0; i<sheets.size(); i++){
			if (sheets.get(i).getName().equals(name)) return sheets.get(i);
		}
		return null;
	}
	//Menus
	public ArrayList<Menu> getMenus(){
		return menus;
	}
	public void setMenus(ArrayList<Menu> menus){
		this.menus=menus;
	}
	public Menu getMenuByName(String name){
		for (int i=0; i<menus.size(); i++){
			if (menus.get(i).getName().equals(name)){
				return menus.get(i);
			}
		}
		return null;
	}
	//Songs
	public ArrayList<Song> getSongs(){
		return songs;
	}
	public void setSongs(ArrayList<Song> songs){
		this.songs=songs;
	}
	public Song getSongByName(String name){
		for (int i=0; i<songs.size(); i++){
			if (songs.get(i).getName().equals(name)){
				return songs.get(i);
			}
		}
		return null;
	}
	//Sounds
	public ArrayList<Sfx> getSounds(){
		return sounds;
	}
	public void setSounds(ArrayList<Sfx> sounds){
		this.sounds=sounds;
	}
	public Sfx getSoundByName(String name){
		for (int i=0; i<sounds.size(); i++){
			if (sounds.get(i).getName().equals(name)){
				return sounds.get(i);
			}
		}
		return null;
	}
}
