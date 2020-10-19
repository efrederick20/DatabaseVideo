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
			 
	}											//iterates through the list to print each item 
	}

	//tester code in main
public static void main(String [] args) {
	Database db = new Database();
	CD c = new CD("A Swingin' Affair", "Frank Sinatra", 16, 64);
	CD d = new CD("Big Bad World", "Plain White T's", 10, 35);
	DVD v = new DVD("O Brother, Where Art Thou?", "Joel & Ethan Coen", 106);
	
	db.addItem(c);
	db.addItem(d);
	db.addItem(v);
	
	db.list();
}
}
	


