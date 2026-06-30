import java.util.*;
class Bin2Dec
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a binary string: ");
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
		/*
		if(flag)
        {
            int decimal = 0;
            for(int i = 0; i < str.length(); i++)
            {
                decimal = decimal * 2 + (str.charAt(i) - '0');
            }
            System.out.println("The equivalent decimal number for binary " + str + " is: " + decimal);
        }*/
		if(flag)
		{
			//System.out.println(str+" is a binary string");
			int n=Integer.valueOf(str);
			int sum=0,p=0;
			while(n>0)
			{
				int rem=n%10;
				sum+=rem*Math.pow(2,p);
				n=n/10;
				p++;
			}
			System.out.println("The equivalent decimal number for binary "+str+" is: "+sum);
		}
		else
			System.out.println(str+" is not a binary string");
	}
}