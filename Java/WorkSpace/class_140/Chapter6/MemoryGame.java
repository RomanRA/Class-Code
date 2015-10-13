//Richard Roman
package Chapter6;

import java.util.Random;
import java.util.Scanner;

public class MemoryGame {

	public static void main(String[] args) 
	{
		MemoryGame.playMyGame();
	}
	public static void playMyGame()	
	{	
		final int ROWS =2;
		final int COLS =2;
		char[][] board = new char[ROWS][COLS];
		char[][] status = new char[ROWS][COLS];
		
		initializeBoard(board,status);
		//printBoard(board,status);
		
		boolean gameOn = cardsStillDown(status);
		int tries = 0;
		while(gameOn)
		{
			takeTurn(board,status);
			tries++;
			gameOn = cardsStillDown(status);
		}
	}
	
	
	
	public static boolean cardsStillDown(char[][]s)
	{
		for(int i = 0; i<s.length;i++)
		{
			for(int j=0; i<s[i].length;j++)
			{
				if(s[i][j] == 'D')
				{
					return true;
				}
				
			}
		}
		return false;
	}
	public static void takeTurn(char[][]b,char[][]s)
	{
		Scanner in = new Scanner(System.in);
		int r=0, r2=0;
		int c=0, c2=0;
		
		System.out.println("Taking a turn.....");
		printBoard(b,s);
		
		//first card
		System.out.println("Enter row and column(ex. 0 2)");
		r = in.nextInt();
		c = in.nextInt();
		s[r][c] = 'T';
		System.out.println("\n\n");
		printBoard(b,s);
		
		//second card
		System.out.println("Enter row and column(ex. 0 2)");
		r2 = in.nextInt();
		c2 = in.nextInt();
		s[r2][c2] = 'T';
		System.out.println("\n\n");
		printBoard(b,s);
		
		if(b[r][c]==b[r2][c2])
		{
			s[r][c]='U';
			s[r2][c2]='U';
			System.out.println("Good job--Match!");
		}
		else
		{
			s[r][c] = 'D';
			s[r2][c2] = 'D';
			System.out.println("No match--Try Again.(Hit enter");
		}
		in.nextLine();
		in.nextLine();// pauses until user enter enter
	}
	
	
	
	public static void initializeBoard(char[][]b,char[][]s)
	{
		char card = 'A';
		int cardCount=0;
		for(int i = 0;i<b.length;i++)//rows
		{
			for(int j =0;j<b[i].length; j++)///cols
			{
				s[i][j] = 'D';
				b[i][j] = card;
				cardCount++;
				if(cardCount==2){
					card++;
					cardCount=0;
				}//end if
				
			}//end inner for
			//System.out.println("\n");
		}//end of outer for
		
		shuffleBoard(b);
	}//end method
	
	
	
	
	public static void shuffleBoard(char[][]b)
	{
		Random gen= new Random();
		int r1=0,c1=0,r2=0,c2=0;
		
		for(int i=0; i<5000;i++)
		{
			
			//generate two random locations
			r1 = gen.nextInt(b.length);
			c1 = gen.nextInt(b[0].length);
			r2 = gen.nextInt(b.length);
			c2 = gen.nextInt(b[0].length);
			//swap character at those two locations
			char temp = b[r1][c1];
			b[r1][c1] = b[r2][c2];
			b[r2][c2] = temp;
		}
	}
	
	
	
	public static void printBoard(char[][]b,char[][]s)
	{
		for(int i = 0;i<b.length;i++)//rows
		{
			for(int j =0;j<b[i].length; j++)///cols
			{
				if(s[i][j]== 'D')
				{
					System.out.print("? ");
				}
				else//if U or T
				{
				System.out.print(b[i][j]+" ");
				}
			}
			System.out.println("\n");
		}
		
	}
}
