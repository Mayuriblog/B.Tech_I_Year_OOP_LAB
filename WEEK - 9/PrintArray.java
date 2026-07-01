//method overloading
import java.util.Scanner;
class PrintArray
{
	public static void print(int[] arr)
	{
		if(arr.length==0)
			System.out.print("[]");
		else
			for(int i=0;i<arr.length;i++)
			{
				if(i==0)
					System.out.print("["+arr[i]);
				else
					System.out.print(","+arr[i]);
				if(i==(arr.length-1))
					System.out.print("]");
			}
	}
	public static void print(double[] arr)
	{
		if(arr.length==0)
			System.out.print("[]");
		else
			for(int i=0;i<arr.length;i++)
			{
				if(i==0)
					System.out.print("["+arr[i]);
				else
					System.out.print(","+arr[i]);
				if(i==(arr.length-1))
					System.out.print("]");
			}
	}
	public static void print(float[] arr)
	{
		if(arr.length==0)
			System.out.print("[]");
		else
			for(int i=0;i<arr.length;i++)
			{
				if(i==0)
					System.out.print("["+arr[i]);
				else
					System.out.print(","+arr[i]);
				if(i==(arr.length-1))
					System.out.print("]");
			}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int[] a={};
		double b[]={0.1,0.23,1.2,3.45,7.89};
		float[] c={1.2f,2.3f,3.4f};
		System.out.print("int array: ");
		print(a);
		System.out.print("\ndouble array: ");
		print(b);
		System.out.print("\nfloat array: ");
		print(c);
	}
}