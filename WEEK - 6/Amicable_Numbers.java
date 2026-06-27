import java.util.Scanner;
class Amicable_Numbers
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int first_number=sc.nextInt();
		int second_number=sc.nextInt();
		int sum=0;
		for(int i=1;i<=first_number/2;i++)
		{
			if(first_number%i==0)
			{
				sum=sum+i;
				//System.out.print(i+" ");
			}
		}
		if(sum==second_number)
			System.out.println("The numbers are Amicable Numbers.");
		else
			System.out.println("The numbers are not Amicable Numbers.");
	}
}