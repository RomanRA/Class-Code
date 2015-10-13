//richard roman	
package Chapter3;
import java.util.Scanner;
public class Ch3Prog16 {

	/*
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String item1;
		String item2;
		String item3;
		
		System.out.println(" Enter three strings");
		item1 = input.next();
		item2 = input.next();
		item3 = input.next();
		
		item1.toUpperCase();
		item2.toUpperCase();
		item3.toUpperCase();
		// Every time you call next the pro waits
		//System.out.println( item1+" "+item2+" "+item3+" ");
		
		
		// item2 is first
		if ((item1.compareTo(item2)<0)&&(item1.compareTo(item3)<0))
		{
			System.out.println(item1);}
		else{	
		}
		if ((item2.compareTo(item1)<0)&&(item2.compareTo(item3)<0)){
			System.out.println(item2);
		}
		else{	
		}
		if ((item3.compareTo(item1)<0)&&(item3.compareTo(item2)<0)){
			System.out.println(item3);
		}
		else{	
		}
	
		
		
		//case item2 is first
		
		
		/////
		
	}
}
