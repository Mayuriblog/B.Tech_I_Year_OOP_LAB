import java.util.*;
class TestPalindromicPhrase
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str=sc.nextLine().toLowerCase();
		String rev="";
		String clean="";
		for(int c=0;c<str.length();c++)
		{
			if(Character.isLetter(str.charAt(c)))
			clean=clean+str.charAt(c);
		}
		System.out.println(clean);
		for(int c=str.length()-1;c>=0;c--)
		{
			if(Character.isLetter(str.charAt(c)))
			rev=rev+str.charAt(c);
		}
		System.out.println(rev);
		if(clean.equals(rev))
			System.out.println(str+ " is a palindrome phrase");
		else
			System.out.println(str+ " is not a palindrome phrase");
	}
}