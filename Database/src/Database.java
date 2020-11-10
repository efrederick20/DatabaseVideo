import java.util.*;
public class Database {
	ArrayList <Item> list = new ArrayList<Item>(); //initializes arraylist of items 

	public Database() {
	} 						//constructor for database class
	
	public void addItem(Item item1) {
		list.add(item1);
		}								//adds the item to the arraylist
	
	public void list() {
		for(int i = 0; i < list.size(); i++)
		{
			 System.out.println(list.get(i));
		}
			 
	}//iterates through the list to print each item 
		
		public void search(Video.VideoType format) {
			ArrayList<Item> results = new ArrayList<Item>();
			
			for (Item item: list) {
			
				if (item.getClass() == Video.class) {
					
					
					if (((Video)item).contains(format)) {
						results.add( (Video)item);
				
				
			}
				}}
			
			System.out.printf("Your search returned %d result%s: \n\n", results.size(), results.size() == 1 ? "": "s");

			for (Item result : results) {
				System.out.println( result );
			}
			}
		public void search(String search1) {
			
			ArrayList<Item> results = new ArrayList<Item>();
			
			for (Item item: list) {
			
			if (item.getTitle() == search1) {
				results.add(item);
			}
		}
		}
	

	//tester code in main
public static void main(String [] args) {
	Database db = new Database();
	CD c = new CD("A Swingin' Affair", "Frank Sinatra", 16, 64);
	CD d = new CD("Big Bad World", "Plain White T's", 10, 35);
	Video x = new Video("Oh Brother, Where Art Thou?", "Joel and Ethan Coen", 106, Video.VideoType.Bluray);
	Video v = new Video("Oh Brother, Where Art Thou?", "Joel and Ethan Coen", 106, Video.VideoType.DVD );
	Video y = new Video("Infinty Wars", "Anthony and Joe Russo", 149, Video.VideoType.Bluray );
	
	db.addItem(c);
	db.addItem(d);
	db.addItem(x);
	db.addItem(v);
	db.addItem(y);

	//db.list();

	
	
	
	db.search("Oh Brother");
	db.search(Video.VideoType.DVD);
}
}
	


