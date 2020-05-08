package ocp.localization;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormatting
{

	public static void main(String[] args)
	{
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.of(date, time);

		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

		System.out.println();
		
		System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).format(dateTime));
		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(date));
		System.out.println(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).format(time));
		
		System.out.println(DateTimeFormatter.ofPattern("hh").format(dateTime));
		
		System.out.println(ZonedDateTime.now().format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
		
		LocalDate niver = LocalDate.of(1993, 7, 22);
		Period p = Period.ofYears(3);
		
		niver = niver.minus(p);
		
		System.out.println();
		System.out.println(niver);
		
		niver = LocalDate.of(1993, 7, 22);
		p = Period.of(1992, 12, 6);
		
		niver = niver.minus(p);
		
		System.out.println();
		System.out.println(niver);
		
		

	}

}
