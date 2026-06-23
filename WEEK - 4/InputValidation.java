import java.util.Scanner;
class InputValidation
{
public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		boolean isValid=false;
		do
		{
			System.out.println("Enter a number between 0-10 or 90-100: ");
			int n=sc.nextInt();
			if(n>=0&&n<=10||n>=90&&n<=100)
			{
				isValid=true;
				System.out.println("You have Entered..."+n);		
			}
			else
				System.out.println("Invalid input, try again...");
		}while(!isValid);
	
	}
}