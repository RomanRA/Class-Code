/**
 * PetStore.java
 * Name: Richard Roman and Hubert Walton
 * Course: 490
 * Lab01
 * Email: raroman@coastal.edu / hewalton@coastal.edu
 * Date: 20/08/2014
 */
import java.io.*;
import java.util.*;

public class PetStore {
	Scanner input = new Scanner(System.in);
	private ArrayList<Product> inventory = new ArrayList<Product>();
	
	private int numItems = 0;
	private double currentBalance = 0;
	private String storeName = "";
	
	Cart theCart = new Cart();
	
	//Default Constructor
	public PetStore(){
		this.numItems = 0;
		this.currentBalance = 0;
		this.storeName = "PetMart";
		loadInventory();
	}
	
	//Constructor that takes only the name
	public PetStore(String aName){
		this.numItems = 0;
		this.currentBalance = 0;
		this.storeName = aName;
		loadInventory();	
	}
	
	public String getName(){
		return this.storeName;
	}
	
	public void setName(String aName){
		this.storeName = aName;
	}
	
	//get balance
	public double getBalance(){
		return this.currentBalance;
	}
	//add product takes a product pointer as a parameter and adds to the inventory array
	public void addProduct(Product product){
			inventory.add(product);
	}
	
	//load inventory
	public void loadInventory(){
		File inputFile = new File("psinventory.txt");
		Scanner input = new Scanner(inputFile);
		
		while(input.hasNext()){
			String tempType = input.next();
			
			if(tempType.equalsIgnoreCase("p")){
				String tempName = input.next();
				String tempDescription = input.next();
				int tempPrice = input.nextInt();
				int tempQuantity = input.nextInt();
				int tempInteraction = input.nextInt();
				String diet = input.next();
				double weight = input.nextDouble();
				
				Product newProduct = new Pet(tempName, tempDescription, tempPrice, tempQuantity, tempType, tempInteraction, diet, weight);
				
				addProduct(newProduct);
			}
			
			if(tempType.equalsIgnoreCase("s")){
				String tempName = input.next();
				String tempDescription = input.next();
				int tempPrice = input.nextInt();
				int tempQuantity = input.nextInt();
				String manufacturer = input.next();
				
				Product newProduct = new Supply(tempName, tempDescription, tempPrice, tempQuantity, tempType, manufacturer);
				
				addProduct(newProduct);
			}	
			input.next();
			
			this.numItems += 1;
		}
		input.close();
	}//end load inventory
	
	public void start(){
		int option = 0;
		int answer = 0;
		 
			while(answer!=5){
			
				System.out.println("Welcome to " +storeName+ " PetStore!");
				System.out.println("Please choose an option from the menu."+"\n"
						+ "1. Browse all Products (Pets and Supplies)"+ "\n"
						+ "2. Browse all Pets" + "\n"
						+ "3. Browse all Pets Supplies" + "\n"
						+ "4. Checkout" + "\n"
						+ "5. Exit" + "\n");
				
				answer = input.nextInt();
				
				if(answer==1){
					for(int index = 0; index < inventory.size(); index++){
						
						
						System.out.println(inventory.get(index).getName()+" . ");
						System.out.println("See details enter 1");
						option = input.nextInt();
						
						
						//details page
						if(option != 0){		
							
							System.out.println(inventory.get(index).getDescription()+" , "
							+ inventory.get(index).getPrice()+" , "
							+ inventory.get(index).getType()+" . ");
							
							//check if pet or supply object
							if(inventory.get(index).getType.equalsIgnoreCase("p")){
								
								System.out.println(inventory.get(index).getInteractionLevel()+" , "
								+ inventory.get(index).getDiet()+" , "
								+ inventory.get(index).getWeight()+" . ");
								
							}
							if(inventory.get(index).getType.equalsIgnoreCase("s")){
								System.out.println(inventory.get(index).getManufacturer();
								
							}
							
							System.out.println("Would you like add item to cart? yes/no");
							String option2 = input.next();
							
							if(option2.equalsIgnoreCase("yes")){
								Product theProduct = inventory.get(index);
								theCart.addProduct(theProduct);
							}
							
						}//end options
					}
				}
					
				else if(answer==2){
					for(int index = 0; index < inventory.size(); index++){
						if(inventory.get(index).getType().equalsIgnoreCase("pet")){
							System.out.println(inventory.get(index).getName()+" . ");
							System.out.println("See details enter 1");
							option = input.nextInt();
							
							if(option != 0){		
								System.out.println(inventory.get(index).getDescription()+" , "
								+ inventory.get(index).getPrice()+" , "
								+ inventory.get(index).getType()+" , "
								+ inventory.get(index).getInteractionLevel()+" , "
								+ inventory.get(index).getDiet()+" , "
								+ inventory.get(index).getWeight()+" . ");
								
								System.out.println("Would you like add item to cart? yes/no");
								String option2 = input.next();
								
								if(option2.equalsIgnoreCase("yes")){
									Product theProduct = inventory.get(index);
									theCart.addProduct(theProduct);
								}
							}
						}
					}//end for loop
				}
				else if(answer==3){
					for(int index = 0; index < inventory.size(); index++){
						if(inventory.get(index).getType().equalsIgnoreCase("supply")){
							System.out.println(inventory.get(index).getName()+" . ");
							System.out.println("See details enter 1");
							option = input.nextInt();
						}
						if(option != 0){		
							System.out.println(inventory.get(index).getDescription()+" , "
							+ inventory.get(index).getPrice()+" , "
							+ inventory.get(index).getType()+" , "
							+ inventory.get(index).getManufacturer()+" . ");
							
							System.out.println("Would you like add item to cart? yes/no");
							String option2 = input.next();
							
							if(option2.equalsIgnoreCase("yes")){
								Product theProduct = inventory.get(index);
								theCart.addProduct(theProduct);
							}
						}
					}//end for loop
					
				}
				else if(answer==4){

					checkout();
					
				}
				else{
					System.out.println("Please enter a valid option");
				}
			}//end while loop
				
				stop();
	}//end start
	
	public void checkout(){
		
		String aName = "";
		System.out.println("Please enter your name.");
		aName = input.next();
		
		currentBalance += theCart.checkout(aName);
		
		//theCart.emptyCart(); empty cart is done in cart checkout
	}//End checkout
	
	public void stop(){
		//implements the exit menu
		System.out.println("GoodBye");
		
		PrintWriter out = new PrintWriter("psinventory.txt");
		
		for(int index = 0; index < inventory.size(); index++){
			
			out.printf(inventory.get(index).getType()+","
			+ inventory.get(index).getName()+","
			+ inventory.get(index).getDescription()+","
			+ inventory.get(index).getPrice()+","
			+ inventory.get(index).getQuantity()+",");
			
			if(inventory.get(index).getType.equalsIgnoreCase("p"))
			{
				out.printf(inventory.get(index).getInteractionLevel()+","
				+ inventory.get(index).getDiet()+","
				+ inventory.get(index).getWeight()+"\n");
			}
			if(inventory.get(index).getType.equalsIgnoreCase("s"))
			{
				out.printf(inventory.get(index).getManufacturer()+"\n");
			}
			
		}
		out.close();//Close print writer/file
	}//End stop
	
	public String toString(){
		String text = "";
		
		text += this.numItems;
		text += this.currentBalance;
		text += this.storeName;
		
		return text;
	}//End toString
	

	public static void main(String[] args) {
		PetStore p = new PetStore();
		p.start();
			
	}//End main
}//End PetStore Class
	


