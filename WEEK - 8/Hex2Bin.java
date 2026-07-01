import java.util.*;
class Hex2Bin
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		final String[] HEX_BITS={"0000","0001","0010","0011",
							"0100","0101","0110","0111",
							"1000","1001","1010","1011",
							"1100","1101","1110","1111"};
		System.out.print("Enter a Hexadecimal string: ");
		String str=sc.next().toUpperCase();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			int index;
			if(ch>='0'&&ch<='9'||ch>='A'&&ch<='F')
			{
				if(i==0)
					System.out.print("The equivalent binary for hexadecimal "+str+" is: ");
				if(ch>='0'&&ch<='9')
					index=ch-'0';
				else 
					index=ch-'A'+10;
				System.out.print(HEX_BITS[index]+" ");
			}
			else
			{
				System.out.print("The given string is not a Hexadecimal string");
			}
			
		}
		
	}
}