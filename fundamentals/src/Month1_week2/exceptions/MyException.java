package Month1_week2.exceptions;

public class MyException extends Exception 
{
	public MyException() 
	{
		super("It is user defined exception");
	}
	public MyException(String message) 
	{
		super(message);
	}
}
