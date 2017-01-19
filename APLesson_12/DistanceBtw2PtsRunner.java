import java.util.Scanner;
public class DistanceBtw2PtsRunner
 {
 	public static void main(String[]args)
 	{
 		Scanner kb = new Scanner(System.in);
 		System.out.println("x-coordinate of first point:");
 		int xin1 = kb.nextInt();
 		System.out.println("y-coordinate of first point:");
 		int yin1 = kb.nextInt();
		System.out.println("x-coordinate of second point:");
 		int xin2 = kb.nextInt();
		System.out.println("y-coordinate of second point:");
 		int yin2 = kb.nextInt();
 		
 		DistanceBtw2Pts object = new DistanceBtw2Pts(xin1, yin1, xin2, yin2);
 		
 		System.out.println("Distance between (" + object.getX1() + ", " + object.getY1() + ")and (" + object.getX2() + ", " + object.getY2() +") is " + object.getDistance());
 		
 		object.setValues(0,0,1,1);
 		
 		System.out.println("Distance between (" + object.getX1() + ", " + object.getY1() + ")and (" + object.getX2() + ", " + object.getY2() +") is " + object.getDistance());
 	}
 } 