package test.create;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import cn.hncu.utils.C3p0Pool;
import cn.hncu.utils.CreateID;
import cn.hncu.utils.PasswordUtils;
import cn.hncu.utils.TimeSwitch;

public class UtilsTest {
	/**
	 * 把密码用Spring中的MD5加密功能生成密文
	 */
	@Test
	public void createKeywordTest(){
		String name ="张三";
		String pwd = "1234";
		String md5Str = PasswordUtils.md5(pwd, name);
		System.out.println(md5Str);//95c88ac716ec4951922d5b7c0653a4ae
		name="Jack";
		pwd ="1234";
		md5Str = PasswordUtils.md5(pwd, name);
		System.out.println(md5Str);//a0f28e36a769bc05476e815ead0306c5
		name="admin";
		pwd ="1234";
		md5Str = PasswordUtils.md5(pwd, name);
		System.out.println(md5Str);//9b2f9dd7c60267f3c0f69bc061f6cbaf
		name="李四";
		pwd ="1234";
		md5Str = PasswordUtils.md5(pwd, name);
		System.out.println(md5Str);//5ae31ee18ce95dbbadb80c7e4275b38c
		
		System.out.println("----------------------------------");
		
		name="chx";
		pwd ="1234";
		md5Str = PasswordUtils.md5(pwd, name);
		System.out.println(md5Str);//5ae31ee18ce95dbbadb80c7e4275b38c
		name="天空";
		pwd ="1234";
		md5Str = PasswordUtils.md5(pwd, name);
		System.out.println(md5Str);//5ae31ee18ce95dbbadb80c7e4275b38c
		name="白云";
		pwd ="1234";
		md5Str = PasswordUtils.md5(pwd, name);
		System.out.println(md5Str);//5ae31ee18ce95dbbadb80c7e4275b38c
		name="大树";
		pwd ="1234";
		md5Str = PasswordUtils.md5(pwd, name);
		System.out.println(md5Str);//5ae31ee18ce95dbbadb80c7e4275b38c
	}
	
	/**
	 * 测试生成UUID和订单编号
	 */
	@Test
	public void createUuidTest(){
		String uuid = CreateID.getUUID() ;
		System.out.println(uuid);
		User u = new User();
		u.setId(uuid);
		u.setName("Jack");
		u.setPwd("1234");
		System.out.println(u.hashCode());
		System.out.println(new Date().getTime());
		String id = CreateID.getID(u.hashCode());
		System.out.println(id);
	}
	
	/**
	 * 创建表格测试数据时测试生成时间
	 * @throws ParseException 
	 */
	@Test
	public void createTimeTest() throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for(int i=1;i<13;i++){
			Date d = sdf.parse("2016-9-"+i);
			System.out.println(d.getTime());
		}
		Date d = new Date();
		System.out.println(d.getTime());
	}
	
	
	/**
	 * 测试工具类中time的转换
	 * @throws ParseException
	 */
	@Test
	public void TimeTest() throws ParseException{
		String timeStr = "1997-12-3 12:23:34";
		long time = TimeSwitch.getLongTime(timeStr);
		timeStr = TimeSwitch.getStringTime(time);
		System.out.println(time);
		System.out.println(timeStr);
	}
	
	/**
	 * c3p0池的测试
	 * @throws ParseException
	 * @throws SQLException 
	 */
	@Test
	public void C3p0PoolTest() throws ParseException, SQLException{
		Connection con = C3p0Pool.getConnection();
		System.out.println("con:"+con);
		System.out.println("dataSource:"+C3p0Pool.getDataSource());
	}
	
	
}
