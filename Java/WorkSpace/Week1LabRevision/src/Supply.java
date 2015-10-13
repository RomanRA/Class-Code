
public class Supply extends Product {
	// private variables
	private String manufacturer;
	
	public Supply() {
		setManufacturer("");
	}
	
	public Supply(String n, String d, double p, int q, String t, String m) {
		setName(n);
		setDescription(d);
		setPrice(p);
		incrementQuantity(q);
		setType(t);
		manufacturer = m;
	}
	
	public void setManufacturer(String m) {
		manufacturer = m;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public String toString() {
		return super.toString() + 
				"   Manufacturer: " +getManufacturer();
	}
	
	// MAIN PROGRAM FOR TESTING PURPOSES
	public static void main(String[] args) {
		/*Supply s = new Supply("Fido's Flea Sudz", "Kills adult fleas and their eggs.", 10.00, 19, "Supply", "Hartz (USA)");
		System.out.println(s.toString());*/
	}

}
