package cn.hncu.domain.clothing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * 服装分类表对应的JavaBean
 * @author 陈浩翔
 * 2016-9-9 
 */
public class Types {
	private String id;
	private String name;
	private String parentId;//父类的id
	private String grade;//分类的等级
	private String depict;//对于此分类的说明
	private List<Clothing> clothing = new ArrayList<Clothing>();//此类型的服装
	
	public List<Clothing> getClothing() {
		return clothing;
	}
	public void setClothing(List<Clothing> clothing) {
		this.clothing = clothing;
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
		Types other = (Types) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Types [id=" + id + ", name=" + name + ", parentId=" + parentId
				+ ", grade=" + grade + ", depict=" + depict
				+ ", clothing=" + clothing + "]";
	}
	
}
