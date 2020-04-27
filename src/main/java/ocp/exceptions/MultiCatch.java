package ocp.exceptions;

public class MultiCatch
{
	
	public static void main(String[] args)
	{
		try
		{
			int a = 10/0;
		}
		catch(NullPointerException | ArithmeticException e)
		{
			assert e instanceof NullPointerException : "Não é Nullpointer";
		}
	}

}
