//Richard Roman
package Chapter6;

public class Prog5_4 {
	/*
	 * A method
	 * public static String middle(String str)
	 * that returns a string containing the middle character in str if the length of str is odd,
	 * or the two middle characters if the length is even. For example, middle("middle")
	 * returns "dd".
	 */
	
	public static void main(String[] args) {
		String str = "bubble";
		String middleChar = Prog5_4.middle(str);
		System.out.println(middleChar);
	}

	
	public static String middle(String str){
		
		int number = str.length();{
			if(number%2 == 0){
				String sub1 = str.substring(number/2 -1,number/2 +1);
				str =(sub1);
				String answer = str;
			}
			else {
				String sub1 = str.substring(number/2,number/2+1);
				str = (sub1);
				String answer = str;
			}
		}
		return str;
	}
}
		

		
		
	

