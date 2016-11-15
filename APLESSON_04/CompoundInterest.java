import java.util.Scanner; 
public class CompoundInterest
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		CompoundInterest average = new CompoundInterest();
		System.out.println("Please enter ");
		double r = kb.nextDouble();
		System.out.println("Please enter ");
		double P = kb.nextDouble();
		System.out.println("Please enter ");
		double n = kb.nextDouble();
		System.out.println("Please enter ");
		double t = kb.nextDouble();
		double comp = average.calcInterest(r, P, n,t);
		System.out.printf("Your total monthly payment is $%3.2f\n",comp);
		
	}
	
	public double calcInterest(double r, double P, double n, double t)
	{
		return((P*(Math.pow(1+r/n, n*t))))/(t*12);
	}
}
