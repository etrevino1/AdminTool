package mx.izzi.admintool.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateConverter {
	public static Calendar getCalendar(String date) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		Calendar cal = new GregorianCalendar();
		cal.setTime(sdf.parse(date));
		return cal;
	}
}
