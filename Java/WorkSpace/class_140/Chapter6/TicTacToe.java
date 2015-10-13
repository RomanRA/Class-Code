//Richard Roman
package Chapter6;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) 
	{
		TicTacToe.playGame();
	}
	public static void playGame() 
	{
		Scanner in  = new Scanner(System.in);
		String[][] board = new String[3][3];
		//self check initBoard(board);
		//self check printBoard(board);
		
		System.out.println("Do you want to play tic tac toe? yes or no");
		String choice = in.next();
		while(choice.toLowerCase().substring(0,1).equals("y")) {
			
			//Fills the board with spaces or asterisks
			initBoard(board);
			String winner = "none";
			char player = 'X'; //to be toggled back and forth
			while(winner.equals("none"))
			{
				//Prints the board to the screen
				printBoard(board);
				
				//Prompts the player (X or O) for location
				// then puts the corresponding character 
				// in that spot if it's not taken. While the
				// chosen spot is invalid or unavailable, 
				// prompt again.
				playerTakeTurn(board,player);
				
				//Checks to see if the X's or O's have won,
				// if there is a draw. Return "x" if the X's
				// win, "o" if the O's win, "draw" if no one
				// will win (board is full), and "none" if the
				// game is still going.
				winner = checkForWinner(board);
				System.out.println(winner+" player: "+player);
				//Toggles player. If player is currently X,
				// change to O, and vice versa
				player = togglePlayer(player);
			}
			printBoard(board);
			
			System.out.println("Do you want to play tic tac toe? yes or no");
			choice = in.next();
			
		}
		System.out.println("Thank you for playing!");
	}//End Program
	
	
	//player playing	
	public static void playerTakeTurn(String [][]b,char player)
	{
		boolean valid = false;
		do
		{
			Scanner in = new Scanner(System.in);
			if(player == 'X')
			{
				System.out.println("Player X ,enter the row and column location you want.");
			}
			else
			{
				System.out.println("Player O ,enter the row and column location you want.");
			}
			int enteredRow = in.nextInt();//i
			int enteredColumn = in.nextInt();//j
			//check to make sure within index parameters
			if(enteredRow>=0 && enteredRow<3 && enteredColumn>=0 && enteredColumn<3 && b[enteredRow][enteredColumn].equals(" "))
			{ 
				b[enteredRow][enteredColumn]= ""+player;
				valid = true;//exit loop after this statement if true
			}
			else
			{
				System.out.println("Please try again, spot is not available");
			}
		}
		while(!valid);	
	}//end playerTakeTurn
	
	//checks for winner
	  public static String checkForWinner(String[][]b)
	  {
		  	String result = "Winner";
		  	String winner = "none";
		  	
		  	if((b[0][0].equals(b[0][1])) && (b[0][0].equals(b[0][2])) && (!b[0][0].equals(" ")))
			{
		  		return result;
			}
			else if((b[0][1].equals(b[1][1])) && (b[0][1].equals(b[2][1])) && (!b[0][1].equals(" ")))
			{
				return result;
			}
			else if ((b[0][2].equals(b[1][2])) && (b[0][2].equals(b[2][2])) && (!b[0][2].equals(" ")))
			{
				return result;
			}
			else if ((b[0][0].equals(b[1][1])) && (b[0][0].equals(b[2][2])) && (!b[0][0].equals(" ")))
			{
				return result;
			}
			else if ((b[0][2].equals(b[1][0])) && (b[0][2].equals(b[2][0])) && (!b[0][2].equals(" ")))
			{
				return result;
			}
			else if((b[0][0].equals(b[1][0])) && (b[0][0].equals(b[2][0])) && (!b[0][0].equals(" ")))
			{
		  		return result;
			}
			else if((b[1][0].equals(b[1][1])) && (b[1][0].equals(b[1][2])) && (!b[1][0].equals(" ")))
			{
				return result;
			}
			else if ((b[2][0].equals(b[2][1])) && (b[2][0].equals(b[2][2])) && (!b[2][0].equals(" ")))
			{
				return result;
			}
			else 
			{
				
				return winner;
			}
	  }	//endCheckWinner
	
	//toggles player	  	
	public static char togglePlayer(char player)
	{
		char result = ' ';
        if (player == 'X')
        {
             return result = 'O';//swaps player
        }
        else if (player == 'O')
        {
             return result = 'X';//swaps player
        }
        else 
        {
             return result = ' ';
        }
	}//end togglePlayer
	
	//initialize board
	public static void initBoard(String[][]b)
	{	
		String blankSpot = " ";
		for(int i=0; i<b.length; i++)
		{
			for(int j=0; j<b[i].length; j++)
			{
				b[i][j]= blankSpot;
			}
		}
	}//end initiBoard
	
	//prints board
	public static void printBoard(String[][]b)
	{
		System.out.println("---------");
		for(int i=0; i<b.length;i++)//rows
		{
			for(int j =0;j<b[i].length; j++)//columns
			{
				System.out.print("|"+b[i][j]+"|");
			}
			System.out.println("\n---------");	
		}
	}//end printBoard
}	
	
	