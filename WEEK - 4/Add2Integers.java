import java.util.Scanner;
class Add2Integers
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first integer: ");
		int n1=sc.nextInt();
		System.out.println("Enter second integer: ");
		int n2=sc.nextInt();
		int sum=n1+n2;
		System.out.println("Sum of two integers: "+sum);
		
	}
}