// Hello! This Cart class was made by Jonathan O'Brien for CSCI 490 at CCU.

import java.util.*;
import java.io.*;
import java.text.*;

public class Cart{
	// Data
	public static final int MAX_ITEMS = 500;
	public static final double TAX = .10;

	public Product[] cart;
	public int numItems;

	// Constructors
	public Cart(){
		cart = new Product[500];
		numItems = 0;
	}

	// Functions
	public String toString(){
		String output = "";
		for(int i=0; i<numItems; i++){
			output += cart[i].toString() + "\n";
		}
		output += "Number of items: " + numItems + "\n";
		return output;
	}

	public void addProduct(Product p){
		cart[numItems] = p;
		numItems++;
	}

	public void emptyCart(){
		for(int i = 0; i < numItems; i++){
			cart[i] = null;
		}
		numItems = 0;
	}

	public double calculateSubtotal(){
		double subtotal= 0;
		for(int i = 0; i < numItems; i++){
			subtotal += cart[i].getPrice();
		}
		return subtotal;
	}

	public double checkout(String name){
		double subtotal = this.calculateSubtotal();
		double grandTotal = 0;
		double discount = 0;
		double taxed_amount = 0;
		String receipt = "";
		String filename = "";
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy_HH-mm-ss-SSS_");

		// Calculate grand total by applying a discount if possible then charging tax
		if(subtotal >= 100.0){
			// Ten percent discount on purchases of 100 or more
			discount = subtotal * .1;
		}
		taxed_amount = (subtotal - discount) * (1 - TAX);
		grandTotal = subtotal - discount + taxed_amount;

		
		// prepare the receipt
		// Print the customer's name
		receipt = "Customer: " + name + "\n";
		// Print the contents of the cart
		receipt += this.toString();
		// Print Subtotal
		receipt += "\nSubtotal: $" + subtotal;
		// Print Discount
		receipt += "\nDiscount: -$" + discount;
		// Print Taxed amount
		receipt += "\nTax: $" + taxed_amount;
		//Print Grand Total
		receipt += "\nGrand Total: $" + grandTotal;
		
		// Now, print the receipt.
		System.out.println(receipt);

		// Next, we have to save the file. We will use the date and time plus the name to generate the filename.
		filename = dateFormat.format(now) + name + ".txt";
		Writer writer = null;
		try{
		    writer = new BufferedWriter(new OutputStreamWriter(
		          new FileOutputStream(filename), "utf-8"));
		    writer.write(receipt);
		}
		catch (IOException ex) {
			System.out.println("ERROR: Unable to write receipt to file: " + filename + ". Sorry.");
		}
		finally {
		   try {
			   writer.close();
		   }
		   catch (Exception ex) {
			   
		   }
		}

		// Decrement quantity of products
		for(int i = 0; i < numItems; i++){
			cart[i].decrementQuantity(1);
		}
		
		// Empty the cart
		this.emptyCart();

		// Return the Grand Total.
		return grandTotal;
	}
}

// Just letting you know that this is still made by Jonathan O'Brien.