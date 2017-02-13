public class GameRunner
{
	public static void main(String[]args)
	{
		GameSystem pc = new PC("PC");
		System.out.println(pc);
		GameSystem xbox = new XBox();
		System.out.println(xbox);
		Console ps = new PlayStation();
		System.out.println(ps);
	}
}