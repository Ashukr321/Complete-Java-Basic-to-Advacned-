class Song{

	// here we use final bec, we don't want to external modify  data member of the Song class
	private final   String title;
	private final   String artist ;
	private final   int duration;

	//constructor
	public Song(String title,String artist,int duration){
		this.title = title;
		this.artist = artist;
		this.duration = duration;
	}
	public String getArtist() {
		return artist;
	}

	public int getDuration() {
		return duration;
	}

	public String getTitle() {
		return title;
	}

}

public class MusicPlayListManager {
	public static void main(String[] args) {

	}
}
