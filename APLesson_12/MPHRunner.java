import java.util.Scanner;
 public class MPHRunner
 {
 	public static void main(String[]args)
 	{
 		Scanner kb = new Scanner(System.in);
 		System.out.println("Distance in miles:");
 		int dist = kb.nextInt();
 		System.out.println("Hours:");
 		int hour = kb.nextInt();
 		System.out.println("Minutes:");
 		int mins = kb.nextInt();
		
 		MPH object = new MPH(dist, hour, mins);
		
		System.out.println("\nUser Input:");
		System.out.println(object.getDistance() + " miles in " + object.getHours() + " hours and " + object.getMinutes() + " minutes = " + object.getMPH() + " mph.");
 		
 		object.setValues(10, 2, 0);
 		
 		System.out.println(object.getDistance() + " miles in " + object.getHours() + " hours and " + object.getMinutes() + " minutes = " + object.getMPH() + " mph.");
 	}
 } 
