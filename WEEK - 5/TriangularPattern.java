import java.util.Scanner;
class TriangularPattern
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size: ");
		int n=sc.nextInt();
		System.out.println("Pattern A : Increasing Pattern");
		/*
		#
		# #
		# # #
		# # # #
		# # # # #
		*/
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.printf("# ");
			System.out.println();
		}
		System.out.println("Pattern B : Decreasing Pattern");
		/*
		# # # # #
		# # # #
		# # #
		# #
		#
		*/
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n-i+1);j++)
				System.out.printf("# ");
			System.out.println();
		}
		System.out.println("Pattern C : Right shifted Decreasing Pattern");
		/*
		# # # # #
		  # # # #
		    # # #
			  # #
                #
		*/
		for(int i=1;i<=n;i++)
		{	
			for(int s = 1; s <= i - 1; s++)
				System.out.print("  ");  
			for(int j=1;j<=(n-i+1);j++)
			{
				System.out.print("# ");
			}
			System.out.println();
		}
		System.out.println("Pattern D : Right Aligned increasing Pattern");
		/*
				#
			  # #
		    # # #
		  # # # #
        # # # # #
		*/
		for(int i=1;i<=n;i++)
		{	
			for(int s=1;s<=(n-i);s++)
				System.out.print("  ");
			for(int j=1;j<=i;j++)
					System.out.print("# ");
			System.out.println();
		}
		
		
	}

}