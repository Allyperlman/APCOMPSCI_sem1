import java.util.Scanner; 
public class Adventure
{
		public static void main(String[]args)
		{
			Scanner kb = new Scanner(System.in);

			System.out.println("You're entering the jungle. Would you like to go to the right or left?");
			String choice = kb.next();
			kb.nextLine();
			if(choice.equals("Right") || choice.equals("Left"))
			{
				if(choice.equals("Right"))//story starts here. 
				{
					System.out.println("You find a cave. Would you like to go in or keep walking?");
					choice = kb.nextLine();
					if(choice.equals("Go in"))
					{
						System.out.println("You find a box. Would you like to open it or not?");
						choice = kb.nextLine();
						if(choice.equals("Yes"))
						{
							System.out.println("You have found the hidden treaure. Yay!");
						}
						else
						{
							System.out.println("A monster finds you in his cave and eats you.");
						}
					}
					else 
					{
					System.out.println("You run into a spider web. Do you kill the spider or let it eat you?");
						if(choice.equals("Kill the spider"))
						{
							System.out.println("You are smart and you survive.");
						}
						else
						{
							System.out.println("You are dumb for letting it eat you, and you die.");
						}
					}
				}
				else
				{
					System.out.println("You find an abandoned house. Would you like to go in or keep walking?");
					choice = kb.nextLine();
					if(choice.equals("Go in"))
					{
						System.out.println("The ghost of the house has eaten you.");
					}
					else
					{
						System.out.println("You survived by being smart and cautious.");
					}
					
				}

			}
			else
			{
				System.out.println("Please enter Right or Left");
			}
			
		
		}
}
