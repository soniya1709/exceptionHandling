package exceptionhandling;

public class TryMustHaveOnecatchOrFinally {
public static void main(String[] args) {
	try
	{
		int res=30/0;
		System.out.println(res);
	}
	finally
	{
		System.out.println("inside finally block");
	}
}
}
