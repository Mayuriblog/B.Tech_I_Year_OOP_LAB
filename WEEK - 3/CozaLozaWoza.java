/*The program shall print "Coza" in place of the numbers
 which are multiples of 3, "Loza" for multiples of 5, 
"Woza" for multiples of 7, "CozaLoza" for multiples of 3 and 5,
 and so on.
1 2 Coza 4 Loza Coza Woza 8 Coza Loza 11
Coza 13 Woza CozaLoza 16 17 Coza 19 Loza CozaWoza 22
23 Coza Loza 26 Coza Woza 29 CozaLoza 31 32 Coza
...... */
 
import java.util.Scanner;
class CozaLozaWoza 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		final int LOWERBOUND=1,UPPERBOUND=110;
		for(int i=LOWERBOUND;i<=UPPERBOUND;i++)
		{
			if(i%3==0&&i%5==0&&i%7==0)
				System.out.print("CozaLozaWoza ");
			else if(i%3==0&&i%5==0)
				System.out.print("CozaLoza ");
			else if(i%3==0&&i%7==0)
				System.out.print("CozaWoza ");
			else if(i%3==0)
				System.out.print("Coza ");
			else if(i%5==0)
				System.out.print("Loza ");
			else if(i%7==0)
				System.out.print("Woza ");
			else 
				System.out.print(i+" ");
			if(i%11==0)
				System.out.println();
				
		}
		
	}
}