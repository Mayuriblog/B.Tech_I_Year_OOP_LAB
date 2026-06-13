import java.util.Scanner;
class HarmonicSum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		final int MAX_DENOMINATOR=50000;
		double sumL2R=0.0;
		double sumR2L=0.0;
		double absdiff;
		for(int denom=1;denom<=MAX_DENOMINATOR;denom++)
		{
			sumL2R=sumL2R+(1.0/denom);
		}
		for(int denom=MAX_DENOMINATOR;denom>=1;denom--)
		{
			sumR2L=sumR2L+(1.0/denom);
		}
		System.out.println("sumL2R: "+sumL2R);
		System.out.println("sumR2L: "+sumR2L);
		if(sumL2R>sumR2L)
		{
			absdiff=sumL2R-sumR2L;
			System.out.println("sumL2R is more accurate ");
			System.out.println("The absolute diff is: "+absdiff);
			
		}
		else
		{
			absdiff=sumR2L-sumL2R;
			System.out.println("sumR2L is more accurate ");
			System.out.println("The absolute diff is: "+absdiff);
		}
		
	}
}