//Richard Roman
package Chapter2;
import java.util.Scanner;

public class TestProgramPractice {


	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner (System.in);
		
		//Declare strings
		String firstName;
		String lastName; 
		String middleName;
		String companyName;
		String address;
		String city;
		String state;
		String zip;
		String emailAddress;
		
		//User inputs
		System.out.println(" Please enter first name ");
		firstName = userInput.next();
		//System.out.println(" Your entered: "+ firstName); this was to check.
		
		System.out.println(" Please enter last name ");
		lastName = userInput.next();
		System.out.println(" Please enter middle name ");
		middleName = userInput.next();
		System.out.println(" Enter company name");
		companyName = userInput.next();
		
		if(companyName.length() <= 1){
			
			System.out.println(" No seriously enter company ");
		}
		else{

		}
		
		//Multiple inputs
		System.out.println(" Enter street adddres");
		userInput.nextLine();// this accepts all inputs by user for ex an entire address.
		address = userInput.nextLine();
		
		
		System.out.println(" Enter city");
		city = userInput.nextLine();
		System.out.println(" You entered:" +city);
		
		System.out.println(" Enter state");
		state = userInput.nextLine();
		System.out.println(" You entered:" +state);
		
		//Print a welcome if in SC
		// || is mean "or"
		//Now matter what they enter it goes to capitalized
		String capState;
		capState = state.toUpperCase();
		if(capState.equals("SC")|| capState.equals("sc\n")){
			System.out.println("Welcome neighbor");
		}
		else {
			System.out.println("Welcome and have a nice day\n");
		}
		
		
		System.out.println(" Enter zip");
		zip = userInput.next();
		System.out.println(" You entered:" +zip);
		
		//Compute email
		//emailAddress = firstName.substring(0,1) + lastName.substring(0,5) +"@"+companyName+ ".com ";
		//or
		int numChar = lastName.length();// if length is not 5 characters
		//loop statement. If else 
		if (numChar >= 5) {
			emailAddress = firstName.substring(0,1) + lastName.substring(0,5) +"@"+companyName+ ".com ";
			
		}
		else {
			emailAddress = firstName.substring(0,1) + lastName.substring(0,numChar) +"@"+companyName+ ".com ";
		}
		
		
		
		//Output contact entry
		System.out.println("Contact entry:\n\n");
		System.out.println(lastName+ "," + firstName+" "+middleName.substring(0,1)+ ".");
		System.out.println(emailAddress);
		System.out.println(address);
		System.out.println(city+ "," +capState+ " " +zip);
		
		
		

		
		
		
		

	}

}
