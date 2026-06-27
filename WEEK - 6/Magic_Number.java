import java.util.Scanner;
class Magic_Number
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=sc.nextInt();
		int temp=number;
		while(temp>9)
		{
			int sum=0;
			while(temp>0)
			{   
			    int rem=temp%10;
				sum=sum+rem;
				temp/=10;
			}
			temp=sum;
		}
		if(temp==1)
			System.out.println(number+" is a Magic number");
		else
			System.out.println(number+" is not a Magic number");
	}
}