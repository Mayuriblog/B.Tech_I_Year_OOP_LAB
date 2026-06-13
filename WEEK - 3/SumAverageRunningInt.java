import java.util.Scanner;
class SumAverageRunningInt
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int lowerBound=sc.nextInt();
		int upperBound=sc.nextInt();
		int sum=0;
		float average=0.0f;
		for(int i=lowerBound;i<=upperBound;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum of "+lowerBound+" to "+upperBound+" is: "+sum);
		average=(float)sum/(lowerBound+upperBound-1);
		System.out.println("average is : "+average);
	}
}