package Iterator.DesignPattern;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class DiscJockey {

	SOngsOfThe70s songs70s;
	SongsOfThe80s songs80s;
	SongsOfThe90s songs90s;
	SongInterator iter70sSongs;
	SongInterator iter80sSongs;
	SongInterator iter90sSongs;

	public DiscJockey(SongInterator newsongs70s, SongInterator newsongs80s, SongInterator newsongs90s) {
		iter70sSongs = newsongs70s;
		iter80sSongs = newsongs80s;
		iter90sSongs = newsongs90s;

	}

	/*public void showTheSongs() {
		ArrayList aL70sSongs = songs70s.getBestSongs();
		System.out.println("Songs of the 70s\n");

		for (int i = 0; i < aL70sSongs.size(); i++) {
			SongInfo bestSongs = (SongInfo) aL70sSongs.get(i);
			System.out.println(bestSongs.getSongName());
			System.out.println(bestSongs.getBandName());
			System.out.println(bestSongs.getYearReleased());
		}

		SongInfo[] array80sSongs = songs80s.getBestSongs();
		System.out.println("Songs of the 80s\n");

		for (int i = 0; i < array80sSongs.length; i++) {
			SongInfo bestSongs = array80sSongs[i];
			System.out.println(bestSongs.getSongName());
			System.out.println(bestSongs.getBandName());
			System.out.println(bestSongs.getYearReleased());
			System.out.println();
		}

		Hashtable<Integer, SongInfo> hashtable90sSongs = songs90s.getBestSongs();
		System.out.println("Songs of the 90s\n");

		for (int i = 0; i < hashtable90sSongs.size(); i++) {
			SongInfo bestSongs = (SongInfo) hashtable90sSongs.get(i);
			System.out.println(bestSongs.getSongName());
			System.out.println(bestSongs.getBandName());
			System.out.println(bestSongs.getYearReleased());
			System.out.println();
		}

		for (Enumeration<Integer> e = hashtable90sSongs.keys(); e.hasMoreElements();) {

			SongInfo bestSongs = hashtable90sSongs.get(e.nextElement());
			System.out.println(bestSongs.getSongName());
			System.out.println(bestSongs.getBandName());
			System.out.println(bestSongs.getYearReleased());
			System.out.println();
		}
	}*/

	public void showTheSongs2(){
		Iterator songs70s=iter70sSongs.createIterator();
		Iterator songs80s=iter80sSongs.createIterator();
		Iterator songs90s=iter90sSongs.createIterator();
		
		System.out.println("Songs of the 70s\n");
		printTheSongs(songs70s);
		
		System.out.println("Songs of the 80s\n");
		printTheSongs(songs80s);
		
		System.out.println("Songs of the 90s\n");
		printTheSongs(songs90s);
		
	}
	
	public void printTheSongs(Iterator iterator){
		while(iterator.hasNext()){
			SongInfo songInfo=(SongInfo) iterator.next();
			System.out.println(songInfo.getSongName());
			System.out.println(songInfo.getBandName());
			System.out.println(songInfo.getYearReleased());
		}
	}

}
