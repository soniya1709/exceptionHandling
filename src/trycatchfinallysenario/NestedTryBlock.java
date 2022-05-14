package trycatchfinallysenario;

public class NestedTryBlock {
public static void main(String[] args) {
	try
	{
		int a=30;
		try
		{
			int res=a/0;
			System.out.println("result="+res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Not Divisible by zero");
		}
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("index is full");
	}
	catch(RuntimeException e)
	{
		try
		{
			int[] num= {1,2,3,4};
			num[12]=20;
			System.out.println(num);
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("Array index is Full");
		}
	}
	finally
	{
		System.out.println("inside finally block");
		try
		{
			int res=30/0;
			System.out.println(res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Not divisible by zero");
		}
	}
}
}
