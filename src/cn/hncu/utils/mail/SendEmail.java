package cn.hncu.utils.mail;

/**
 *	对象需要发送邮件必须实现的接口
 * 2016-9-14
 */
public interface SendEmail {
	public String getId();
	public String getName();
	public String getEmail();
	public String getUserType();
}
