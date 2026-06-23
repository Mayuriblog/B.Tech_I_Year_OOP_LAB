import java.util.Scanner;
class BoxPattern
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size: ");
		int n=sc.nextInt();
		System.out.println("Pattern A : Box Pattern");
		/*
		# # # # # # # #
		#             #
		#             #
		#             #
		#             #
		#             #
		#             #
		# # # # # # # #
		*/
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=n;col++)
				if(row==1||col==1||row==n||col==n)
					System.out.print("# ");
				else
					System.out.print("  ");
			System.out.println();
		}
		System.out.println("Pattern B : Diagonal Pattern");
		/*
		# # # # # # # #
		  #
			#
			  #
				#
				  #
					#
		# # # # # # # #
		*/
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=n;col++)
				if(row==1||row==col||row==n)
					System.out.print("# ");
				else
					System.out.print("  ");
			System.out.println();
		}
		System.out.println("Pattern C : Opposite Diagonal Pattern");
		/*
		# # # # # # # #
					#
				  #
				#
			  #
			#
		  #
		# # # # # # # #
		*/
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=n;col++)
				if(row==1||row+col==(n+1)||row==n)
					System.out.print("# ");
				else
					System.out.print("  ");
			System.out.println();
		}
		System.out.println("Pattern D : Two Diagonal Pattern");
		/*
		# # # # # # # #
		  #         #
			#     #
			  # #
			  # #
			#     #
		  #         #
		# # # # # # # #
		*/
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=n;col++)
				if(row==1||row+col==(n+1)||row==n||row==col)
					System.out.print("# ");
				else
					System.out.print("  ");
			System.out.println();
		}
		System.out.println("Pattern E : Two Diagonal with in Box Pattern");
		/*
		# # # # # # # #
		# #         # #
		#   #     #   #
		#     # #     #
		#     # #     #
		#   #     #   #
		# #         # #
		# # # # # # # #
		*/
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=n;col++)
				if(row==1||row+col==(n+1)||row==n||row==col||col==1||col==n)
					System.out.print("# ");
				else
					System.out.print("  ");
			System.out.println();
		}
	}
}