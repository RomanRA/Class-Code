import java.util.Scanner;


public class HousePainting {

	
	
public static void main(String[] args) {

	
/*Scanner input = new Scanner(System.in);
int x = input.nextInt();//Need to declare variable first
double y = Math.pow(3, 2);// this will work by it self
*/	

double rawArea=PaintCalc.calculateSurfaceAreaOfHouse();
System.out.println("area + rawArea");

double rawArea2 = PaintCalc.calculateSurfaceAreaOfHouse();
System.out.println("area2:" +rawArea2);
	}
	

}
