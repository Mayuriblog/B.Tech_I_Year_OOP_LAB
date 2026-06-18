/*
Employee´s Age Employee Rate (%) Employer Rate (%)
55 and below 20 17
above 55 to 60 13 13
above 60 to 65 7.5 9
above 65 5 7.5
*/
import java.util.Scanner;
class PensionContributionCalculator
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Salary and age of an employee: ");
		int salary=sc.nextInt();
		int age=sc.nextInt();
		double employeeContribution,employerContribution,totalContribution;
		if(age<=55)
		{
			employeeContribution=salary*0.2;
			employerContribution=salary*0.17;
		}
		else if(age>55&&age<=60)
		{
			employeeContribution=salary*0.13;
			employerContribution=salary*0.13;
		}
		else if(age>60&&age<=65)
		{
			employeeContribution=salary*0.075;
			employerContribution=salary*0.09;
		}
		else 
		{
			employeeContribution=salary*0.2;
			employerContribution=salary*0.075;
		}
		totalContribution=employeeContribution+employerContribution;
		System.out.printf("The employee’s contribution is: %.2f",employeeContribution);
		System.out.printf("\nThe employer’s contribution is: %.2f",employerContribution);
		System.out.printf("\nThe total contribution is: %.2f",totalContribution);
	    
	}
}