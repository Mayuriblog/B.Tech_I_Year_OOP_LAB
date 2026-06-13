//Hexa to Binary Decimal
import java.util.Scanner;
class HexToBinDec
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String hex=sc.nextLine();
		String binary="";
		// Binary conversion
		for(int i=0;i<hex.length();i++)
		{
			char ch=hex.charAt(i);
			switch(ch)
			{
				case '0':binary+="0000";break;
				case '1':binary+="0001";break;
				case '2':binary+="0010";break;
				case '3':binary+="0011";break;
				case '4':binary+="0100";break;
				case '5':binary+="0101";break;
				case '6':binary+="0110";break;
				case '7':binary+="0111";break;
				case '8':binary+="1000";break;
				case '9':binary+="1001";break;
				case 'A':binary+="1010";break;
				case 'B':binary+="1011";break;
				case 'C':binary+="1100";break;
				case 'D':binary+="1101";break;
				case 'E':binary+="1110";break;
				case 'F':binary+="1111";break;
				default:System.out.println("Invalid input");
			}
			
		}
		System.out.println("Binary number: "+binary);
		/*
		int i = 0;
		while(i < binary.length() && binary.charAt(i) == '0')
		{
			i++;
		}
		binary = binary.substring(i);
		*/
		// hex to decimal
		int dec=0,power=0;
		for(int i=hex.length()-1;i>=0;i--)
		{
			char ch=hex.charAt(i);
			int value;
			if(ch>='0' && ch<='9')
				value=ch-'0';
			else
				value=ch-'A'+10;
			dec=dec+value*(int)Math.pow(16,power);
			power++;
		}
		System.out.println("Decimal number: "+dec);
	}
}