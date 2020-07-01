package ocp.exceptions;

public class TryWithResources
{

	public static void main(String[] args)
	{

		try (ClosableObject co = new ClosableObject())
		{
			System.out.println("ok");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}

	}

}
