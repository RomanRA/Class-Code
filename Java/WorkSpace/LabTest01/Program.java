/* Program.java - has instance variables name of type string, runTime of type int, and the day that the show is aired on.
 * Name:Richard Roman
 * Class:150
 * LabTest01
 * Email: raroman@coastal.edu
 * Date; 10/3/2013
 */
import javax.swing.JOptionPane;
public class Program {

	//attributes - member variable
	private String day = "";
	private String name = "";
	private int runTime = 0;
	
	
	//Default contructor
	public Program()
	{
		day = "no day yet";
		name = "no name yet";
		runTime = 0;
	}
	
	//Overloaded constructor
	public Program(String aName, int aTime, String aDay)
	{
		name = aName;
		runTime = aTime;
		day = aDay;
	}
	
	//Accessors
	public String getName()
	{
		return this.name;
	}
	
	public int getTime()
	{
		return this.runTime;
	}
	
	public String getDay()
	{
		return this.day;
	}
	
	//Mutators
	public void setName(String aName)
	{
		this.name = aName;
	}
	public void setTime(int aTime)
	{
		this.runTime = aTime;
	}
	public void setDay(String aDay)
	{
		this.day = aDay;
	}
	
	//Other methods
	
	public String  toString()
	{
		String text = "";
		text+= this.name + "airs on" +this.day+"for"+ this.runTime +"minutes.";
		return text;
	}
	
	public static void main (String[] args){
		Program test = new Program();
		//String testString = test.toString(); testString
		JOptionPane.showMessageDialog(null, test);
	}
}
