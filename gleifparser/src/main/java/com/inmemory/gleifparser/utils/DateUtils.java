package com.inmemory.gleifparser.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

public class DateUtils {
	
	public static Date convertXmlGregorianCalToDate(XMLGregorianCalendar calendar)
	
	{
		Date date = null;
		if (calendar != null && calendar.toGregorianCalendar() != null ) {
			date = calendar.toGregorianCalendar().getTime();
					
		}
		return date;
	}
	
	public static String convertDateToString(Date date) {
		String retString="";
		if(date!=null) {
			DateFormat formatter = new SimpleDateFormat("MMM d, yyyy HH:mm a");
			retString=formatter.format(date);
		}
		return retString;
	}

}
