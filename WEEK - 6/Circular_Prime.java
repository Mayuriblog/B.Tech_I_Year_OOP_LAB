import java.util.Scanner;
class Circular_Prime
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=sc.nextInt();
		boolean flag=false;
		String str=String.valueOf(number);
		for(int s=0;s<str.length();s++)
		{
			System.out.println(str);
			int rotated=Integer.valueOf(str);
			for(int i=2;i<=Math.sqrt(rotated);i++)
			{
				if(rotated%i==0)
				{
					flag=true;
					break;
				}
			}
			str=str.substring(1)+str.charAt(0);
			
		}
		if(flag)
			System.out.println(number+" not a circular prime number");
		else
			System.out.println(number+" circular prime number");
	}
			
}