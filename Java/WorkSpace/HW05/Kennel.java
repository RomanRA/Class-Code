/*
 * Kennel.java
 * Name: Richard Roman
 * Course: 150
 * Homework05
 * Email: raroman@coastal.edu
 * Date: 10/24/2013
 */
import javax.swing.*;
public class Kennel {
   
    public Kennel() {
	
    }
    
    public static void makePetsTalk(Object[] pet){
		/****************************************
		 * Call each animals speak method. They *
		 * are Objects coming in, so you will   *
		 * need to convert each one to an       *
		 * Animal. Remember to "Cast" them!     *
		 ****************************************/
    	//loop through array
    	for(int i = 0; i< pet.length;i++){
    		//if cat call cat speak
    		if(pet[i] instanceof Cat){
    			((Cat)pet[i]).speak();
    		}
    		//if dog call dog speak
    		if(pet[i] instanceof Dog){
    			((Dog)pet[i]).speak();
    		}
    		//if bird call bird speak
    		if(pet[i] instanceof Bird){
    			((Bird)pet[i]).speak();
    		}
    		//if fish call fish speak
    		if(pet[i] instanceof Fish){
    			((Fish)pet[i]).speak();
    		}
    	}
    }

    public static void main(String[] args) {
	
		String input = JOptionPane.showInputDialog("Enter the number of pets to be created:");

		Animal[] pet = new Animal[Integer.parseInt(input)];

		/**************************************************************
		 * Complete this code so that you can create a Cat, Dog, Bird * 
		 * and a Fish too.                                            *
		 **************************************************************/
		for(int i=0; i<pet.length; i++){
			input = JOptionPane.showInputDialog("Do you want to create a Cat,a Dog, a Bird, or Fish?");
			
			if(input.equalsIgnoreCase("Cat")){
				System.out.println("In Cat");
				pet[i] = new Cat();
				
				Cat.loadAnimal(pet[i]);
				
				//prompt the user for the values the Cat should have
				String tempBreed = (JOptionPane.showInputDialog(null,"Enter the breed of the cat: "));
				int tempLives = (Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the number of lives the cat has: ")));
				
				//and mutate that Cat to the user's input

				((Cat) pet[i]).setBreed(tempBreed);
				((Cat) pet[i]).setNumberOfLives(tempLives);
				pet[i].printInfo();
				System.out.println("Leaving cat...");
			}
			else if(input.equalsIgnoreCase("Dog")){
				System.out.println("In Dog");
				pet[i] = new Dog();
				
				Dog.loadAnimal(pet[i]);
				//prompt the user for the values the Dog should have
				String tempBreed = (JOptionPane.showInputDialog(null,"Enter the breed of the dog: "));
				boolean tempTrained = Boolean.parseBoolean((JOptionPane.showInputDialog(null,"Please enter true if dog is trained, else enter false if it is not trained: ")));
				
				//and mutate that Dog to the user's input
				((Dog) pet[i]).setBreed(tempBreed);
				((Dog) pet[i]).setIsTrained(tempTrained);
				pet[i].printInfo();
				System.out.println("Leaving Dog...");
			}
			else if(input.equalsIgnoreCase("Bird")){
				System.out.println("In Bird");
				pet[i] = new Bird();
				
				Bird.loadAnimal(pet[i]);
				//prompt the user for the values the Bird should have
				String tempBreed = (JOptionPane.showInputDialog(null,"Enter the breed of the bird: "));
				String tempColor = (JOptionPane.showInputDialog(null,"Enter the color of the bird: "));
				boolean tempCanFly = Boolean.parseBoolean((JOptionPane.showInputDialog(null,"Enter true if the bird can fly, else enter false if it cannot: ")));
				
				//and mutate that Bird to the user's input
				((Bird)pet[i]).setBreed(tempBreed);
				((Bird)pet[i]).setColor(tempColor);
				((Bird)pet[i]).setCanFly(tempCanFly);
				pet[i].printInfo();
				System.out.println("Leaving Bird...");
			}
			else if(input.equalsIgnoreCase("Fish")){
				System.out.println("In Fish");
				pet[i] = new Fish();
				
				Fish.loadAnimal(pet[i]);
				//prompt the user for the values the Fish should have
				String tempBreed = (JOptionPane.showInputDialog(null,"Enter the breed of the fish: "));
				String tempColor = (JOptionPane.showInputDialog(null,"Enter the color of the fish: "));
				boolean tempIsSaltWater = Boolean.parseBoolean((JOptionPane.showInputDialog(null,"Enter true if fish is a salt water fish, else enter false: ")));
				boolean tempIsFitForEating = Boolean.parseBoolean((JOptionPane.showInputDialog(null,"Enter true if fish is fit for eating else enter false: ")));
				
				//and mutate that Fish to the user's input
				((Fish)pet[i]).setBreed(tempBreed);
				((Fish)pet[i]).setColor(tempColor);
				((Fish)pet[i]).setSaltWater(tempIsSaltWater);
				((Fish)pet[i]).setFitForEating(tempIsFitForEating);
				pet[i].printInfo();
				System.out.println("Leaving Fish...");
				
			}
			
			else{
				JOptionPane.showMessageDialog(null, input + " is invalid please try again.");
		
				i--;
			}

		}

		Kennel.makePetsTalk(pet);//calls the helper method, modify it up above.
	
		/****************************************************************************
		 * determine if any of the Animals are .equals to any other Animals in the  *
		 * array. If so, print out each set of names that are equal. What would be  *
		 * a good strategy for doing this? One way would be to use nested loops and *
		 * start with the first Object and see if it is equal to the rest of the    *
		 * objects in the array.                                                    *
		 ****************************************************************************/
	
		//for example:
		for(int outer=0;outer<pet.length; outer++){//this is where you begin
			System.out.println("\nIn outer loop");
			//The next loop you had outer = to inner. loop did not work correctly???
			//Changed to outer+1 is that correct???
			for(int inner=outer+1;inner<pet.length; inner++){//this one lets you move down the array
				//what are you going to do here to find out if you have a match
				if(pet[outer].equals(pet[inner])){
					System.out.println("In equals");
					pet[outer].printInfo();
					pet[inner].printInfo();
				}  		
			}
				//if you get a match, print out the information for both Animals
				//only worry about printing two matches at at time, not all possible
				//matches.
		}

    }
    
} // Kennel
