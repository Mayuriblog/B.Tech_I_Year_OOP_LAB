// ABC(2), DEF(3), GHI(4), JKL(5), MNO(6), PQRS(7), TUV(8), WXYZ(9)
import java.util.*;
class PhoneKeyPad
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str=sc.nextLine().toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			switch(c)
			{
				case 'a':case 'b':case 'c': System.out.print(2);break;
				case 'd':case 'e':case 'f': System.out.print(3);break;
				case 'g':case 'h':case 'i': System.out.print(4);break;
				case 'j':case 'k':case 'l': System.out.print(5);break;
				case 'm':case 'n':case 'o': System.out.print(6);break;
				case 'p':case 'q':case 'r':case 's': System.out.print(7);break;
				case 't':case 'u':case 'v': System.out.print(8);break;
				case 'w':case 'x':case 'y':case 'z': System.out.print(9);break;
				default : System.out.println("entered wrong character");

			}
		}
	}
}