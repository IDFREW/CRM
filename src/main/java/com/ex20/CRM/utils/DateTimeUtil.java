package com.ex20.CRM.utils;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author RLN57
 */
public class DateTimeUtil {

	public static String getSysTime(){

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		Date date = new Date();
		String dateStr = sdf.format(date);

		return dateStr;

	}

}
