package cn.hncu.domain.clothing;
/**
 * 服装大众化推荐一天的统计参数表的JavaBean
 * @author 陈浩翔
 * @version 1.0
 */
public class ClothingCount {
	private String id;
	private String clothingId;//所属服装的id
	private long time;//统计的最后时间，每天0点更新
	private int buyTimes;//这天的销售量
	private int seeTimes;//一天的浏览次数
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
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public int getBuyTimes() {
		return buyTimes;
	}
	public void setBuyTimes(int buyTimes) {
		this.buyTimes = buyTimes;
	}
	public int getSeeTimes() {
		return seeTimes;
	}
	public void setSeeTimes(int seeTimes) {
		this.seeTimes = seeTimes;
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
		ClothingCount other = (ClothingCount) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
