package cn.hncu.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间转换类
 * long型时间转换成String
 * String型时间转换为long
 * @author 陈浩翔
 * 2016-9-8 
 */
public class TimeSwitch {
	
	/**
	 * long型时间转换为String型
	 * @param time --long型的时间
	 * @return String型的时间 格式为:yyyy-MM-dd HH:mm:ss
	 */
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public static String getStringTime(long time){
		String timeStr=sdf.format(new Date(time));
		return timeStr;
	}
	
	/**
	 * String型时间转换为long型
	 * @param timeStr String型的时间 格式为:yyyy-MM-dd HH:mm:ss
	 * @return  long型的时间
	 * @throws ParseException 格式错误-抛出此异常
	 */
	public static long getLongTime(String timeStr) throws ParseException{
		Date d = sdf.parse(timeStr);
		long time = d.getTime();
		return time;
	}
}
