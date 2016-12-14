import java.util.Random;
public class RandomNumbers
{
	static Random rand = new Random();
	public static void main(String[]args)
	{
		int[][]values = new int [4][4];
		values [0][0] = rand.nextInt(101);
		values [0][1] = rand.nextInt(101);
		values [0][2] = rand.nextInt(101);
		values [0][3] = rand.nextInt(101);
		values [1][0] = rand.nextInt(101);
		values [1][1] = rand.nextInt(101);
		values [1][2] = rand.nextInt(101);
		values [1][3] = rand.nextInt(101);
		values [2][0] = rand.nextInt(101);
		values [2][1] = rand.nextInt(101);
		values [2][2] = rand.nextInt(101);
		values [2][3] = rand.nextInt(101);
		values [3][0] = rand.nextInt(101);
		values [3][1] = rand.nextInt(101);
		values [3][2] = rand.nextInt(101);
		values [3][3] = rand.nextInt(101);
		
		
		for(int i = 0; i< values.length; i++)
		{
			for(int j = 0; j < values[i].length; j++)
			{
				System.out.print(values[i][j] + "\t");
			}
			System.out.println();
		}
	}
}