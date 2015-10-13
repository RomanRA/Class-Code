/*
 * You need to finish the main (just if and else), readEmployeeData, printEmployeeData
 *    and printAll methods
 *
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */

/**
 * @author Richard Roman <----------------<<<<<<<<<<<<<
 * @author clint
 * Course: 150
 * Lab08
 * Email: raroman@coastal.edu
 * Date: 10/27/2013
 *
 * A simple test file to test the Person->Employee inheritance hierarchy.
 */

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane; 

public class EmployeeTest {
	/**
	 * Represents the default number of Employee objects to be represented.
	 */
	public static final int DEFAULTSIZE = 6;

	/**
	 * precondition: the parameter array of Employees, <i>e</> has been
	 * Initialized. The parameter <i>numberOfEmployees</i> represents the number
	 * of employees that will be created and added to the array of Employees.
	 * Note: this does not mean that any Employee objects were created just the
	 * spaces in the array.
	 * 
	 * postcondition: The user is prompted to enter information in for 
	 * <i>numberOfEmployees</i> that can be either hourly employees or
	 * salaried employees, which are then created and placed into sequential
	 * slots in our Employee array.
	 */
	public static void readEmployeeData(ArrayList<Employee> eList, int numberOfEmployees,
			Scanner keyboard) {
		// start a loop so you can make numberOfEmployees
		for(int i = 0; i < numberOfEmployees; i++){
			String userAnswer = JOptionPane.showInputDialog(null,"Select an Option:\n" +
					" Type \"HOURLY\" to add an hourly employee\n" +
					" Type \"SALARIED\" to add a salaried employee");
			
			if(userAnswer.equalsIgnoreCase("hourly")){
				String tempName = JOptionPane.showInputDialog(null,"Whats is the hourly employee's name: ");
				int tempAge = Integer.parseInt(JOptionPane.showInputDialog(null,"Whats the hourly employees's age: "));
				String tempTitle = JOptionPane.showInputDialog(null," Whats the hourly's employees's title: ");
				double tempPay = Double.parseDouble(JOptionPane.showInputDialog(null,"What the employees's hourly pay: "));
				
				//Creates new hourly employee
				HourlyEmployee newEmployee = new HourlyEmployee();
				
				//sets data and add to arraylist
				newEmployee.setName(tempName);
				newEmployee.setAge(tempAge);
				newEmployee.setJobTitle(tempTitle);
				newEmployee.setHourlyPay(tempPay);
				eList.add(newEmployee);
				
			}
			else if(userAnswer.equalsIgnoreCase("salaried")){
				String tempName = JOptionPane.showInputDialog(null,"Whats is the salaried employee's name: ");
				int tempAge = Integer.parseInt(JOptionPane.showInputDialog(null,"Whats the salaried employees's age"));
				String tempTitle = JOptionPane.showInputDialog(null," Whats the salaried employees's title: ");
				double tempPay = Double.parseDouble(JOptionPane.showInputDialog(null,"What the employees's salaried pay: "));
				
				//creates new salaried employee
				SalariedEmployee newEmployee = new SalariedEmployee();
				
				//sets data and add to arraylist
				newEmployee.setName(tempName);
				newEmployee.setAge(tempAge);
				newEmployee.setJobTitle(tempTitle);
				newEmployee.setSalary(tempPay);
				eList.add(newEmployee);
				
			}		
		}
		// inside loop, prompt the user for whether they want to add an
		// HourlyEmployee or a
		// salaried employee



	}

	/**
	 * @param <i>name</i> is not null( easy to check and you should)
	 * @param the <i>eList</i> is not null.
	 * 
	 * postcondition: if the <i>name</i> is present as an Employee object, then
	 * that Employee's information will be printed to the console. If the
	 * <i>name</i> is not present, then \"Name not found\" will be printed to
	 * the console.
	 */
	public static void printEmployeeData(String name, ArrayList<Employee> eList) {
		// add your implementation here
		boolean found = false;
		Employee temp = null;
		
		for(int i = 0; i<eList.size() && !found;i++){
			temp = (Employee)eList.get(i);
			if(temp.getName().equals(name)){
				System.out.println("Data of employee: \nName: " +temp.getName() +"\nAge: "+temp.getAge() +"\nJob Title: "+temp.getJobTitle());
				if(eList.get(i) instanceof SalariedEmployee){
					System.out.println("Salary: "+((SalariedEmployee)temp).getSalary() +"\n");
					found = true;
				}
				else{
					System.out.println("Hourly: "+((HourlyEmployee)temp).getHourlyPay() +"\n");
					found = true;
				}	
			}

		}
	}

