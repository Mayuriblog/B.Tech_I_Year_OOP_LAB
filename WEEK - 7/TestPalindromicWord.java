import java.util.*;
class TestPalindromicWord
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
		if(str.equals(rev))
			System.out.print(str+ " is a palindrome word");
		else
			System.out.print(str+ " is not a palindrome word");
	}
}