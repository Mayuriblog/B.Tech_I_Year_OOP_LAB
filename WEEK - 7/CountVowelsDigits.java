import java.util.*;
class CountVowelsDigits
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str=sc.nextLine().trim().toLowerCase();
		int vowelsCount=0;
		int digitsCount=0;
		double vowelsPercentage,digitsPercentage;
		if(str.length()!=0)
		{
			
			for(int i=0;i<str.length();i++)
			{
				char c=str.charAt(i);
				if("aeiou".indexOf(c)>=0)
					vowelsCount++;
				if(Character.isDigit(c))
					digitsCount++;
			}
		}
		else
		{
			System.out.println("Empty string entered.");
			return;
		}
		vowelsPercentage=(vowelsCount*100.00/str.length());
		digitsPercentage=(digitsCount*100.00/str.length());
		System.out.printf("No. of vowels : %d (%.2f%%) ",vowelsCount,vowelsPercentage);
		System.out.printf("\nNo. of digits : %d (%.2f%%) ",digitsCount,digitsPercentage);
	}
}