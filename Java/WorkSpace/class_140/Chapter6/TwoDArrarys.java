package Chapter6;

public class TwoDArrarys {


	public static void main(String[] args) {
		
		final int ROWS = 6;
		final int SEATS= 4;
		
		//first []rows 2nd[]columns
		char[][]chart= new char[ROWS][SEATS];
		
		//initialize
		//common algorithm of rows and columns
		for(int i = 0;i<chart.length;i++)//chart.length refers to number of row
		{
			for(int j = 0; j<chart[i].length;j++)//this refers to columns
			{
				chart[i][j]='*';
			}
		}
		
		
		for(int i = 0;i<chart.length;i++)//chart.length refers to number of row
		{
			for(int j = 0; j<chart[i].length;j++)//this refers to columns
			{
				System.out.print(chart[i][j]);
			}
		System.out.println("\n");
		}
		

	}

}
