import java.util.Scanner; 
public class GPACalc
{
		public static void main(String[]args)
		{
			Scanner keyboard = new Scanner(System.in);
			
			System.out.println("Enter your math grade");
			String m = keyboard.nextLine();
			System.out.println("Enter your english grade");
			String e = keyboard.nextLine();	
			System.out.println("Enter your computer science grade");
			String cs = keyboard.nextLine();
			System.out.println("Enter your history grade");
			String h = keyboard.nextLine();
			System.out.println("Enter your physical education grade");
			String pe = keyboard.nextLine();
			System.out.println("Enter your film and society grade");
			String fs = keyboard.nextLine();
			System.out.println("Enter your psychology grade");
			String p = keyboard.nextLine();
			
			
			double gPoints = calcPoints(m) + calcPoints(e) + calcPoints(cs) + calcPoints(h) + calcPoints(pe) + calcPoints(fs) + calcPoints(p);
			double GPA = gPoints/7;
			System.out.println("Your GPA is... " + GPA);
		
		}
			
		public static double calcPoints(String grade)
		{
			double gradePoints = 0.0;
			if (grade.equals("A"))
				gradePoints = 4.0;
			if (grade.equals("B"))
				gradePoints = 3.0;
			if (grade.equals("C"))
				gradePoints = 2.0;
			if (grade.equals("D"))
				gradePoints = 1.0;
			if (grade.equals("F"))
				gradePoints = 0;
			return gradePoints;
		}
				
			
		
}		
