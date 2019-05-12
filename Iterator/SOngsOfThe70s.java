package Iterator.DesignPattern;
import java.util.*;

public class SOngsOfThe70s implements SongInterator {

	ArrayList<SongInfo> bestSongs;
	
	public SOngsOfThe70s(){
		bestSongs=new ArrayList<SongInfo>();
		addSong("Imagine","John Lennon",1971);
		addSong("American Pie","Don McLean",1971);
		addSong("I will Survive","Gloria Gaynor",1978);
	}
	
	public void addSong(String songName,String bandName,int yearReleased){
		
		SongInfo songInfo=new SongInfo(songName, bandName, yearReleased);
		bestSongs.add(songInfo);
	}
	
	/*public ArrayList<SongInfo> getBestSongs(){
		return bestSongs;
	}*/


	public Iterator createIterator() {
		
		return bestSongs.iterator();
	}
}
