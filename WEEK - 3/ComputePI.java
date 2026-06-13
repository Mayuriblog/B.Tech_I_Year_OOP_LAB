// PI=4*(1-1/3+1/5-1/7+...)
import java.util.Scanner;
class ComputePI
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int MAX_DENOMINATOR=10000;
		double sum=0.0;
		int term=1;
		for(int denom=1;denom<=MAX_DENOMINATOR;denom+=2)
		{
				sum+=(1.0/denom*term);
			    term=term*(-1);
		}
		sum=4.0*sum;
		System.out.println("PI value: "+sum);
	}
}