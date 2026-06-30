import java.util.*;
class Hex2Dec
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Hexa decimal string: ");
		String str=sc.nextLine().toUpperCase();
		boolean flag=true;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if((ch>='0'&&ch<='9')||(ch>='A'&&ch<='F'))
			{
			}
			else
			{
				flag=false;
				break;
			}
				
		}
		if(flag)
		{
			//System.out.println(str+" is a Hexa string");
			int decimal=0;
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				int value;
				if(ch>='0'&&ch<='9')
					value=ch-'0';
				else
					value=ch-'A'+10;
				decimal=decimal*16+value;
				//System.out.println(decimal);
			}
			System.out.println("The equivalent decimal number for hex string  " + str + " is: " + decimal);
		}
		else
			System.out.println(str+" is not a Hexa string");
	}
}