package cn.hncu.domain.clothing;

/**
 * 服装尺码表对应的JavaBean
 * @author 陈浩翔
 * 2016-9-9
 */
public class ClothingSize {
	private String id;
	private String clothingId;//所属服装的id
	private String size;//服装的尺码
	private int stock;//当前尺码的库存量
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
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
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
		ClothingSize other = (ClothingSize) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
