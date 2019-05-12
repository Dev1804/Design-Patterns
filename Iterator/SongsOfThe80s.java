package Iterator.DesignPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import javax.lang.model.element.NestingKind;

public class SongsOfThe80s implements SongInterator{

SongInfo[] bestSongs;
	int arrayValue=0;
	public SongsOfThe80s(){
		bestSongs=new SongInfo[3];
		addSong("Roam", "B 52s", 1989);
		addSong("Cruel Summer", "Bananarama", 1984);
		addSong("Head Over Heels", "Tears For Fears", 1985);
	}
	
	public void addSong(String songName,String bandName,int yearReleased){
		
		SongInfo songInfo=new SongInfo(songName, bandName, yearReleased);
		bestSongs[arrayValue]=songInfo;
		arrayValue++;
	}
	
/*	public SongInfo[] getBestSongs(){
		return bestSongs;
	}*/


	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return Arrays.asList(bestSongs).iterator();
	}
}
