//Richard Roman
package Chapter2;
import java.util.Scanner;

public class TestProgramPractice_2 {

	/*
	 * This program calculates which is more cost effective cans or a two liter bottle.
	 * 
	 */
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		//Declare variable
		int numCansPerPack=0;
		double pricePerPack=0;
		double pricePerBottle=0;
		int numLitersPerBottle=0;
		boolean drinkWholeCan=false;
		
		final double OUNCES_PER_LITER=33.8;
		final double OUNCES_PER_CAN=12.0;
		
		double ouncesInBottle=0;
		double ouncesInPack=0;
		double unitPriceBottle=0;
		double unitPriceCans=0;
		
		System.out.println("Enter nummber of cans per pack;" );
		numCansPerPack = userInput.nextInt();
		System.out.println( "Number of cans per pack:" +numCansPerPack);

		System.out.println("Enter price per pack;" );
		pricePerPack = userInput.nextDouble();
		System.out.println( "price per pack:" +pricePerPack);
	
		System.out.println("Enter number of liters per bottle;" );
		numLitersPerBottle = userInput.nextInt();
		System.out.println( "price per Bottle:" +numLitersPerBottle);
		
		System.out.println("Enter price per Bottle;" );
		pricePerBottle = userInput.nextDouble();
		System.out.println( "price per bottle:" +pricePerBottle);
		
		System.out.println("do you drink a whole can at at time? Aswere yes or no");
		String input = userInput.next();
		
		//String upperInput = inout.toUpperCase();
		//char upperChar = upperInput.charAt(0);
		
		if (input.toUpperCase().charAt(0) == 'Y')
		{
			drinkWholeCan=true;
		}
		else
		{
			drinkWholeCan=false;
		}
		System.out.println("Drinks Whole Can: " +drinkWholeCan);
		
		ouncesInBottle = numLitersPerBottle * OUNCES_PER_LITER;
		ouncesInPack = numCansPerPack * OUNCES_PER_CAN;
		unitPriceBottle= pricePerBottle/ouncesInBottle;
		unitPriceCans=pricePerPack/ouncesInPack;
		
		System.out.println("Unite price for bottle:" + unitPriceBottle);
		System.out.println("Unite price per can:" + unitPriceCans);
		
		//to round need to declare new variables
		long uPBottleRounded = Math.round(unitPriceBottle * 100);
		System.out.println("Bottle rounded:" + uPBottleRounded);
		long uPCansRounded = Math.round(unitPriceCans* 100);
		System.out.println("Cans rounded:" + uPCansRounded);
		
		
		//if first true then skip everything
		if (uPBottleRounded < uPCansRounded)
		{
			System.out.println("Buy the bottles");
		}
		else if(uPBottleRounded > uPCansRounded)
		{
			System.out.println("Buy the cans");
		}
		else if(uPBottleRounded == uPCansRounded && drinkWholeCan);
		{
			System.out.println("Same price but buy cans");
		}
		else{
		//if (uPBottleRounded == uPCanRounded && !drinkWhileCan);
		}
			//System.out.println("uy bottle same price")
		
		
		/*if (uPBottleRounded < uPCansRounded){
			System.out.println("Buy the bottles");
			
		}
		else
			//System.out.println("Buy the cans");
			if (uPBottleRounded == uPCansRounded){
				System.out.println("Same Price");
				//system.out.println("same price");
				if (drinkWholeCan)
				{
					
					System.out.println("same price but buy cans");
				}
				else 
					
					System.out.println("Same Price but buy bottle");
			}
			else System.out.println("Buy the cans");*/	
			}
	}
		
		
		
		