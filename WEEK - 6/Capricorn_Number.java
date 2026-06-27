import java.util.Scanner;
class Capricorn_Number
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=sc.nextInt();
		int square=number*number;
		int i=10;
		int flag=0;
		int temp=square;
		while(temp > 0)
        {
            int right = square % i;
            int left = square / i;
            if(right != 0 && left + right == number)
            {
                flag = 1;
                break;
            }
            i *= 10;
            temp /= 10;
        }
		if(flag==1)
			System.out.println(number+" is a Capricorn/Kaprekar number");
		else
			System.out.println(number+" is not a Capricorn/Kaprekar number");
		
	}
}