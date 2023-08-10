package genericsLambdas;

import java.util.ArrayList;

public class Product {
	//define the instance variables for 'name' and 'price'
	private String name;
	private Double price;

	//define a public constructor for Product that takes a name and price as input and sets the instance variables accordingly
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	private Double getPrice() {
		return price;
	}
	public static void main(String[] args) {
		//Make an Inventory object that holds Products
		//Add as many products as you want to your Inventory Object using the addItem() method you defined 
		Inventory<Product> children = new Inventory<>();
		children.addItem(new Product("StitchShirt", 5.50));
		children.addItem(new Product("StitchShorts", 10.50));
		children.addItem(new Product("SpiderManShirt", 5.00));
		children.addItem(new Product("SpidermanShoes", 15.50));
		children.addItem(new Product("ladyBugShirt", 5.50));
		children.addItem(new Product("ladybugshoes", 5.50));

		//Your task is to calculate the total price of all products in an Inventory object called myInventory. Follow these steps:
		//1. Call the getItems method on your inventory object to retrieve the list of all products.
		//2. Convert this list into a stream by calling the stream method.
		//3. Apply the mapToDouble operation to this stream. The operation should be applied to each Product object 
		//	 	in the stream, converting it into its price. Use the lambda expression product -> product.price to 
		//		perform this conversion. This expression means "for each product, return its price".
		//4. Apply the sum operation to the stream to get the total price of all products.
		//5. Store this total price in a double variable called priceTotal.
		//6. Print out priceTotal to the console to make sure you are properly summing your Products!
		ArrayList<Product> myInventory = children.getItems();
		Double priceTotal = myInventory.stream().mapToDouble(x -> x.getPrice()).sum();
		System.out.println(priceTotal);
		
		
		
		//Helpful documentation:
		//https://www.baeldung.com/java-stream-sum#using-streamsum-with-objects

	}

}