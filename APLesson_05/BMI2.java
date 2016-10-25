import java.util.Scanner; 
public class BMI2
{
		public static void main(String[]args)
		{
			Scanner keyboard = new Scanner(System.in);
			
			System.out.println("Enter your height");
			double h = keyboard.nextDouble();
			System.out.println("Enter your weight");
			double w = keyboard.nextDouble();	
			double bmi = 703* w /( h * h);
			String condition = calcCond(bmi);
			System.out.println("Your Body Mass Index is " + bmi );
			System.out.println("You are " + condition);
		}			

		public static String calcCond(double bmi)
		{
			if (bmi < 18.5)
				return "Underweight";
			else if (bmi < 24.9)
				return "Normal";
			else if (bmi < 29.9)
				return "Overweight";
			else if (bmi < 34.9)
				return "Obese";
			else if (bmi < 39.9)
				return "Very Obese";
			else 
				return "Morbidly Obese";
		}
}