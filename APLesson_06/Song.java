public class Song
{
		static String song = "";
		public static void main(String[]args)
		{
			sing ("Na", 4);
			sing ("Na", 4);
			sing ("Hey", 3);
			sing("Goodbye!", 1);
		System.out.println(song);

		}
	
		public static void sing(String word, int count)
		{
			for (int i = 1; i <= count; i++)
			{
				song = song + word + " ";
			}
			song = song + "\n";
		}
}		