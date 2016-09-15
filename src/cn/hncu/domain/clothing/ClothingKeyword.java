package cn.hncu.domain.clothing;

/**
 * 服装关键字表对应的JavaBean
 * @author 陈浩翔
 * 2016-9-9 
 */
public class ClothingKeyword {
	private String id;
	private String clothingId;//所属服装id
	private String keyword;//服装的关键字
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getClothingId() {
		return clothingId;
	}
	public void setClothingId(String clothingId) {
		this.clothingId = clothingId;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
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
		ClothingKeyword other = (ClothingKeyword) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
