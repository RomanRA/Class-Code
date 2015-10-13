
public class Recursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//final int ENDING = 5;
		//counter(ENDING);
		
		//int total = counter2(ENDING);
		
		//System.out.println("The total is: " + total);
		
		String[] alpha = { "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		
		print(alpha,0);
	}
	
	public static void print(String []ar, int index){
	// first think of stop case
		if(index >= ar.length){
			return ;
		}
		int sum = 0;
		//wayin
		//System.out.println("About to recurse: aNumber is: "+aNumber+ " and sum is: " +sum);
		System.out.println("ar[" +index+ "] = " + ar[index]);
		//sum = aNumber+counter2(aNumber-1);
		print(ar, index +1);
		//wayout
		System.out.println("ar[" +index+ "] = " + ar[index]);
		//returns to last call
		// goes to stop point on stack then reads  one number at time and then removes from stack
		//System.out.println("Returned for counter2 call, aNumber is: "+aNumber+ " and the sum is " +sum);
		
		//return sum;
	}

}
