package cn.hncu.domain.users;

/**
 * 用户地址表对应的JavaBean
 * @author 陈浩翔
 * 2016-9-9
 */
public class Address {
	private String id;
	private Users users;//所属用户
	private String name;//收货人姓名
	private String phone;//收货人电话
	private String zipCode;//邮编
	private String whetherDefault="1";//是否是默认地址
	//1表示是。且只能有一个默认地址
	private String address;//具体的地址
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public String getWhetherDefault() {
		return whetherDefault;
	}
	public void setWhetherDefault(String whetherDefault) {
		this.whetherDefault = whetherDefault;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
		Address other = (Address) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
