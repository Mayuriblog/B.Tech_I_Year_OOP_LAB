//  Binary numbers into Hexadecimal and decimal numbers
import java.util.Scanner;
class BinaryToHexDec
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String bin=sc.nextLine();
		int dec=0;
		for(int i=0;i<bin.length();i++)
		{
			dec=dec*2+(bin.charAt(i)-'0');
		}
		System.out.println("Decimal Number: "+dec);
		String hex="";
		while(dec>0)
		{
			int rem=dec%16;
			switch(rem)
			{
				case 10:hex="A"+hex;break;
				case 11:hex="B"+hex;break;
				case 12:hex="C"+hex;break;
				case 13:hex="D"+hex;break;
				case 14:hex="E"+hex;break;
				case 15:hex="F"+hex;break;
				default:hex=rem+hex;
				
			}
			dec/=16;
		}
		System.out.println("Hexa decimal Number: "+hex);
		
		
	}
}