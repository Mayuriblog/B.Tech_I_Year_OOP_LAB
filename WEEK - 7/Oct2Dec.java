import java.util.*;
class Oct2Dec
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an octal number: ");
		String str=sc.nextLine();
		boolean flag=true;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='0'&&ch<='7')
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
			//System.out.println(str+" is octal number");
			int decimal=0;
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				decimal=decimal*8+ch-'0';
			}
			System.out.println("The equivalent decimal number "+str+" is: "+decimal);
		}
		else
			System.out.println(str+" is not an octal number");
	}
}