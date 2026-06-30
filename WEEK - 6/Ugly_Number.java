import java.util.Scanner;
class Ugly_Number
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=sc.nextInt();
		int temp=number;
		if(number<=0)
		{
			System.out.println(number+" is not an ugly Number");
			return;
		}
		while(number%2==0)
			number/=2;
		while(number%3==0)
			number/=3;
		while(number%5==0)
			number/=5;
		if(number==1)
			System.out.println(temp+" is an ugly Number");
		else
			System.out.println(temp+" is not an ugly Number");
	}
}