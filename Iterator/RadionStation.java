package Iterator.DesignPattern;

public class RadionStation {

	public static void main(String[] args) {
		SOngsOfThe70s songs70s=new SOngsOfThe70s();
		SongsOfThe80s songs80s=new SongsOfThe80s();
		SongsOfThe90s songs90s=new SongsOfThe90s();
		
		DiscJockey madMike=new DiscJockey(songs70s, songs80s, songs90s);
		madMike.showTheSongs2();
		
		
		
	}
}
