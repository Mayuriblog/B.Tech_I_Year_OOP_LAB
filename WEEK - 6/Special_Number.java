import java.util.Scanner;
class Special_Number
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=sc.nextInt();
		int sum=0;
		int temp=number;
		while(number>0)
		{
			int f=1;
			int rem=number%10;
			for(int i=rem;i>0;i--)
			{
				f=f*i;
			}
			System.out.println(f);
			sum+=f;
			number=number/10;
		}
		if(sum==temp)
			System.out.println(temp+" is a Special Number");
		else
			System.out.println(temp+" is not a Special Number");
			
	}
}
		