	/**
	 * @param <i>employeeList</i> is not null.
	 * 
	 * postcondition: all of the Employee's information will be printed to the
	 * console.
	 */
	public static void printAll(ArrayList<Employee> employeeList) {
		//add your implementation here
		
		Employee temp = null;
		for(int i = 0;i<employeeList.size();i++)
		{
			temp = (Employee)employeeList.get(i);
			System.out.println("Data of employee: \nName: " +temp.getName() +"\nAge: "+temp.getAge() +"\nJob Title: "+temp.getJobTitle());
			if(employeeList.get(i) instanceof SalariedEmployee){
				System.out.println("Salary: "+((SalariedEmployee)temp).getSalary() +"\n");
			}
			else{
				System.out.println("Hourly: "+((HourlyEmployee)temp).getHourlyPay() +"\n");
			}
		}
		
	}
	
	/**
	 * 
	 * @param employeeList4
	 * 
	 * postCondition : the Employee with the highest pay will be determined and printed to the screen
	 */
	public static void printHighestPaidEmployee(ArrayList<Employee> employeeList){
		Employee theEmployee = null;
		int i = 0;
		
		//compute pay then set first employee to high
		double theHigh = (employeeList.get(i)).computeBiweeklyPaycheck();		
		theEmployee = employeeList.get(i);
		
		for(i = 1; i<employeeList.size();i++){
			
			if((employeeList.get(i)).computeBiweeklyPaycheck()> theHigh){
				theHigh = (employeeList.get(i)).computeBiweeklyPaycheck();
				theEmployee = employeeList.get(i);
			}
		}
		//need to print the employee now with highest pay
		System.out.println("Data of employee: \nName: " +theEmployee.getName() +"\nAge: "+theEmployee.getAge() +"\nJob Title: "+theEmployee.getJobTitle());
		
		//Check if salaried or hourly to print correct information
		if(theEmployee instanceof SalariedEmployee){
			System.out.println("Salary: "+((SalariedEmployee)theEmployee).getSalary() +"\n");
		}
		else{
			System.out.println("Hourly: "+((HourlyEmployee)theEmployee).getHourlyPay() +"\n");
		}
	}


	

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
				
		// prompt the user for the number of employees to be created
		System.out.print("Welcome, how many Employees will you be creating today: ");
		// get the number of employees from the user
		int numberOfEmployees = keyboard.nextInt();
		keyboard.nextLine();// clears the '\n' char

		// then create the ArrayList 
		ArrayList<Employee> employee = new ArrayList<Employee>(DEFAULTSIZE);//need to use DEFAULTSIZE 
		EmployeeTest.readEmployeeData(employee, numberOfEmployees, keyboard);
		


		while (true) {
			System.out.println("Enter an employee's name to search (\"all\" to print all, \"highest\" to print the employee's info with the highest salary, and \"exit\" to exit):");
			String choice = keyboard.nextLine();
			// if choice equals "all" call printAll(), if choice equals "exit"
			// break else call printEmployeeData()
			if(choice.equalsIgnoreCase("all")){
				//what method should you call here?
				printAll(employee);
			}
			else if(choice.equalsIgnoreCase("exit")){
				System.out.println("Thank you for using the program.");
				break;
			}
			else if(choice.equalsIgnoreCase("highest")){
				printHighestPaidEmployee(employee);
			}
			else{
				printEmployeeData(choice, employee);
				//if the choice is not all or exit, then the user must
				//  have entered a name to lookup, so what method should
				//  you call here?
				
			}
			
			
		}
	}
}
