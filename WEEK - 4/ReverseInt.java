import java.util.Scanner;
class ReverseInt
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=sc.nextInt();
		int rev=0;
		while(number!=0)
		{
			int rem=number%10;
			rev=rev*10+rem;
			number=number/10;
		}
		System.out.println("Reverse of the given number: "+rev);
	}
}