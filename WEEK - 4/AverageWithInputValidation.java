import java.util.Scanner;
class AverageWithInputValidation 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of students: ");
		int no_of_students=sc.nextInt();
		boolean isValid=false;
		int sum=0;
		for(int i=1;i<=no_of_students;i++)
		{
			do
			{
				System.out.println("Enter marks between 0-100 for student "+i+": ");
				int n=sc.nextInt();
				if(n>=0&&n<=100)
				{
					isValid=true;
					System.out.println("You have Entered..."+n);
					sum+=n;					
				}
				else
				{
					System.out.println("Invalid input, try again...");
					i--;
				}
				
			}while(!isValid);

		}
		System.out.println("Sum is: "+sum);
	}
}