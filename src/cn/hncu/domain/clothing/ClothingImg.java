package cn.hncu.domain.clothing;

/**
 * 服装图片表对应的JavaBean
 * @author 陈浩翔
 * 2016-9-9
 */
public class ClothingImg {
	private String id;
	private String clothingId;//所属服装的id
	private String url;//项目下图片的保存地址全名
	private String time;//图片保存时间
	//根据此时间来删除超过10个图片的最早保存图片
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
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
		ClothingImg other = (ClothingImg) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
