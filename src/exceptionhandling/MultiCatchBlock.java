package exceptionhandling;

public class MultiCatchBlock {
public static void main(String[] args)  {
	try
	{
		int res=30/0;
		System.out.println(res);
	}
	
				
				catch(ArithmeticException | ArrayIndexOutOfBoundsException  e)//only disjoint are allowed
	{
		System.out.println("e.getMessage");
	}
}
}
