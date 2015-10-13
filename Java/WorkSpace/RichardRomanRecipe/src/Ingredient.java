/**
 * 	Ingredient.java
 *  @author Richard Roman and Hubert Walton
 *	Course: 490
 *	Date 9/12/2014
 *	email: raroman@coastal.edu
 */
public class Ingredient implements Comparable {
	
	private int id;
	private String name;
	private String category;
	private String measurement;
	private double price;
	private int calories;
	private int protein;
	private int carbs;
	private int fat;
	
	public Ingredient(){
		 id=0;
		 name="No name yet";
	}
	public Ingredient(String aName){
		this.id=0;
		this.name=aName;	
	}
	
	//Setters
	private void setId(int aId){this.id=aId;}
	private void setName(String aName){this.name=aName;}
	
	public void setCategory(String aCategory){this.category=aCategory;}
	
	public void setMeasurement(String aMeasurement){this.measurement=aMeasurement;}
	
	public void setPrice(double aPrice){this.price=aPrice;}
	
	public void setCalories(int aCalories){this.calories=aCalories;}
	
	public void setProtein(int aProtein){this.protein=aProtein;}
	
	public void setCarbs(int aCarbs){this.carbs=aCarbs;}
	
	public void setFat(int aFat){this.fat=aFat;}
	
	//Getters
	public int getId(){return this.id;}
	public String getName(){return this.name;}
	
	public String getCategory(){return this.category;}
	
	public String getMeasurement(){return this.measurement;}
	
	public double getPrice(){return this.price;}
	
	public double getCalories(){return this.calories;}
	
	public int getProtein(){return this.protein;}
	
	public int getCarbs(){return this.carbs;}
	
	public int getFat(){return this.fat;}
	
	
	public String toString(){
		String text = "";
		
		text += "Id is: " + this.id +"\n";
		text += "Name is: " + this.name + "\n";
		text += "Category is: " + this.category +"\n";
		text += "Measurment is: " + this.measurement + "\n";
		text += "Price is: " + this.price +"\n";
		text += "Calories is: " + this.calories + "\n";
		text += "Protein is: " + this.protein +"\n";
		text += "Carbs is: " + this.carbs + "\n";
		text += "fat is: " + this.fat +"\n";
		
		return text;
	}//End toString
	
	public boolean equals(Object other){
		
		Ingredient i = (Ingredient) other;	//cast object as ingredient
				
		if(this.getId()==i.getId())
			return true;
		else
			return false;		
	}

	public int hashcode(){
		int hash = 1;
		hash = hash * 17 + this.getId();
		return hash;
	}
		
	
	public int compareTo(Object obj) 
	{
		Ingredient object = (Ingredient) obj;
		
		if(this.getId()<object.getId()){
			return -1;
		}
		else if(this.getId() == object.getId()){return 0;}
		else{return 1;}	

	}
		
}
