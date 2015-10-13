/*
 * 	You need to complete the constructors, setSalary, 
 *     computeBiweeklyPaycheck, and print methods.
 */

/**
 * @author Richard Roman <---------------------<<<<<<<<<<<<<<
 * @author clint
 * Course: 150
 * Lab08
 * Email: raroman@coastal.edu
 * Date: 10/27/2013
 * 
 * SalariedEmployee represents an Employee who makes a fixed amount of money
 * every year.
 */
public class SalariedEmployee extends Employee {
	/**
	 * <i>salary</i> represents the amount of money the SalariedEmployee makes
	 * annually.
	 */
	private double salary;
	/**
	 * default constructor
	 */
	public SalariedEmployee() {
		salary = 0;
	}
	
	/**
	 * Overloaded constructor
	 * @param aName is set to name of Employee
	 * @param aAge is set to age of Employee
	 * @param aJobTitle is set to jobTitle of Employee
	 * @param aSalary is set to salary of SalariedEmployee
	 */
	public SalariedEmployee(String aName, int aAge, String aJobTitle, double aSalary) {
			super.setName(aName);
			super.setAge(aAge);
			super.setJobTitle(aJobTitle);
			salary = aSalary;		
	}

	/**
	 * Accessor method for this SalariedEmployee
	 *
	 * @return <i>salary</i> of this Employee.
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * Mutator method for the salary of this SalariedEmployee.
	 * 
	 * @param <i>salary</i> is > 0.
	 * 
	 * postcondition: the <i>salary</i> of the SalariedEmployee has been set to
	 * the value of the parameter <i>salary</i> if and only if it is > than 0,
	 * otherwise no action.
	 */
	public void setSalary(double aSalary) {
		if(aSalary > 0){
			this.salary = aSalary;
		}
	}

	/**
	 * Method computes the paycheck the employee earns every two weeks.
	 *
	 * @return the amount of money the Employee makes every two weeks is
	 * returned.
	 */
	public double computeBiweeklyPaycheck() {
		double biWeeklyPayCheck = salary/26;
		return biWeeklyPayCheck;
	}

	/**
	 * postcondition: all of the information about this Salaried Employee will
	 * be printed to the console.
	 */
	public void print() {
		super.print();
		//hint: should you call the print method in
		//  the parent class
	}
}
