import java.util.*;
public class Item {							//private variables initialized
	private String comment;
	private boolean gotIt;
	private int playingTime;
	private String title;
	
	public Item(String title1, int time) 		//constructor for the item class
	{
		title = title1;
		playingTime = time;
	}
	
	public String getComment() {					// returns whatever value is stored in comment
		return comment;
	}
	
	public boolean getOwn() {					// returns the boolean for if something is in the library
		return gotIt;
	}
	
	public void setComment(String comment1) //stores the comment into the comment variable
	{
		comment = comment1;
	}
	
	public void setOwn(boolean ownIt) {     //sets the boolean value if something is in the library
		gotIt = ownIt;
	}

	public String getTitle() {			//returns title of the item 
		return title;
	}

	public int getTime() {					//returns the playing time of the item
		return playingTime;
	}
	 

}
