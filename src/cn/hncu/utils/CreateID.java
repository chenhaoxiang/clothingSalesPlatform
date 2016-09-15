package cn.hncu.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * 生成ID的工具类
 * 包括生成订单编号
 * @author 陈浩翔
 * 2016-9-8
 */
public class CreateID {
	private static SimpleDateFormat sdf = new SimpleDateFormat("HHmmssSSS");
	/**
	 * 利用UUID类生成UUID
	 * @return UUID
	 */
	public static String getUUID(){
		String uuid = UUID.randomUUID().toString().replaceAll("-","");
		return uuid;
	}
	/**
	 * 生成订单编号 = 用户的hashcode+时间 ，这种方式可以不采用同步也能保证唯一
	 */
	public static String getID(Integer hashCode){
		if(hashCode<0){
			hashCode*=-1;
		}
		Date date = new Date();
		String str  = sdf.format(date);
		return hashCode+str;
	}
}
