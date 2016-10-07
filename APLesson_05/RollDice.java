import java.util.Random;
public class RollDice
{
		public static void main(String[]args)
		{
			 Random rand = new Random();
			 int P = rand.nextInt(7);
			 System.out.println("You rolled a " + P);
			 int C = rand.nextInt(7);
			 System.out.println("Computer rolled a " + C);	
			 boolean output = RollDice(P,C);
			 if (output){
				 System.out.println("You Win!!");
			 } if (!output){
				 System.out.println("Computer Win... :(");
			 }
		}
		static boolean output;
		public static boolean RollDice(int P, int C)
		{
		
			if (P > C){
				output = true;
			} if(C > P){
				output = false;
			}
			return output;
		}
		
}

