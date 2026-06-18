import java.util.Scanner;
class SalesTaxCalculator
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the tax-inclusive price in dollars (or -1 to end): ");
		double price=sc.nextDouble();
		double salesTax=0.0,actualPrice=0.0;
		final int SENTINEL=-1;
		final double SALES_TAX_RATE=0.07;
		double totalPrice=0.0,totalActualPrice=0.0,totalSalesPrice=0.0;
		while(price!=SENTINEL)
		{
			totalPrice+=price;
			actualPrice=price/(1+SALES_TAX_RATE);
			salesTax=price-actualPrice;
			System.out.printf("Actual Price is: $%.2f Sales Tax is: $%.2f",actualPrice,salesTax);
			System.out.println("\nEnter the tax-inclusive price in dollars (or -1 to end): ");
			price=sc.nextDouble();
			totalActualPrice+=actualPrice;
			totalSalesPrice+=salesTax;
		}
		System.out.println("Total Price is: "+totalPrice);
		System.out.println("Total Actual Price is: "+totalActualPrice);
		System.out.println("Total Sales tax is: "+totalSalesPrice);
		
	}
}