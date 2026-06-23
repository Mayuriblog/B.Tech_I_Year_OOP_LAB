import java.util.Scanner;
class NumberPattern 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size: ");
		int n=sc.nextInt();
		System.out.println("Pattern A : Increasing Pattern");
		/*
		1
		1 2
		1 2 3
		1 2 3 4
		1 2 3 4 5
		*/
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print(j+" ");
			System.out.println();
		}
		System.out.println("Pattern B : Right shifted Decreasing Pattern");
		/*
		1 2 3 4 5
		  1 2 3 4
		    1 2 3
		      1 2
                1
		*/
		
		for(int i=1;i<=n;i++)
		{	
			for(int s = 1; s <= i - 1; s++)
				System.out.print("  ");  
			for(int j=1;j<=(n-i+1);j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("Pattern C : Right Aligned reverse increasing Pattern");
		/*
		      1
			2 1
		  3 2 1
		4 3 2 1
		*/
		for(int i=1;i<=n;i++)
		{	int temp=i;
			for(int s=1;s<=(n-i);s++)
				System.out.print("  ");
			for(int j=1;j<=i;j++)
			{
					System.out.print(temp+" ");
					temp--;
			}
			System.out.println();
			
		}
		System.out.println("Pattern D : Decreasing Pattern");
		/*
		4 3 2 1
		  3 2 1
			2 1
			  1
		*/
		for(int i=1;i<=n;i++)
		{
			for(int s=1;s<=(i-1);s++)
				System.out.print("  ");
			for(int j=i;j<=n;j++)
				System.out.print((n-j+1)+" ");
			System.out.println();
		}
	}

}