import java.util.Scanner;
class SumProductMinMax3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 integers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int max,min;
		System.out.println("The Sum is: "+(a+b+c));
		System.out.println("The Product is: "+(a*b*c));
		if(a<b&&a<c)
			min=a;
		else if(b<c)
			min=b;
		else
			min=c;
		System.out.println("The Min number is: "+min);
		if(a>b&&a>c)
			max=a;
		else if(b>c)
			max=b;
		else
			max=c;
		System.out.println("The max number is: "+max);
	}
}