package cn.hncu.domain.users;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户表对应的JavaBean
 * @author 陈浩翔
 * 2016-9-9
 */
public class Users {
	private String id;
	private String name;
	private String password;//用户密码，只保存加密后的密码
	private String email;//用户邮箱
	private String active = "0";//是否已经激活邮箱,0表示未激活
	private long applyTime;//注册时间-如果一周后active还是为0，则删除该用户
	private List<UsersComment> usersComment = new ArrayList<UsersComment>();//用户对服装做出的评论
	private List<UsersIp> usersIp = new ArrayList<UsersIp>();
	private List<UsersTypes> usersTypes = new ArrayList<UsersTypes>();//用户用户的个性化推荐
	private List<Address> address = new ArrayList<Address>();//用户 所有收货地址
	private List<Orders> orders = new ArrayList<Orders>();
	
	public List<Orders> getOrders() {
		return orders;
	}
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public List<UsersTypes> getUsersTypes() {
		return usersTypes;
	}
	public void setUsersTypes(List<UsersTypes> usersTypes) {
		this.usersTypes = usersTypes;
	}
	public List<UsersIp> getUsersIp() {
		return usersIp;
	}
	public void setUsersIp(List<UsersIp> usersIp) {
		this.usersIp = usersIp;
	}
	public List<UsersComment> getUsersComment() {
		return usersComment;
	}
	public void setUsersComment(List<UsersComment> usersComment) {
		this.usersComment = usersComment;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public long getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(long applyTime) {
		this.applyTime = applyTime;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
