package ocp.exceptions;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.time.format.DateTimeParseException;

public class Rethrowing
{

	public static void main(String[] args) throws SQLException, DateTimeParseException, FileNotFoundException
	{
		Rethrowing r = new Rethrowing();

		try
		{
			r.parseData();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			throw e;
		}
	}

	public void parseData() throws SQLException, DateTimeParseException
	{
		throw new SQLException("sql");
	}

}
