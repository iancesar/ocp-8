package ocp.asserts;

import java.util.Scanner;

public class Assert
{

	public static void main(String[] args)
	{
		try (Scanner scanner = new Scanner(System.in))
		{
			int number = scanner.nextInt();

			assert (number > 10) : "Erro";

		}
	}

}
