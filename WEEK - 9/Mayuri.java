class Mayuri
{
	public static void main(String args[]) throws Exception
	{
		for(int i=1;i<=100;i++)
		{
			System.out.print("\rHello World "+i);
			Thread.sleep(1000);
		}
	}
}