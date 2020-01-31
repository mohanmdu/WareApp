package com.tem.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UTCDateTime {

	public static Date getCurentTimeAndDate() throws ParseException {
		Date todaysDate = new Date();
		
		SimpleDateFormat  df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String datestr = df.format(todaysDate);
		Date date = df.parse(datestr);
		return date;
	}
	
}
