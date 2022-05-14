package exceptionhandling;

public class ReturnStatementinfinally {
public static int m1()
{
	int value=1;

	try
	{
		System.out.println("inside try block"+value);
		return value;
	}
	catch(ArithmeticException e)
	{
		value=2;
		System.out.println("inside catch block"+value);
		return value;
	}
	finally
	{
		value=3;
		System.out.println("inside finally block"+value);
		return value;
	}
	
}

	public static void main(String[] args) {
		m1();
}
}
