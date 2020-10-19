import java.util.*;
public class DVD extends Item {		// DVD class inherits the Item class but adds its own private variable

	private String director;
	
public DVD (String title1, String director1, int time) {      //constructor for DVD class
	super(title1, time);										// inherits part of the item constructor
	director = director1;
}

public String getDirector() {						//returns the director of the DVD
	return director;
}

// prints the information on the DVD in the preferred format

public String toString() {
	return String.format("DVD: " +super.getTitle()+ " (" +super.getTime()+ " mins)" 
			+ "\n" + director);
}
}
