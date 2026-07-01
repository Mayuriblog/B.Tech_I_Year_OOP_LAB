import java.util.Scanner;
class ArrayToString
{
	public static String print(int[] arr)
	{
		String str="";
		if(arr.length==0)
			return "[]";
		else
		{
			for(int i=0;i<arr.length;i++)
			{
				if(i==0)
					str=str+"["+arr[i];
				else
					str=str+","+arr[i];
				if(i==(arr.length-1))
					str=str+"]";
			}
			return str;
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int[] a={1,2,3,4,5};
		String str=print(a);
		System.out.print("int array as a string: "+str);
		
		
	}
}