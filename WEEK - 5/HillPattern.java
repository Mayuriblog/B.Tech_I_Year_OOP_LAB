import java.util.Scanner;
class HillPattern
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size: ");
		int n=sc.nextInt();
		System.out.println("...Pattern A : Piramid Pattern");
		/*
		                                        #
                                              # # #
                                            # # # # #
                                          # # # # # # #
                                        # # # # # # # # #
		*/
		for(int row=1;row<=n;row++)
		{
			
			for(int t=1;t<=20;t++)
				System.out.print("  ");			
			for(int s=1;s<=(n-row);s++)
				System.out.print("  ");
			for(int col=1;col<=(2*row-1);col++)
				System.out.print("# ");
			System.out.println();
	
		}
		
		System.out.println("\nPattern B : Reverse Piramid Pattern");
		/*
		                                # # # # # # # # #
                                          # # # # # # #
                                            # # # # #
                                              # # #
                                                #
		*/
		for(int row=n;row>=1;row--)
		{
			for(int t=1;t<=20;t++)
				System.out.print("  ");	
			for(int s=1;s<=(n-row);s++)
				System.out.print("  ");
			for(int col=1;col<=(2*row-1);col++)
				System.out.print("# ");
			System.out.println();
		}
		System.out.println("\nPattern  C : Diamond Pattern");
		/*
		                                          #
                                                # # #
                                              # # # # #
                                            # # # # # # #
                                          # # # # # # # # #
                                        # # # # # # # # # # #
                                          # # # # # # # # #
                                            # # # # # # #
                                              # # # # #
                                                # # #
                                                  #
		*/
		for(int row=1;row<=n;row++)
		{
			
			for(int t=1;t<=20;t++)
				System.out.print("  ");			
			for(int s=1;s<=(n-row);s++)
				System.out.print("  ");
			for(int col=1;col<=(2*row-1);col++)
				System.out.print("# ");
			System.out.println();
	
		}
		for(int row=n-1;row>=1;row--)
		{
			for(int t=1;t<=20;t++)
				System.out.print("  ");	
			for(int s=1;s<=(n-row);s++)
				System.out.print("  ");
			for(int col=1;col<=(2*row-1);col++)
				System.out.print("# ");
			System.out.println();
		}
		System.out.println("\nPattern  D : Box Diamond Pattern");
		/*
									    # # # # # # # # # # #
                                        # # # # #   # # # # #
                                        # # # #       # # # #
                                        # # #           # # #
                                        # #               # #
                                        #                   #
                                        # #               # #
                                        # # #           # # #
                                        # # # #       # # # #
                                        # # # # #   # # # # #
                                        # # # # # # # # # # #
		*/
		// Top Half
		for (int i = 1; i <= n; i++) 
		{
			for(int t=1;t<=20;t++)
				System.out.print("  ");
			// Left side hashes
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print("# ");
			}

			// Middle gap spaces
			for (int j = 1; j <= 2 * i - 3; j++) {
				System.out.print("  ");
			}

			// Right side hashes (Corrected boundary for i == 1)
			int rightLimit = (i == 1) ? n - 1 : n - i + 1;
			for (int j = 1; j <= rightLimit; j++) {
				System.out.print("# ");
			}

			System.out.println();
		}

		// Bottom Half
		for (int i = n - 1; i >= 1; i--) {
			
			for(int t=1;t<=20;t++)
				System.out.print("  ");
			// Left side hashes
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print("# ");
			}

			// Middle gap spaces
			for (int j = 1; j <= 2 * i - 3; j++) {
				System.out.print("  ");
			}

			// Right side hashes (Corrected boundary for i == 1)
			int rightLimit = (i == 1) ? n - 1 : n - i + 1;
			for (int j = 1; j <= rightLimit; j++) {
				System.out.print("# ");
			}

			System.out.println();
		}
		
	}
}

