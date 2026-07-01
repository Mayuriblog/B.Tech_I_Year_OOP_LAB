import java.util.*;
class PrintArray
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
		System.out.print("[");
		for(int i=0;i<NUM_ITEMS;i++)
			System.out.print((i==0)?items[i]:","+items[i]);
		System.out.print("]");
	}
}