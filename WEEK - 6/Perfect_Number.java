import java.util.Scanner;
class Perfect_Number
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=sc.nextInt();
		int sum=0;
		for(int i=1;i<=number/2;i++)
		{
			if(number%i==0)
				sum+=i;
			//System.out.println(sum);
		}
		if(sum==number)
			System.out.println(number+" is a Perfect Number");
		else
			System.out.println(number+" is not a Perfect Number");
	}
}