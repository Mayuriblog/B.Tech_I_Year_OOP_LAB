import java.util.*;
class ExchangeCipher 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str=sc.nextLine().toUpperCase();
		String cipher_text="";
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			char cipher= (char)('Z'-(c-'A'));
			cipher_text+=cipher;
		}
		System.out.println("The ciphertext string is : "+cipher_text);
	}
}