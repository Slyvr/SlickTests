package com.slyvr.init;

import java.util.ArrayList;

import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;

import com.slyvr.beans.*;

public class InitMusic {

	public static void init(Global global){
		ArrayList<Song> songs = new ArrayList<Song>();
		
		try{
			songs.add(new Song("Epoq-Lepidoptera",new Music("resources/music/Epoq-Lepidoptera.ogg")));
			
			songs.get(0).getSong().play();
		}catch(SlickException e){
			e.printStackTrace();
		}
		
		global.setSongs(songs);
	}
}
