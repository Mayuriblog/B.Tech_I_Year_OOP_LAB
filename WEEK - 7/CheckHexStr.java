import java.util.*;
class CheckHexStr
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
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
			System.out.println(str+" is a Hexa string");
		else
			System.out.println(str+" is not a Hexa string");
	}
}