import java.util.*;
public class Video extends Item {		// DVD class inherits the Item class but adds its own private variable

	private String director;
	private VideoType type;
	
public Video (String title1, String director1, int time, VideoType type) {      //constructor for DVD class
	super(title1, time);	
	this.type = type;
										// inherits part of the item constructor
	director = director1;
}

public String getDirector() {						//returns the director of the DVD
	return director;
}

//returns true if VideoType contains the searched type
	public boolean contains(Video.VideoType type1) {
	
		if (type == type1) {
			return true;	
		}
		
		return false;
	}

public enum VideoType {
	
	Bluray, VHS, DVD ;
	public String toString() {
		switch(this) {
			case Bluray:
				return "Bluray";
			case VHS:
				return "VHS";
			case DVD:
				return "DVD";
			default: throw new IllegalArgumentException();		
		}
	}		
}

public String toString() {
	return String.format(type +super.getTitle()+ " (" +super.getTime()+ " mins)" 
			+ "\n" + director);
}
}
