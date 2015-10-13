/*
 *  You need to finish the constructors and the print method for
 *		this class.
 *
 * Employee represents a simplified version of a Person who works
 * for some company.
 */

/**
 * Employee represents a simplified version of a Person who works for some
 * company.
 * 
 * @author Richard Roman
 * @author clint
 * Course: 150
 * Lab08
 * Email: raroman@coastal.edu
 * Date: 10/27/2013
 * 
 */
public abstract class Employee extends Person {
	/**
	 * <i>jobTitle</i> represents the job title of the Employee
	 */
	private String jobTitle;
	

	/**
	 * default constructor
	 */
	public Employee() {
		jobTitle = "No job title yet";
	}

	/**
	 * Overloaded constructor
	 * @param aName is set to name of Person
	 * @param aAge is set to age of Person
	 * @param aJobTitle is set to jobTitle of Person
	 */
	public Employee(String aName, int aAge, String aJobTitle) {
		super.setName(aName);
		super.setAge(aAge);
		jobTitle = aJobTitle;
	}

	/**
	 * Accessor for the jobTitle of this Employee
	 * @return returns the job title of this Employee
	 */
	public String getJobTitle() {
		return jobTitle;
	}

	/**
	 * @param <i>jobTitle</i> is not null and is a valid
	 * job title for a Employee.
	 * 
	 * postcondition: the Employee's job title has been set to the parameter
	 * <i>jobTitle</i>.
	 */
	public void setJobTitle(String aJobTitle) {
		jobTitle = aJobTitle;
	}

	/**
	 * Method computes the paycheck the employee earns every two weeks.  
	 *
	 * @return the amount of money the Employee makes every two weeks is
	 * returned.
	 */
	public abstract double computeBiweeklyPaycheck();

	/**
	 * postcondition: all of the information about this Employee will be printed
	 * to the console.
	 */
	public void print() {
		super.print();
		//hint: you should call the parent print method
		//  so that you don't have to do the same work
		
		
	}
}
