package exceptionhandling;

public class ThrowAndThrows {
public static void main(String[] args) {
	m1();
}
public static void  m1()
{
	try
	{
		
	
	int result=30/0;
	System.out.println("inside main method"+result);
	throw new ArithmeticException();
}
	finally
	{
		System.out.println("inside finally block");
	}
}
}