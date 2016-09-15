package cn.hncu.utils;

import org.apache.log4j.Logger;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;


/**
 * MD5加密的工具类
 * @author 陈浩翔
 * 2016-9-8
 */
public class PasswordUtils {
	private static Logger log = Logger.getLogger(PasswordUtils.class);
	/**
	 * 参数1为原密码，参数2为盐值
	 * 返回加密后的密码
	 */
	public static String md5(String password,String solt){
		Md5PasswordEncoder md5 = new Md5PasswordEncoder();
		String str =md5.encodePassword(password, solt);
		log.debug("加密以后值为:"+str);
		return str;
	}
}
