package com.inmemory.gleifparser.utils;

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

}
