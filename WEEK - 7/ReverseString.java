import java.util.*;
class ReverseString
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str=sc.nextLine();
		String rev="";
		for(int c=str.length()-1;c>=0;c--)
		{
			rev=rev+str.charAt(c);
		}
		System.out.print("The reverse of the String "+str+" is "+rev);
	}
}