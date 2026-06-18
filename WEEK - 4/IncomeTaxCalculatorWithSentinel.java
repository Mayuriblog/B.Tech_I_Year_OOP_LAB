import java.util.Scanner;
class IncomeTaxCalculatorWithSentinel 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		final int SENTINEL=-1;
		final double Tax_Payable_above20k=0.1;
		final double Tax_Payable_above40k=0.2;
		final double Tax_Payable_above60k=0.3;
		System.out.println("Enter taxable income (-1 for end): ");
		int taxableIncome=sc.nextInt();
		double taxPayable;
		while(taxableIncome!=SENTINEL)
		{
			taxPayable=0.0;
			if(taxableIncome<=20000)
				taxPayable=0.0;
			else if(taxableIncome<=40000)
				taxPayable=(taxableIncome-20000)*Tax_Payable_above20k;
			else if(taxableIncome<=60000)
				taxPayable=20000*Tax_Payable_above20k+(taxableIncome-40000)*Tax_Payable_above40k;
			else 
				taxPayable=20000*Tax_Payable_above20k+20000*Tax_Payable_above40k+(taxableIncome-60000)*Tax_Payable_above60k;
			System.out.printf("Tax Payble : %.2f ",taxPayable);
			System.out.println("\nEnter taxable income (-1 for end): ");
			taxableIncome=sc.nextInt();
		}
	}
}