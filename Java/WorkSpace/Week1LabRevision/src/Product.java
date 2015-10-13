
public class Product {
	
	// private variables
	private String name;
	private String description;
	private double price;
	private int quantity;
	private String type;
	
	public Product() {
		name = "";
		description = "";
		price = 0.0;
		quantity = 0;
		type = "";
	}
	
	public Product(String n, String d, double p, int q, String t) {
		name = n;
		description = d;
		price = p;
		quantity = q;
		type = t;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setDescription(String d) {
		description = d;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setPrice(double p) {
		price = p;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setType(String t) {
		type = t;
	}
	
	public String getType() {
		return type;
	}
	
	public void incrementQuantity(int q) {
		quantity += q;
	}
	
	public void decrementQuantity(int q) {
		quantity -= q;
	}
	
	//need get and setters for quantity
	public int getQuantity(){
			return quantity;
	}
	
	public void setQuantity( int aQuantity){
			quantity = aQuantity;
	}
	
	public String toString() {
		return "Name: " +getName()+ 
				"   Description: " +getDescription()+ 
				"   Type: " +getType()+ 
				"   Price: $" +String.format("%.2f", getPrice())+ 
				"   Quantity: " +quantity;
	}
	
	// MAIN PROGRAM FOR TESTING PURPOSES
	public static void main(String[] args) {
		/*Product p = new Product("Fido's Flea Sudz", "Kills adult fleas and their eggs.", 10.00, 19, "Supply");
		System.out.println(p.toString());*/
	}

}
