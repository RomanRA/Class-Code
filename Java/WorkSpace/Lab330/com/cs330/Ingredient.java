package com.cs330;

public class Ingredient {
	//Attributes 
		private int id= 0;
		private String name = "";
		private String category = "";

		//default constructor
		public Ingredient(){
			id = 0;
			name = "No name yet";
			category = "No category yet";
		}

		//constructor take id,name, and category as parameters
		public Ingredient(int aId, String aName, String aCategory){
			id = aId;
			name = aName;
			category = aCategory;
		}

		//Constructor that takes name and category and set id to 0
		public Ingredient(String aName, String aCategory){
			this.id = 0;
			this.name = aName;		
			this.category = aCategory;
		}
		public int getId(){
			return id;
		}
		public String getName(){
			return name;
		}
		public String getCategory(){
			return category;
		}	
		public void setId(int aId){
			this.id = aId;
		}
		public void setName(String aName){
			this.name = aName;
		}
		public void setCategory(String aCategory){
			this.category = aCategory;
		}
		
		//Also include a toString that creates a String representation	in the form id: name (category)	
		public String toString(){
			String text = "";
			text += "id: "+this.id+" "+this.name+"("+this.category+")";
			return text;
		}
}
