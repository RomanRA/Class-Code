/**
 *  Recipe.java
 *  @author Richard Roman and Hubert Walton
 *	Course: 490
 *	Date 9/12/2014
 *	email: raroman@coastal.edu
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class Recipe {
	//data members
	private int id;
	private String name;
	private String author;
	private int prep;
	private int cook;
	private ArrayList<String> instructions;
	private HashSet<String> tags;
	private HashSet<Ingredient> ingredients;
	private HashMap hm;
	
	
	//constructors
	public Recipe()
	{
		this.id = 0;	
		this.name = "";
	}
	public Recipe(int ID, String aName)
	{
		this.id = ID;
		this.name = aName;
	}
	public Recipe(String aName)
	{
		this.id = 0;
		this.name = aName;
	}
	
	//getters
	public int getId() {return this.id;};
	public String getName() {return this.name;}
	public String getAuthor() {return this.author;}
	public int getPrep() {return this.prep;}
	public int getCook() {return this.cook;}
	public ArrayList<String> getInstructions() {return this.instructions;}
	public HashSet<String> getTags() {return this.tags;}
	public HashSet<Ingredient> getIngredients() {return this.ingredients;}
	public HashMap getHm() {return this.hm;}
	
	//setters
	public void setId(int ID)
	{
		this.id = ID;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAuthor(String author)
	{
		this.author = author;
	}
	public void setPrep(int prep)
	{
		this.prep = prep;
	}
	public void setCook(int cook)
	{
		this.cook = cook;
	}
	public void setInstructions(ArrayList<String> instructions)
	{
		this.instructions = instructions;
	}
	public void setTags(HashSet<String> tags)
	{
		this.tags = tags;
	}
	public void setIngredients(HashSet<Ingredient> ingredients)
	{
		this.ingredients = ingredients;
	}
	public void setHashMap(HashMap hm)
	{
		this.hm = hm;
	}
	
	public String toString()
	{
		String text = "";
		text+="Id: "+this.getId()+"\n";
		text+="Name: "+this.getName()+"\n";
		text+="Author: "+this.getAuthor()+"\n";
		text+="Prep time: "+this.getPrep()+"\n";
		text+="Cook time: "+this.getCook()+"\n";
		text+="Instructions: "+this.getInstructions()+"\n";
		text+="Tags: "+this.getTags()+"\n";
		text+="Ingredients: "+this.getIngredients()+"\n";
		return text;
	}
	
	public boolean equals(Object obj)
	{
		Recipe i = (Recipe) obj;	//cast object to ingredient
		if(this.getId()==i.getId())
			return true;
		else
			return false;
	}
	
	public int hashCode()
	{
		int hash = 1;
		hash = hash * 17 + this.getId();
		return hash;
	}
	
	public int compareTo(Object obj) 
	{
		Recipe object = (Recipe) obj;
		
		if(this.getId()<object.getId()){
			return -1;
		}
		else if(this.getId() == object.getId()){return 0;}
		else{return 1;}	
	}
	
	public int totalCalories(){
		int total = 0;
		for(Ingredient i: ingredients)
			total += i.getCalories();
		return total;
	}
	
	public int totalProtein(){
		int total = 0;
		for(Ingredient i: ingredients)
			total += i.getProtein();
		return total;
	}
	
	public int totalCarbs(){
		int total = 0;
		for(Ingredient i: ingredients)
			total += i.getCarbs();
		return total;
	}
	
	public int totalFat(){
		int total = 0;
		for(Ingredient i: ingredients)
			total += i.getFat();
		return total;
	}
	
	public int totalCost(){
		int total = 0;
		for(Ingredient i: ingredients)
			total += i.getPrice();
		return total;
	}
	
	public int totalTime(){
		int totalTime = prep + cook;
		return totalTime;
	}
}
