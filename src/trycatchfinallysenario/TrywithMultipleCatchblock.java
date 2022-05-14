package trycatchfinallysenario;

public class TrywithMultipleCatchblock {
public static void main(String[] args) {
	try
	{
		int a=30;
		int res=a/0;//when exception occur then remaining part of try not executed; 
		System.out.println("result="+res);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Array index out of bound");
	}
	catch(ArithmeticException e)
	{
		System.out.println("Not divisible by zero");
	}
	catch(RuntimeException e)
	{
		System.out.println("RuntimeException");//parent have least priority don't write firstly;
	}
	finally
	{
		System.out.println("inside finally block");//any time finally block executed;
	}
}
}
