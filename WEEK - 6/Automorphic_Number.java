import java.util.Scanner;
class Automorphic_Number
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=sc.nextInt();
		String temp=String.valueOf(number);
		int res=number*number;
		res=res%(int)(Math.pow(10,temp.length()));
		System.out.println(res);
		if(number==res)
			System.out.println(number+" is a Automorphic Number");
		else
			System.out.println(number+" is not a Automorphic Number");
	}
}
		