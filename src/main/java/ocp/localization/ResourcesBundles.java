package ocp.localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourcesBundles
{

	public static void main(String[] args)
	{
		Locale pt = new Locale("pt");
		Locale es = new Locale("es");

		printProperties(pt);
		printProperties(es);
		
		System.out.println("Keys!\n");
		ResourceBundle rb = ResourceBundle.getBundle("Zoo", pt);
		rb.keySet().stream().forEach(System.out::println);
		
	}

	private static void printProperties(Locale locale)
	{
		ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);

		System.out.println(rb.getString("ola"));
	}

}
