//Richard Roman
package Chapter6;

public class Prog5_3 {

	
	public static void main(String[] args) {
		int n = 1729;
		int firstDigit = Prog5_3.first(n);
		System.out.println("first is: "+firstDigit);
		int lastDigit =  Prog5_3.last(n);
		System.out.println("last is: "+lastDigit);
		int totalDigits = Prog5_3.total(n);
		System.out.println("total digits is: "+ totalDigits);

	}

	public static int first(int n){
		String number = Integer.toString(n);
		String sub1 = number.substring(0,1);
		n = Integer.parseInt(sub1);
		return n;
	}
	
	public static int last(int n){
		String number = Integer.toString(n);
		String sub1 = number.substring(3);
		n = Integer.parseInt(sub1);
		return n;
	}
	
	public static int total(int n){
		String number = Integer.toString(n);
		int x = number.length();
		return x;
	}
}

