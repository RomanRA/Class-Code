/*Richard Roman*/

package Chapter2;
/*
 * This program prompts the user for the drive letter
 * (c),the path(\windows\system),the filename(readme), and the extension(txt)
 * Then print the complete file name.
 */
import java.util.Scanner;

public class Ch2Prog12 {

	public static void main(String[] args) 
	{
		Scanner input;
		input = new Scanner (System.in);
		
		System.out.print("Please enter drive letter:");
		String Drive = input.next();
	
		System.out.print("Enter path:");
		String Path = input.next();
		
		System.out.print("Enter filename:");
		String FileName = input.next();
		
		System.out.print("Enter extension:");
		String Extension = input.next();
		
		System.out.println(Drive + ":" + Path + "\\" + FileName + "." + Extension);
		
		

	}

}
