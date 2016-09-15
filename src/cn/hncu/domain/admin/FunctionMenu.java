package cn.hncu.domain.admin;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能菜单表对应的JavaBean
 * @author 陈浩翔
 * @version 1.0
 */
public class FunctionMenu {
	private String id;
	private String name;
	private String url;//该功能对应的项目下的网页链接-控制着访问权限
	private String parentId;//父节点的功能菜单id
	private String grade ;//菜单的等级
	private List<Roles> roles = new ArrayList<Roles>();//具有该功能的管理员角色
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public List<Roles> getRoles() {
		return roles;
	}
	public void setRoles(List<Roles> roles) {
		this.roles = roles;
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
		FunctionMenu other = (FunctionMenu) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
