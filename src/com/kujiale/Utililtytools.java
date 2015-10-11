package com.kujiale;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author zjq
 * @aim  工具类
 */
public class Utililtytools {


	public static Date String2Date(String input) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("hhmmss");
		Date strToDate = sdf.parse(input);
		return strToDate;
	}
	public static String Date2HHMMSS(Date input) throws ParseException {
		 Date now = input;
	     SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss"); 
	     String str = sdf.format(now);
	     return str;
	}

}
