
public class Pet extends Product {
	// private variables
	private int interactionLevel;
	private String diet;
	private double weight;
	
	public Pet() {
		interactionLevel = 0;
		diet = "";
		weight = 0.0;
	}
	
	public Pet(String n, String desc, double p, int q, String t, int i, String d, double w) {
		setName(n);
		setDescription(desc);
		setPrice(p);
		incrementQuantity(q);
		setType(t);
		interactionLevel = i;
		diet = d;
		weight = w;
	}
	
	public void setInteractionLevel(int i) {
		interactionLevel = i;
	}
	
	public int getInteractionLevel() {
		return interactionLevel;
	}
	
	public void setDiet(String d) {
		diet = d;
	}
	
	public String getDiet() {
		return diet;
	}
	
	public void setWeight(double w) {
		weight = w;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public String toString() {
		return super.toString() + 
				"   Interaction Level: " +interactionLevel+ 
				"   Diet: " +diet+ 
				"   Weight: " +String.format("%.2f", weight)+ " lbs.";
	}
	
	// MAIN PROGRAM FOR TESTING PURPOSES
	public static void main(String[] args) {
		/*Pet p = new Pet("Chihuahua", "A small and very loyal breed of dog. This breed is known to be very aggressive and will attack when threatened.", 599.99, 1, "Pet", 3, "Blue Buffalo", 6.1);
		System.out.println(p.toString());*/
	}
	

}
