package com.tem.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UTCDateTime {

	public static Date getCurentTimeAndDate() throws ParseException {
		Date todaysDate = new Date();
		
		SimpleDateFormat  df = new SimpleDateFormat("yyyy-MM-dd");
		String datestr = df.format(todaysDate);
		Date date = df.parse(datestr);
		return date;
	}
	
}
