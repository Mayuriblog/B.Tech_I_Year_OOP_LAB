// Fractional decimal number into binary
import java.util.Scanner;
class FractionalDecToBin
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double num=sc.nextDouble();
		int integerPart=(int)num;
		double fractionalPart=num-integerPart;
		// Integer part to binary
        String binaryInt = "";

        while(integerPart > 0)
        {
            binaryInt = (integerPart % 2) + binaryInt;
            integerPart /= 2;
        }

        // Fractional part to binary
        String binaryFrac = "";

        for(int i = 1; i <= 8; i++)   // 8 fractional bits
        {
            fractionalPart *= 2;

            if(fractionalPart >= 1)
            {
                binaryFrac += "1";
                fractionalPart -= 1;
            }
            else
            {
                binaryFrac += "0";
            }
        }

        System.out.println("Binary = " + binaryInt + "." + binaryFrac);
		
	}
}
