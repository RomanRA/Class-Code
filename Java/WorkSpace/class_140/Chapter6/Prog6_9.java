//Richard Roman
package Chapter6;

public class Prog6_9 {

/*
 * This Program has a method public static boolean equals(int[] a, int[] b)
 * that checks whether two arrays have the same elements in the same order.
 */
	
	public static void main(String[] args) {
		int[]a = {1,2,3,4};
		int[]b = {1,2,3,4};
		boolean answer = Prog6_9.equals(a,b);
		if(answer == true){
			System.out.println("The two arrays are equal.");
		}
		else{
			System.out.println("The two arrays are not equal");
		}

	}

	public static boolean equals(int[]a,int[]b)
	{
		if(a.length == b.length)
		{
			int i=0;
			while(i<a.length)//check for length 
			{
				if(a[i]==b[i])//check for elements
				{
					i++;
				}
				else
				{
					return false;
				}//end nested if
			}//end while
			return true;
		}
		else
		{
			return false;
		}
	}
}
