
public class Account extends Object {
	
	private abstract static int accountNumberCounter = 1;//only one instance of variable
	
	private int accountNumber;
	private double balance;
	
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	public  double getBalance()
	{
		return balance;
	}
}
