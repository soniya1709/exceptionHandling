package exceptionhandling;

public class FinallyBlock {
public static void main(String[] args) {
	try
	{
		//System.exit(0);
		int[] num= {1,2,3,4,5,6,7};
		num[7]=30/0;
		//System.exit(0);
	
	}catch(ArithmeticException e)
	{
		System.out.println("not divisible by zero");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Array index out of bound");
	}
	finally
	{
		System.out.println("inside finally block");
	}
}
}
