package ocp.localization;

import java.util.Locale;

public class LocaleConstruction
{

	public static void main(String[] args)
	{
		Locale de = Locale.GERMANY;
		Locale pt = new Locale("pt", "BR");
		Locale es = new Locale.Builder().setLanguage("es").setRegion("ES").build();
		
		System.out.println(de);
		System.out.println(pt);
		System.out.println(es);
	}

}
