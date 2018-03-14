package week6ACD;

public class CD {
	Song[] songs = new Song[10];
	String title;
	
	// Title
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	// songlist
	public void addSong(Song song) {
		int a=0;
		// While-loop to add a single item to a array where the value is null
		
			while (a < songs.length) {
				if (songs[a] == null) {
					songs[a] = song;
					return;
				}
				a++;
			}
		//if(){
			//System.out.println("The maximum amount of songs that can be placed on a CD is 10");
		//}
	//}
	
	public void getLenght() {
		System.out.println("The amount of songs on the CD is " + songs.length);
	}
	
	public void printLongestTrack() {
		int a=0;
		int HighestAmount = 0;
		int b=0;
		
		while(a < songs.length) {
			if(songs[a].getLength() > HighestAmount){
				HighestAmount = songs[a].getLength();
				b = a;
			}
		}
		System.out.println("*** Longest Track on CD: 1984 ***");
		System.out.println("Track "+ b +": " + songs[b].getTitle()+", "+ songs[b].getLength()+ " sec.");
	}
	
	public void printInfo() {
		
		int a=0;
		
		while(a < songs.length) {
			if(songs[a] == null) {
				return;
			}else {
				System.out.println("*** CD Inofromation ***");
				System.out.println("Track "+ a +": " + songs[a].getTitle()+", "+ songs[a].getLength()+ " sec.");
			}
		
		}
	}	
	
}
