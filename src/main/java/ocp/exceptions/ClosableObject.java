package ocp.exceptions;

public class ClosableObject implements AutoCloseable
{

	@Override
	public void close() throws CustomException
	{
		System.out.println("Fechou");
	}

}
