package cn.hncu.domain.clothing;

/**
 * 服装颜色表对应的JavaBean
 * @author 陈浩翔
 * 2016-9-9
 */
public class ClothingColor {
	private String id;
	private Clothing clothing;//通过颜色来选择服装，需要用到
	private String color;//颜色
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Clothing getClothing() {
		return clothing;
	}
	public void setClothing(Clothing clothing) {
		this.clothing = clothing;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
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
		ClothingColor other = (ClothingColor) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
