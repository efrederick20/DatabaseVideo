import java.util.*;
public class CD extends Item { 				//CD inherits everything from the Item class and adds its own
	private String artist;					// private variables 
	private int numberOfTracks;

	public CD (String title1, String artist1, int tracks, int time) {		//constructor for CD class
		super(title1, time);												//inherits part of Item constructor
		numberOfTracks = tracks;
		artist = artist1;
	}
	
	public String getArtist() {								//returns artist of the CD
		return artist;
	}
	
	public int getNumberOfTracks() {							// returns the number of tracks in cd
		return numberOfTracks;
	}
	
	// prints the information about the cd in the preferred format
	
	public String toString() {
		return String.format("CD: " +super.getTitle()+ " (" +super.getTime()+ " mins)" + "\n" 
	+ artist + "\n" + " # tracks: " +numberOfTracks);
	}
	
	
}
