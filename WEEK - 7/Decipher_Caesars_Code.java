import java.util.*;
class Decipher_Caesars_Code 
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
			char cipher= (char)((c-'A'-3)%26+'A');
			cipher_text+=cipher;
		}
		System.out.println("The ciphertext string is : "+cipher_text);
	}
}