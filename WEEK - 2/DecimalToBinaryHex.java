import java.util.Scanner;
class DecimalToBinaryHex
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int decimal=sc.nextInt();
		
		// Binary conversion
		int temp=decimal;
		String binary="";
		while(temp>0)
		{
			binary=(temp%2)+binary;
			temp/=2;
		}
		System.out.println("Binary number : "+binary);
		
		// HexaDecimal conversion
		
		temp=decimal;
		String hex="";
		String arr[]={"0","1","2","3","4","5",
		           "6","7","8","9","A","B",
				   "C","D","E","F"};
		while(temp>0)
		{
			hex=arr[(temp%16)]+hex;
			temp/=16;
		}
		System.out.println("HexaDecimal number : "+hex);
	}
}

//  --- Built-in functions
/*
import java.util.*;

class DecimalConversion
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();

        System.out.println("Binary      : " + Integer.toBinaryString(n));
        System.out.println("Hexadecimal : " + Integer.toHexString(n).toUpperCase());
    }
}
*/