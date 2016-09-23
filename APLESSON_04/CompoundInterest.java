public class CompoundInterest
{
	public static void main(String[]args)
	{
		CompoundInterest average = new CompoundInterest();
		double r = 3;
		double P = 40;
		double n = 2;
		double t = 5;
		double comp = average.calcInterest(r, P, n,t);
		System.out.printf("Your total monthly payment is $%3.2f\n",comp);
		
	}
	
	public double calcInterest(double r, double P, double n, double t)
	{
		return((P*(Math.pow( 1+r/n, n*t))))(t*12);
	}
}
