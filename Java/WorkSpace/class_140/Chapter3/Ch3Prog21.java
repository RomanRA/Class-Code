//Richard Roman
package Chapter3;
import java.util.Scanner;
public class Ch3Prog21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double income = 0;
		final double TAX_RATE1=0.01;
		final double TAX_RATE2=0.02;
		final double TAX_RATE3=0.03;
		final double TAX_RATE4=0.04;
		final double TAX_RATE5=0.05;
		final double TAX_RATE6=0.06;
		double tax=0;
		double diff=0;
		double tax1=0,tax2=0,tax3=0,tax4=0,tax5=0,tax6=0;
	
		System.out.println("Please enter amount balance");
		income = input.nextDouble();
		System.out.printf("Income you entered is: $%.2f",income);
		
		if(income >= 0 && income <=50000){
			tax = income * TAX_RATE1;
		}
		else if((50000 > income)&& (income <= 75000)){
			 diff = income - 50000;
			 tax2 =  diff * TAX_RATE2;
			 tax1 =  50000 * TAX_RATE1;
			
			tax = tax2 + tax1;
		}
		else if((income >75000) && (income <= 100000)){
			diff = income - 75000;
			tax3 = diff * TAX_RATE3;
			tax2 = 25000 * TAX_RATE2;
			tax1 = 50000 * TAX_RATE1;
			
			tax = tax1 + tax2 + tax3;	
		}
		else if((income >100000) && (income <= 250000)){
			diff = income - 100000;
			tax4 = diff * TAX_RATE4;
			tax3 = 25000 * TAX_RATE3;
			tax2 = 25000 * TAX_RATE2;
			tax1 = 50000 * TAX_RATE1;
			
			tax = tax1 + tax2 + tax3 + tax4;
		}
		else if ((income >250000) && (income <= 500000)){
			diff = income - 250000;
			tax5 = diff * TAX_RATE5;
			tax4 = 150000 * TAX_RATE4;
			tax3 = 25000 * TAX_RATE3;
			tax2 = 25000 * TAX_RATE2;
			tax1 = 50000 * TAX_RATE1;
			
			tax = tax1 + tax2 + tax3 + tax4 + tax5;
		}
		else if( income > 500000){
			diff = income - 500000;
			tax6 = diff * TAX_RATE6;
			tax5 = 250000* TAX_RATE5;
			tax4 = 150000 * TAX_RATE4;
			tax3 = 25000 * TAX_RATE3;
			tax2 = 25000 * TAX_RATE2;
			tax1 = 50000 * TAX_RATE1;
		
		tax = tax1 + tax2 + tax3 + tax4 + tax5 + tax6;
		}
		else
		{
			System.out.println("\nInvalid income");
		}	

		
		System.out.printf("\nThe tax on $%.2f is $%.2f", income, tax);
		
	
	}
	
	}

	




