import java.util.Scanner;

class Exponent
{
	public static int calc(int base,int exp)
	{
		int res=1;
		for(int i=1;i<=exp;i++)
			res=res*base;
		return res;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the base : ");
		int base=sc.nextInt();
		System.out.print("Enter the exponent : ");
		int exp=sc.nextInt();
		System.out.print(base+" raises to the power of "+exp+" is: "+calc(base,exp));
	}
}