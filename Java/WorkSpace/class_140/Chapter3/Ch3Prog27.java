package Chapter3;
import java.util.Scanner;
public class Ch3Prog27 {
/*Write a program that asks the user to enter a month (1 for January, 2 for February,
and so on) and then prints the number of days in the month. For February, print “28
or 29 days”.
Enter a month: 5
30 days*/
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numUser;
		
		
		System.out.println("Enter a month(for example 1 for January, 2 for february, and so on.");
		numUser = input.nextInt();
		
		if(numUser==1 || numUser==3 || numUser==5 || numUser==7 || numUser==8 || numUser==10 || numUser==12)
		{
			System.out.println("31 days");
		}
		else if(numUser==4 || numUser==6 || numUser==9 || numUser==11)
		{
			System.out.println("30 days");
		}
		else if(numUser==2)
		{
			System.out.println("28 or 29 days");
		}
		
		
		
		
		

	}

}
