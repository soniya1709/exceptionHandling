package exceptionhandling;

public class TryCatchFinally {
public static void main(String[] args) {
	try
	{
		int[] num= {1,2,3,4,5};
		num[6]=30/0;            //when two exception occurs assignment chya pudhach aadhi execute hota;
		System.out.println("result"+num);
	}
	catch(ArithmeticException e)//child have first priority;
	{
		System.out.println("not divisible by zero");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Index overflow");
	}
	catch(Exception e)
	{
		System.out.println("exeception");//parent have lest priority;
	}
	finally
	{
		System.out.println("inside finally block");
	}
}
}
