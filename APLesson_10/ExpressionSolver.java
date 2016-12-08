import java.util.*;
public class ExpressionSolver
{
	static Scanner kb = new Scanner(System.in);
	public static void main(String[]args)
	{
		System.out.print("Please enter an equation: ");
		String equation = kb.nextLine();
		ArrayList<String> equationAL = new ArrayList<String>(Arrays.asList(equation.split(" ")));
		doEquation(equationAL, equation);
	}
	
	public static void doEquation(ArrayList<String> equationAL, String equation)
	{
		int i = 0;
		while(i<equationAL.size())
		{
			if(equationAL.get(i).equals("*") || equationAL.get(i).equals("/")){
				if(equationAL.get(i).equals("*"))
				{
					Integer foo = (Integer.parseInt(equationAL.get(i-1)) * Integer.parseInt(equationAL.get(i+1)));
					equationAL.set(i, " " + foo);
				}
				else 
				{
					Integer foo = Integer.parseInt(equationAL.get(i-1)) / Integer.parseInt(equationAL.get(i+1));
					equationAL.set(i, " " + foo);			
				}
				equationAL.remove(i-1);
				equationAL.remove(i);
				i = 0;
			}
			i++;
		}
		i = 0;
		while(i<equationAL.size())
		{
			if(equationAL.get(i).equals("+") || equationAL.get(i).equals("-")){
				if(equationAL.get(i).equals("+"))
				{
					Integer foo = Integer.parseInt(equationAL.get(i-1)) + Integer.parseInt(equationAL.get(i+1));
					equationAL.set(i, " " + foo);
				}
				else 
				{
					Integer foo = (Integer.parseInt(equationAL.get(i-1)) - Integer.parseInt(equationAL.get(i+1)));
					equationAL.set(i, " " + foo);
				}
				equationAL.remove(i-1);
				equationAL.remove(i);
			}
			i++;			
		}
		
		System.out.println(equation + " = " + equationAL);
	
	}

}