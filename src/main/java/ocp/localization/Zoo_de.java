package ocp.localization;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

public class Zoo_de extends ListResourceBundle
{

	@Override
	protected Object[][] getContents()
	{
		return new Object[][] {{"ola", "Hallo"}};
	}

	public static void main(String[] args)
	{
		Locale de = Locale.GERMAN;
		//Passa o nome do pacote onde a classe Java se encontra
		ResourceBundle rb = ResourceBundle.getBundle("ocp.localization.Zoo", de);
		System.out.println(rb.getString("ola")); // Hallo
	}

}
