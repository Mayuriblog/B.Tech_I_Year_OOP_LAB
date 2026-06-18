import java.util.Scanner;
class IncomeTaxCalculator
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		final double TAX_RATE_ABOVE20k=0.1;
		final double TAX_RATE_ABOVE40k=0.2;
		final double TAX_RATE_ABOVE60k=0.3;
		System.out.println("Enter the taxable income is: ");
		int taxableIncome=sc.nextInt();
		double taxPayable;
		if(taxableIncome>=60000)
			taxPayable=20000*TAX_RATE_ABOVE20k+20000*TAX_RATE_ABOVE40k+(taxableIncome-60000)*TAX_RATE_ABOVE60k;
		else if(taxableIncome>=40000)
			taxPayable=20000*TAX_RATE_ABOVE20k+(taxableIncome-40000)*TAX_RATE_ABOVE40k;
		else if(taxableIncome>=20000)
			taxPayable=(taxableIncome-20000)*TAX_RATE_ABOVE20k;
		else
			taxPayable=0.0;
		System.out.printf("The Income tax payable is %.2f",taxPayable);
	}
}