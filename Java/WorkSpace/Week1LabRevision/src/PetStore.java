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
	private ArrayList<Product> inventory;
	private int numItems;
	private double currentBalance;
	private String storeName;
	private Cart theCart; 
	
	//Default Constructor
	public PetStore() throws FileNotFoundException{
		this.numItems = 0;
		this.currentBalance = 0;
		this.storeName = "PetMart";
		this.inventory = new ArrayList<Product>();
		this.theCart = new Cart();
		loadInventory();
	}
	
	//Constructor that takes only the name
	public PetStore(String aName) throws FileNotFoundException{
		this.numItems = 0;
		this.currentBalance = 0;
		this.storeName = aName;
		this.inventory = new ArrayList<Product>();
		this.theCart = new Cart();
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
			//System.out.println(product);
	}
	
	//load inventory
	public void loadInventory() throws FileNotFoundException{
		File inputFile = new File("psinventory.txt");
		Scanner input = new Scanner(inputFile);
		input.useDelimiter(",|\r\n");
		
		while(input.hasNext()){
			String tempType = input.next();
			
			if(tempType.equalsIgnoreCase("p")){
				String tempName = input.next();
				String tempDescription = input.next();
				double tempPrice = input.nextDouble();
				int tempQuantity = input.nextInt();
				int tempInteraction = input.nextInt();
				String diet = input.next();
				
				String weight = input.next();
				double newWeight = Double.parseDouble(weight);
				
				Product newProduct = new Pet(tempName, tempDescription, tempPrice, tempQuantity, tempType, tempInteraction, diet, newWeight);
				
				addProduct(newProduct);
			}
			
			if(tempType.equalsIgnoreCase("s")){
				String tempName = input.next();
				String tempDescription = input.next();
				double tempPrice = input.nextDouble();
				int tempQuantity = input.nextInt();
				String manufacturer = input.next();
				
				Product newProduct = new Supply(tempName, tempDescription, tempPrice, tempQuantity, tempType, manufacturer);
				
				addProduct(newProduct);
			}	
			//input.next();
			
			this.numItems += 1;
		}
		input.close();
	}//end load inventory
	
	public void start() throws FileNotFoundException{
		int option = 0;
		int answer = 0;
		Pet temp = new Pet(); //temporary Pet Object
		Supply tems = new Supply(); //temporary Supply Object
		 
			while(answer!=5){
			
				System.out.println("Welcome to " +storeName+ " PetStore!");
				System.out.println("Please choose an option from the menu."+"\n"
						+ "1. Browse all Products (Pets and Supplies)"+ "\n"
						+ "2. Browse all Pets" + "\n"
						+ "3. Browse all Supplies" + "\n"
						+ "4. Checkout" + "\n"
						+ "5. Exit" + "\n");
				
				answer = input.nextInt();
				
				if(answer==1){
					for(int index = 0; index < inventory.size(); index++){
						
						
						System.out.println(inventory.get(index).getName()+" . ");
						System.out.println("See details enter 1");
						System.out.println("To continue enter 0");
						option = input.nextInt();
						
						
						//details page
						if(option != 0){		
							
							System.out.println(inventory.get(index).getDescription()+" , "
							+ inventory.get(index).getPrice()+" , "
							+ inventory.get(index).getType()+" . ");
							
							//check if pet or supply object
							if(inventory.get(index).getType().equalsIgnoreCase("p")){
								temp = (Pet) inventory.get(index);
								//temporary Pet object
								
								System.out.println(temp.getInteractionLevel()+" , "
								+ temp.getDiet()+" , "
								+ temp.getWeight()+" . ");
								
							}
							if(inventory.get(index).getType().equalsIgnoreCase("s")){
								tems = (Supply) inventory.get(index);
								//temporary Supply object
								
								System.out.println(tems.getManufacturer());
								
							}
							
							System.out.println("Would you like add item to cart? yes/no");
							String option2 = input.next();
							
							if(option2.equalsIgnoreCase("yes")){
								Product theProduct = inventory.get(index);
								theCart.addProduct(theProduct);
								System.out.println();
							}
							
						}//end options
					}//end for
				}
					
				else if(answer==2){
					for(int index = 0; index < inventory.size(); index++){
						if(inventory.get(index).getType().equalsIgnoreCase("p")){
							System.out.println(inventory.get(index).getName()+" . ");
							System.out.println("See details enter 1");
							System.out.println("To continue enter 0");
							option = input.nextInt();
							
							if(option != 0){		
								temp = (Pet) inventory.get(index);
								//temporary Pet object
								
								System.out.println(inventory.get(index).getDescription()+" , "
								+ temp.getPrice()+" , "
								+ temp.getType()+" , "
								+ temp.getInteractionLevel()+" , "
								+ temp.getDiet()+" , "
								+ temp.getWeight()+" . ");
								
								System.out.println("Would you like add item to cart? yes/no");
								String option2 = input.next();
								
								if(option2.equalsIgnoreCase("yes")){
									Product theProduct = inventory.get(index);
									theCart.addProduct(theProduct);
									System.out.println();
								}
								
							}
						}
					}//end for loop
				}
				else if(answer==3){
					for(int index = 0; index < inventory.size(); index++){
						if(inventory.get(index).getType().equalsIgnoreCase("s")){
							System.out.println(inventory.get(index).getName()+" . ");
							System.out.println("See details enter 1");
							System.out.println("To continue enter 0");
							option = input.nextInt();
						}
						if(option != 0){		
							tems = (Supply) inventory.get(index);
							//temporary Supply object
							
							System.out.println(inventory.get(index).getDescription()+" , "
							+ tems.getPrice()+" , "
							+ tems.getType()+" , "
							+ tems.getManufacturer()+" . ");
							
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
				else if(answer==5){
					stop();
				}
				else{
					System.out.println("Please enter a valid option");
				}
			}//end while loop
	}//end start
	
	public void checkout(){
		
		String aName = "";
		System.out.println("Please enter your name.");
		aName = input.next();
		System.out.println();
		
		currentBalance += theCart.checkout(aName);
		
		//theCart.emptyCart(); empty cart is done in cart checkout
	}//End checkout
	
	public void stop() throws FileNotFoundException{
		Pet temp = new Pet(); //temporary Pet Object
		Supply tems = new Supply(); //temporary Supply Object
		//implements the exit menu
		System.out.println("GoodBye");
		
		PrintWriter out = new PrintWriter("psinventory.txt");
		
		for(int index = 0; index < inventory.size(); index++){
			
			out.printf(inventory.get(index).getType()+","
			+ inventory.get(index).getName()+","
			+ inventory.get(index).getDescription()+","
			+ inventory.get(index).getPrice()+","
			+ inventory.get(index).getQuantity()+",");
			
			if(inventory.get(index).getType().equalsIgnoreCase("p"))
			{
				temp = (Pet) inventory.get(index);
				//temporary Pet object
				out.printf(temp.getInteractionLevel()+","
				+ temp.getDiet()+","
				+ temp.getWeight()+"\n");
			}
			if(inventory.get(index).getType().equalsIgnoreCase("s"))
			{
				tems = (Supply) inventory.get(index);
				//temporary Supply object
				out.printf(tems.getManufacturer()+"\n");
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
	

	public static void main(String[] args) throws FileNotFoundException {
		PetStore p = new PetStore();
		p.start();
			
	}//End main
}//End PetStore Class
	


