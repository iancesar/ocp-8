package ocp.localization;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class FormattingNumbers
{

	public static void main(String[] args)
	{
		int price = 3000;
		formatNumber(price, Locale.US); //3,000
		formatNumber(price, Locale.FRANCE); //3 000
		formatNumber(price, new Locale("pt", "BR")); //3.000

		System.out.println();

		formatCurrency(price, Locale.US); //$3,000.00
		formatCurrency(price, Locale.FRANCE); //3 000,00 €
		formatCurrency(price, new Locale("pt", "BR")); //R$ 3.000,00

		System.out.println();

		formatPercentual(price, Locale.US); //300,000%
		formatPercentual(price, Locale.FRANCE); //300 000 %
		formatPercentual(price, new Locale("pt", "BR")); //300.000%

		NumberFormat format = NumberFormat.getInstance();
		try
		{
			System.out.println(format.parse("1234")); //1234
			System.out.println(format.parse("1234X5")); //1234 -X para frente é ignorado
//			System.out.println(format.parse("a1234")); //ParseException precisa começar com Numbero

			System.out.println(NumberFormat.getInstance(Locale.FRANCE).parse("555 666"));
			
			//			System.out.println(NumberFormat.getCurrencyInstance(Locale.FRANCE).parse("$3,000.00"));
		}
		catch(ParseException e)
		{
			e.printStackTrace();
		}
	}

	private static void formatNumber(Number number, Locale locale)
	{
		System.out.println(NumberFormat.getInstance(locale).format(number));
	}

	private static void formatCurrency(Number number, Locale locale)
	{
		System.out.println(NumberFormat.getCurrencyInstance(locale).format(number));
	}

	private static void formatPercentual(Number number, Locale locale)
	{
		System.out.println(NumberFormat.getPercentInstance(locale).format(number));
	}

}
