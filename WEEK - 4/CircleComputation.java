import java.util.Scanner;
class CircleComputation
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double radius=sc.nextDouble();
		double diameter=2.0*radius;
		double area=Math.PI*radius*radius;
		double circumference=2.0*Math.PI*radius;
		System.out.printf("diameter: %.2f area : %.2f circumference :%.2f",diameter,area,circumference);
	}
}