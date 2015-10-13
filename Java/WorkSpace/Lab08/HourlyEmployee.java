import javax.swing.JOptionPane;

/**
 *
 *	You need to complete the constructors, setHourlyPay, 
 *     computeBiweeklyPaycheck, and print methods.
 *
 * A simple class to represent and Employee who gets paid by the hour.
 */

/**
 * @author Richard Roman <----------------<<<<<<
 * @author clint
 * Course: 150
 * Lab08
 * Email: raroman@coastal.edu
 * Date: 10/27/2013
 * 
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class HourlyEmployee extends Employee {
	/**
	 * <i>MINIMUMWAGE</i> is the minimum amount that an HourlyEmployee can make
	 * an hour.
	 */
	public static final double MINIMUMWAGE = 4.50;

	/**
	 * <i>hourlyPay</i> is a decimal representation of the amount of money the
	 * Employee makes per hour.
	 */
	private double hourlyPay;

	/**
	 * default constructor
	 */
	public HourlyEmployee() {
		hourlyPay = 0;
	}

	/**
	 * Overloaded constructor
	 * @param aName is to to name of Employee
	 * @param aAge is set to age of Employee
	 * @param aJobTitle is set to jobTitle of Employee
	 * @param aHourlyPay is set to hourlyPay of HourlyEmployee
	 */
	public HourlyEmployee(String aName, int aAge, String aJobTitle, double aHourlyPay){
		super.setName(aName);
		super.setAge(aAge);
		super.setJobTitle(aJobTitle);
		hourlyPay = aHourlyPay;
	}

	/**
	 * Accessor method for the hourly pay of this HourlyEmployee
	 *
	 * @return <i>hourlyPay</i> of the HourlyEmployee.
	 */
	public double getHourlyPay() {
		return hourlyPay;
	}

	/**
	 * Mutator method for the hourly pay of this HourlyEmployee
	 *
	 * @param <i>hourlyPay</i> is >= than than the
	 * MINIMUMWAGE.
	 * 
	 * postcondition: the HourlyEmployee's <i>hourlyWage</i> has been set to
	 * the value of the parameter of the parameter <i> hourlyWage</i> if and
	 * only if the parameter is >= to the <i>MINIMUMWAGE</i>.
	 */
	public void setHourlyPay(double aHourlyPay) {
		if(aHourlyPay >= MINIMUMWAGE){
			this.hourlyPay = aHourlyPay;
		}	
		else{
			JOptionPane.showMessageDialog(null, "Error: hourlyPay is < the minimum wage");
		}
	}

	/**
	 * Method computes the paycheck the employee earns every two weeks.
	 *
	 * @return the amount of money the Employee makes every two weeks is
	 * returned.
	 * 
	 */
	public double computeBiweeklyPaycheck() {
		 double biWeeklyPayCheck = hourlyPay * 80;
		 return biWeeklyPayCheck;
	}

	/**
	 * postcondition: all of the information about this Hourly Employee will be
	 * printed to the console.
	 */
	public void print() {
		super.print();
		//hint: should you call the print method in
		//  the parent class
		
	}
}
