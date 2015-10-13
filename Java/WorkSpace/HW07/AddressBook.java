/**
 *  AddressBook.java
 *  @author Richard A Roman
 *	Course: 150
 *	Homework 07
 *  Date 12/4/2013
 *	email: raroman@coastal.edu
 */
import java.util.*;
import MyException.DuplicateEntryException;
import MyException.EntryNotFoundException;

public class AddressBook {
	
	/**
	 * Class attributes
	 */
	Scanner keyboardInput = new Scanner(System.in);
	private Person owner;
	private ArrayList<Person> personList = new ArrayList<Person>();
	private String tempFName = "";
	private String tempLName = "";
	
	//set owner of address book
	public void setOwner(Person aPerson){
		this.owner = aPerson; 
		System.out.println("The owner is: " + this.owner.getFirstName());
		
	}
	
	/**
	 * add the Person object to arrayList. Does not allow duplicates
	 * @param person
	 * @throws DuplicateEntryException
	 * @throws EntryNotFoundException 
	 */
	public void add(Person person)throws DuplicateEntryException, EntryNotFoundException{
	
		if(personList.isEmpty()){
			System.out.println(person.getFirstName()+" "+person.getLastName()+ " has been added to the Address Book");
			personList.add(person);
			
		}
		else if(!personList.isEmpty()){
		
			if(lookup(person.getFirstName(), person.getLastName(), false)==null){
				//add person
				personList.add(person);
				System.out.println(person.getFirstName()+" "+person.getLastName()+ " has been added to the Address Book");
			}
			else{
				//duplicate entry
				throw new DuplicateEntryException("Failed to add: "+person.getFirstName()+" "+person.getLastName()+" is already an entry in the AddressBook.");
			}
		}
	}
		//This was the previous add Method I tried to work with
//		try{
//			if(personList.isEmpty()){
//				//System.out.println("Adding person...isEmpty");
//				personList.add(person);
//				
//			}
//			else if(!personList.isEmpty()){
//				
//				for(int i = 0; i < personList.size(); i++){
//					System.out.println("In Loop");
//					
//					tempFName = personList.get(i).getFirstName();
//					tempLName = personList.get(i).getLastName(); 
//					//System.out.println(tempFName +","+tempLName);
////					for(int j = i+1; j<=personList.size();j++){
//						System.out.println("In 2nd Loop");
//						if(!tempFName.equals(person.getFirstName()) && (!tempLName.equals(person.getLastName()))){
//							
//							System.out.println("Adding person...isNotEmpty");
//							personList.add(person);
//							break;
//						}
//						else{
//							throw new DuplicateEntryException();
//						}
////					}
//				}//end loop
//				
//			}
//
//		}//End try
//		catch(DuplicateEntryException dee){
//			System.out.println("Failed to add: "+person.getFirstName()+" "+person.getLastName()+" is already an entry in the AddressBook.");
//		}

	/**
	 * delete the Person object the user is searching for
	 * @param firstName
	 * @param lastName
	 * @return deleted Person
	 */
	public Person delete(String firstName, String lastName)throws EntryNotFoundException{
		Person deletedPerson = null;
		
		for(int index = 0; index < personList.size();index++){
			tempFName = personList.get(index).getFirstName();
			tempLName = personList.get(index).getLastName();
			
			if(tempFName.equalsIgnoreCase(firstName) && tempLName.equalsIgnoreCase(lastName)){
				deletedPerson = personList.remove(index);
			}
		}
		if(deletedPerson == null){
			throw new EntryNotFoundException("Entry not found: "+firstName+" "+lastName+" is not an entry in the AddressBook.");
		}
		
		return deletedPerson;
	}
		
	
	/**
	 * edit searches for user input allowing user to edit the object
	 * @param firstName
	 * @param lastName
	 */
	public void edit(String firstName, String lastName){
		
		Person editPerson = null;
		
		for(int index = 0; index < personList.size(); index++){
			tempFName = personList.get(index).getFirstName();
			tempLName = personList.get(index).getLastName();
			
			if(tempFName.equalsIgnoreCase(firstName) && tempLName.equalsIgnoreCase(lastName)){
				
				System.out.println("Enter first name");
				String personFName = keyboardInput.nextLine();
				personList.get(index).setFirstName(personFName);
				
				System.out.println("Enter " +personFName+ "'s last name:");
				String personLName = keyboardInput.nextLine();
				personList.get(index).setLastName(personLName);
				
				System.out.println("Enter " +personFName+ "'s email:");
				String personEmail = keyboardInput.nextLine();
				personList.get(index).setEmail(personEmail);
				
				System.out.println("Enter " +personFName+ "'s city:");
				String personCity = keyboardInput.nextLine();
				
				
				System.out.println("Enter " +personFName+ "'s state:");
				String personState = keyboardInput.nextLine();
				
				System.out.println("Enter " +personFName+ "'s zipcode:");
				String personZipcode = keyboardInput.nextLine();
				
	
			}
		}
		
	}
	
	/**
	 * lookup Person user is searching for
	 * @param firstName
	 * @param lastName
	 * @return the person object found
	 * @throws EntryNotFoundException
	 */
	public Person lookup(String firstName, String lastName)throws EntryNotFoundException{
		Person foundPerson = null;
		
		for(int index = 0; index < personList.size(); index++){
			tempFName = personList.get(index).getFirstName();
			tempLName = personList.get(index).getLastName();
			
			if(tempFName.equalsIgnoreCase(firstName) && (tempLName.equalsIgnoreCase(lastName))){
				foundPerson = personList.get(index);
			}
			
		}
		if(foundPerson == null){
			throw new EntryNotFoundException("Entry not found: "+firstName+" "+lastName+" is not an entry in the AddressBook.");
		}
		return foundPerson;
	}
	
	public Person lookup(String firstName, String lastName, boolean error)throws EntryNotFoundException{
		Person foundPerson = null;
		
		for(int index = 0; index < personList.size(); index++){
			tempFName = personList.get(index).getFirstName();
			tempLName = personList.get(index).getLastName();
			
			if(tempFName.equalsIgnoreCase(firstName) && (tempLName.equalsIgnoreCase(lastName))){
				foundPerson = personList.get(index);
			}
			
			if(foundPerson == null && error){
				throw new EntryNotFoundException("Entry not found: "+firstName+" "+lastName+" is not an entry in the AddressBook.");
			}
		}
		return foundPerson;
	}

	public boolean isEmpty() {
		if(personList.isEmpty()){
			return true;
		}
		return false;
	}
}
