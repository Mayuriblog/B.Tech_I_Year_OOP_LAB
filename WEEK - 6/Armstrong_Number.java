import java.util.Scanner;
class Armstrong_Number
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=sc.nextInt();
		int temp=number;
		int sum=0;
		while(number!=0)
		{
			int rem=number%10;
			sum=sum+(rem*rem*rem);
			number=number/10;
		}
		if(temp==sum)
			System.out.println("The given number is armstrong number");
		else
			System.out.println("The given number is not armstrong number");
	}
}