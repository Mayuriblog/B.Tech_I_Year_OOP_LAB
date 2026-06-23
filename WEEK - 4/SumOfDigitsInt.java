import java.util.Scanner;
class SumOfDigitsInt
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
			rev=rev+rem;
			number=number/10;
		}
		System.out.println("Sum Of Digits of the given number: "+rev);
	}
}