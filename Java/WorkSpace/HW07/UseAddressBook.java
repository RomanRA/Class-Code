/**
 *  UseAddressBook.java
 *  @author Richard A Roman
 *	Course: 150
 *	Homework 07
 *  Date 12/4/2013
 *	email: raroman@coastal.edu
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
import MyException.DuplicateEntryException;
import MyException.EntryNotFoundException;

public class UseAddressBook {
	
	public static void main(String[] args) throws DuplicateEntryException, EntryNotFoundException {
		Scanner keyboardInput = new Scanner(System.in);
		
		//Declare variables
		String userFName = "";
		String userLName = "";
		String returnedAnswer = "";
		String personEmail = "";
		String personCity = "";
		String personState = "";
		String personZipcode = "";
		
		boolean done = false;
		
		//Create a new Address book
		AddressBook newBook = new AddressBook();
		
		JOptionPane.showMessageDialog(null, "***** Welcome To The Address Book Program. *****");
		System.out.println("Please enter your first name: ");
		userFName = keyboardInput.nextLine();
	
		System.out.println(userFName + ", please enter your last name: ");
		userLName = keyboardInput.nextLine();
		
		//Ask for user information
		System.out.println("Enter your email:");
		personEmail = keyboardInput.nextLine();
		
		System.out.println("Enter your city:");
		personCity = keyboardInput.nextLine();
		
		System.out.println("Enter your state:");
		personState = keyboardInput.nextLine();
		
		System.out.println("Enter your zipcode:");
		personZipcode = keyboardInput.nextLine();
		
		
		//create a new person Object 
		Person newPerson1 = new Person(userFName, userLName, personEmail);
		//setAddress of the Person Object
		newPerson1.setAddress(personCity, personState, personZipcode);
		
		newBook.setOwner(newPerson1);
		//Add Person to addressBook 
		newBook.add(newPerson1);
		
		while(!done){
			
			System.out.println( userFName + ", please enter add/delete/edit/find/exit:");
			returnedAnswer = keyboardInput.nextLine();
			try{
				
			
				if(!returnedAnswer.equalsIgnoreCase("exit"))
				{
					if(returnedAnswer.equalsIgnoreCase("add")){
						System.out.println("Enter first name");
						String personFName = keyboardInput.nextLine();
						
						System.out.println("Enter " +personFName+ "'s last name:");
						String personLName = keyboardInput.nextLine();
						
						System.out.println("Enter " +personFName+ "'s email:");
						personEmail = keyboardInput.nextLine();
						
						System.out.println("Enter " +personFName+ "'s city:");
						personCity = keyboardInput.nextLine();
						
						System.out.println("Enter " +personFName+ "'s state:");
						personState = keyboardInput.nextLine();
						
						System.out.println("Enter " +personFName+ "'s zipcode:");
						personZipcode = keyboardInput.next();
						
						keyboardInput.nextLine();//clear newline character
						
						//create a new person object 
						Person newPerson2 = new Person(personFName, personLName, personEmail);
						
						//setAddress of the Person Object
						newPerson2.setAddress(personCity, personState, personZipcode);
					
						//need to add all the user input information about person to address book
						newBook.add(newPerson2); 
						
					}
					else if(returnedAnswer.equalsIgnoreCase("delete")){
						//Check the arrayList inside AddressBook
						if(!newBook.isEmpty()){
							System.out.println("Enter the name of the person you want to delete");
							String fName = keyboardInput.next();
							String lName = keyboardInput.next();
							
							//System.out.println(fName+" , "+lName);
							keyboardInput.nextLine();//Clear line
							
							Person aPerson = newBook.delete(fName, lName);
							if(aPerson!=null){
								System.out.println(aPerson.getFirstName() + " was deleted. ");
							}
						}
						else{
							System.out.println("Sorry "+userFName+", the AddressBook does not have any entries at this time.");
						}
						
					}
					else if(returnedAnswer.equalsIgnoreCase("edit")){
						System.out.println("Enter the name of the person you want to edit");
						String fName = keyboardInput.next();
						String lName = keyboardInput.next();
						
						//System.out.println(fName+" , "+lName);
						keyboardInput.nextLine();//Clear line
						
						newBook.edit(fName, lName);
						
						
					}
					else if(returnedAnswer.equalsIgnoreCase("find")){
						System.out.println("Enter the name of the person you want to find");
						String fName = keyboardInput.next();
						String lName = keyboardInput.next();
						
						//System.out.println(fName+" , "+lName);
						keyboardInput.nextLine();//Clear line
						
						Person aPerson = newBook.lookup(fName, lName);
						if(aPerson!=null){
							System.out.println(aPerson.getFirstName() + " was found. ");
							System.out.println(aPerson.toString());
						}
					}	
				}
				else{
					System.out.println("GoodBye " +userFName+ ", Thank you for using the ***Address Book Program*** have a nice day!");
					done = true;
				}
			}//End Try
			catch(DuplicateEntryException dee){
				
			}
			catch(EntryNotFoundException enfe){
				
			}
			
		}//End while
	
	}//End Main
		
}//End Class
