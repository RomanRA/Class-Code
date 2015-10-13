//Richard Roman
package Chapter6;

public class Prog5_5 {
	/*
	 * This has a method that returns  the string str repeated n times.
	 * for example,repeat("ho",3) returns "hohoho"
	 */
	
	public static void main(String[] args) {
		int n = 3;
		String str = "ho";
		String word = Prog5_5.repeat(str,n);
		System.out.println(word);
	}

	public static String repeat(String str, int n){
		String result = "";//emptyString //String result= "";
		for(int i = 0; i<n;i++){
			result = result + str;
		}
		return result;
	}
}

	

	

