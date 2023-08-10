package genericsLambdas;

import java.util.List;
import java.util.ArrayList;

//Add a type parameter to the Inventory class to say that it works with a generic type
public class Inventory<G> {

//Define a list instance variable that takes a generic type parameter 
	private ArrayList<G> inventoryItems;
//Define a public constructor with no parameters that sets the list instance variable to an empty list
//(you can choose the type of list you want)
	public Inventory() {
		inventoryItems = new ArrayList<>();
	}


//Define a function that returns all items in the list instance variable
public ArrayList<G> getItems() {
	return inventoryItems;
}

//Define a function that takes an item of any type as input and adds it to the list
public void addItem(G item) {
	inventoryItems.add(item);
}
//Define a funciton that takes an item of any type as input, removes it from the list, and then returns 
//the updated list
public ArrayList<G> removeitem(G item) {
	inventoryItems.remove(item);
	return inventoryItems;
	
}

//Define a function that returns the number of items currently in the list
public int getNumitems() {
	return inventoryItems.size();
}

}