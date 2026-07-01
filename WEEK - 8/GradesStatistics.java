import java.util.*;
class GradesStatistics
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no. of students :");
		int NUM_OF_Students=sc.nextInt();
		int[] items=new int[NUM_OF_Students];
		for(int i=0;i<NUM_OF_Students;i++)
		{
			int j=i+1;
			System.out.print("Enter the grade for student "+j+": ");
			items[i]=sc.nextInt();
		}
		int sum=0;
		double avg=0.0;
		for(int i=0;i<NUM_OF_Students;i++)
		{
			sum=sum+items[i];
		}
		avg=(double)sum/NUM_OF_Students;
		System.out.printf("The average is: %.2f",avg);
		int min=items[0];
		for(int i=1;i<NUM_OF_Students;i++)
		{
			if(min>items[i])
				min=items[i];
		}
		System.out.println("\nThe minimum is: "+min);
		int max=items[0];
		for(int i=1;i<NUM_OF_Students;i++)
		{
			if(max<items[i])
				max=items[i];
		}
		System.out.println("The maximum is: "+max);
	}
}