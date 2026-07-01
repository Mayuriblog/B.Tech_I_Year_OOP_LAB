import java.util.*;
class PrintArrayInStars
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of items :");
		int NUM_ITEMS=sc.nextInt();
		int[] items=new int[NUM_ITEMS];
		System.out.println("Enter the value of all items (separated by space): ");
		for(int i=0;i<NUM_ITEMS;i++)
			items[i]=sc.nextInt();
		
		for(int i=0;i<NUM_ITEMS;i++)
		{
			System.out.print(i+" : ");
			for(int starNo=1;starNo<=items[i];starNo++)
				System.out.print("*");
			System.out.print("("+items[i]+")");
			System.out.println();
		}
		
	}
}