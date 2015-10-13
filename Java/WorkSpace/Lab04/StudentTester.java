/*
 * This class tests the Student class
 * 
 * @author CSCI 150
 * @modified by: Richard Roman <------------------------------------<<<<<<<<<<<<<<<<<<<<<<<<<
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class StudentTester {

	public static void main(String[] args) {

		String testStatus = "No name";
		String testName = "";
		String testID = "";
		double testFees = 0.0;
		boolean allright = true;
		
		
		System.out.println("Welcome to the student tester");
		// Declare and initialize a default part-time Student object here, call it student1
		Student student1 = new Student();
		
		// use mutator method to set student1's name to "John"
		student1.setName("John");
		
		// use mutator method to set student1's id to "B1234567"
		student1.setID("B1234567");
		
		//use mutator method to set student1's number of credits to 6
		student1.setCredits(6);
		
		// use mutator method to set student1's status to "part-time"
		student1.setStatus("part-time");
		
		// use method to calculate student1's fees here
		student1.calculateFees();

		// Uncomment the next line and get the name from student2 for testing
		testName = student1.getName();
		if (testName.equals("John")) {
			System.out.println("Created student, name set correctly... Passed test 1");
		} 
		else {
			System.out.println("Failed to create a new student object. Test 1 failure");
			allright = false;
		}

		// Uncomment the next Line and get the id from student2 for testing
		testID = student1.getID();
		if (testID.equals("B1234567")) {
			System.out.println("Set the ID right ... passed test 2");
		} 
		else {
			System.out.println("Failed to set the ID");
			allright = false;
		}

		// Uncomment the next Line and get the fees from student2 for testing
		testFees = student1.calculateFees();
		if (testFees == 2400) {
			System.out.println("Calculated fees for part time student right ... passed test 3");
		} 
		else {
			System.out.println("Failed to calculate fees. Test 3 failure");
			allright = false;
		}

		// Uncomment the next Line and get the fees from student2 for testing
		testStatus = student1.getStatus();
		if (testStatus.equals("part-time")) {
			System.out.println("Status tested OK... Passed test 4");
		} 
		else {
			System.out.println("Failed to create a new student object. Test 4 failure");
			allright = false;
		}

		//Part2	
		
		// Declare and initialize a FulltimeStudent Object here, call it student2
		Student student2 = new Student("Tom","A7654321",12);
		// set the name "Tom", Id "A7654321", credits "12". 
		
		// this should be accomplished by calling
		// the constructor takes all of these values in one of its constructor
		
		
		 // use method to calculate student1's fees here
		student1.calculateFees();

		// Uncomment the next line and get the name from student2 for testing
		testName = student2.getName(); 
		if (testName.equals("Tom")) {
			System.out.println("Created student, name set correctly... Passed test 5");
		} 
		else {
			System.out.println("Failed to create a new student object. Test 5 failure");
			allright = false;
		}

		// Uncomment the next Line and get the id from student2 for testing
		testID  = student2.getID();
		if (testID.equals("A7654321")) {
			System.out.println("Set the ID right ... passed test 6");
		} 
		else {
			System.out.println("Failed to set the ID.  Test 6 failure");
			allright = false;
		}

		// Uncomment the next Line and get the fees from student2 for testing
		testFees = student2.calculateFees(); 
		if (testFees == 3200) {
			System.out.println("Calculated fees for full time student right ... passed test 7");
		} 
		else {
			System.out.println("Failed to calculate fees. Test 7 failure");
			allright = false;
		}

		// Uncomment the next Line and get the fees from student2 for testing
		testStatus = student2.aStatus();
		if (testStatus.equals("full-time")) {
			System.out.println("Status tested OK... Passed test 8");
		} 
		else {
			System.out.println("Failed to create a new student object. Test 8 failure");
			allright = false;
		}

		if (allright) {
			student1.printStudentInfo();
			student2.printStudentInfo();
			System.out.println("Did your program properly display the information for student1 and student2? If so, Good job! You've passed all tests. You may be qualified for a 100%. Show your program to your TA");
		} 
		else {
			System.out.println("Your program did not pass all tests... keep working on it taking cue from the error messages or ask for the help of your TA");
		}
	}
}
