import java.util.Scanner;
class Fibonacci
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int f0=0,f1=1,f2,sum;
		double average=0.0;
		sum=f0+f1;
		System.out.print(f0+" "+f1+" ");
		for(int i=2;i<=20;i++)
		{
			f2=f0+f1;
			sum+=f2;
			System.out.print(f2+" ");
			f0=f1;
			f1=f2;
		}
		average=sum/20.0;
		System.out.println("\naverage : "+average);
		
		
	}
}