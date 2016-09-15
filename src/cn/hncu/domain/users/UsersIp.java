package cn.hncu.domain.users;

/**
 * 用户ip表对应的JavaBean
 * @author 陈浩翔
 * 2016-9-9
 */
public class UsersIp {
	private String id;
	private Users users;//所属用户
	private String ip;//登录地方的ip
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
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
		UsersIp other = (UsersIp) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
