import java.util.*;
class Dec2Hex
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		final char[] HEX_NUM={'0','1','2','3','4','5','6',
								'7','8','9','A','B','C','D','E','F'};
		System.out.print("Enter the decimal number: ");
		int number=sc.nextInt();
		if(number == 0)
		{
			System.out.println("The equivalent hexadecimal number is : 0");
			return;
		}
		String hex_rev="";
		System.out.print("The equivalent hexadecimal number is : ");
		while(number>0)
		{
			int index=number%16;
			number=number/16;
			hex_rev+=HEX_NUM[index];
		}
		for(int i=hex_rev.length()-1;i>=0;i--)
			System.out.print(hex_rev.charAt(i));
	}
}