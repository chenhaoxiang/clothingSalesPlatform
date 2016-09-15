package cn.hncu.domain.admin;

import java.util.ArrayList;
import java.util.List;

/**
 * 管理员角色表对应的JavaBean
 * @author 陈浩翔
 * 2016-9-9
 */
public class Roles {
	private String id;
	private String name;
	private String depict;//该管理员角色的说明
	private List<Admins> admins = new ArrayList<Admins>();//担任该角色的管理员
	private List<FunctionMenu> functionMenu = new ArrayList<FunctionMenu>();//该管理员角色具有的管理功能菜单
	
	
	public List<FunctionMenu> getFunctionMenu() {
		return functionMenu;
	}
	public void setFunctionMenu(List<FunctionMenu> functionMenu) {
		this.functionMenu = functionMenu;
	}
	public List<Admins> getAdmins() {
		return admins;
	}
	public void setAdmins(List<Admins> admins) {
		this.admins = admins;
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
	public String getDepict() {
		return depict;
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
		Roles other = (Roles) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
