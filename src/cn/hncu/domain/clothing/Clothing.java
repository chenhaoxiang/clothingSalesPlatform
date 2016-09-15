package cn.hncu.domain.clothing;

import java.util.ArrayList;
import java.util.List;

import cn.hncu.domain.users.UsersComment;

/**
 * 服装表对应的JavaBean
 * @author 陈浩翔
 * 2016-9-9
 */
public class Clothing {
	private String id;
	private String name;
	private double price;//价格
	private double discount;//折扣
	private String brand;//品牌
	private long comtTime;//上市时间
	private int buyTimesSum;//总销售量
	private long lastBuyTime;//最后销售成交的时间
	private String introduce;//商品介绍
	private String recommend = "0";//是否被管理员推荐，0表示未被推荐
	private List<ClothingKeyword> clothingKeyword = new ArrayList<ClothingKeyword>();//服装的关键字
	private List<ClothingCount> clothingCount = new ArrayList<ClothingCount>();//服装的每天统计参数
	private List<ClothingColor> clothingColor = new ArrayList<ClothingColor>();//服装的所有颜色
	private List<ClothingImg> clothingImg = new ArrayList<ClothingImg>();//服装的图片
	private List<ClothingSize> clothingSize = new ArrayList<ClothingSize>();//服装的所有尺码
	private List<Types> types = new ArrayList<Types>();//服装所属的分类
	private List<UsersComment> usersComment = new ArrayList<UsersComment>();//用户对服装的评论
	
	
	public List<UsersComment> getUsersComment() {
		return usersComment;
	}
	public void setUsersComment(List<UsersComment> usersComment) {
		this.usersComment = usersComment;
	}
	public List<Types> getTypes() {
		return types;
	}
	public void setTypes(List<Types> types) {
		this.types = types;
	}
	public List<ClothingSize> getClothingSize() {
		return clothingSize;
	}
	public void setClothingSize(List<ClothingSize> clothingSize) {
		this.clothingSize = clothingSize;
	}
	public List<ClothingImg> getClothingImg() {
		return clothingImg;
	}
	public void setClothingImg(List<ClothingImg> clothingImg) {
		this.clothingImg = clothingImg;
	}
	public List<ClothingColor> getClothingColor() {
		return clothingColor;
	}
	public void setClothingColor(List<ClothingColor> clothingColor) {
		this.clothingColor = clothingColor;
	}
	public List<ClothingCount> getClothingCount() {
		return clothingCount;
	}
	public void setClothingCount(List<ClothingCount> clothingCount) {
		this.clothingCount = clothingCount;
	}
	public List<ClothingKeyword> getClothingKeyword() {
		return clothingKeyword;
	}
	public void setClothingKeyword(List<ClothingKeyword> clothingKeyword) {
		this.clothingKeyword = clothingKeyword;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public long getComtTime() {
		return comtTime;
	}
	public void setComtTime(long comtTime) {
		this.comtTime = comtTime;
	}
	public int getBuyTimesSum() {
		return buyTimesSum;
	}
	public void setBuyTimesSum(int buyTimesSum) {
		this.buyTimesSum = buyTimesSum;
	}
	public long getLastBuyTime() {
		return lastBuyTime;
	}
	public void setLastBuyTime(long lastBuyTime) {
		this.lastBuyTime = lastBuyTime;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	
	public String getRecommend() {
		return recommend;
	}
	public void setRecommend(String recommend) {
		this.recommend = recommend;
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
		Clothing other = (Clothing) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
