import java.util.*;
class CheckBinStr
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		boolean flag=true;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if("01".indexOf(ch)==-1)
			{
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println(str+" is a binary string");
		else
			System.out.println(str+" is not a binary string");
	}
}