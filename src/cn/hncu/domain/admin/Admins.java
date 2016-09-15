package cn.hncu.domain.admin;

import java.util.ArrayList;
import java.util.List;

/**
 * 管理人员表对应的JavaBean
 * @author 陈浩翔
 * 2016-9-9
 */
public class Admins {
	private String id;
	private String name;
	private String password;//密码，保存的是加密后的密码
	private String sex ;//性别
	private String email;//邮箱
	private String active ="0";//是否激活邮箱，0表示未激活
	private String depict;//管理人员的其他说明
	private List<Roles> roles = new ArrayList<Roles>();//担任角色
	
	
	public List<Roles> getRoles() {
		return roles;
	}
	public void setRoles(List<Roles> roles) {
		this.roles = roles;
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
	public String getDepict() {
		return depict;
	}
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public void setDepict(String depict) {
		this.depict = depict;
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
		Admins other = (Admins) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
