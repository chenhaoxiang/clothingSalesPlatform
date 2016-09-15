package cn.hncu.domain.users;

import cn.hncu.domain.clothing.Types;

/**
 * 用户个性化参数表对应的JavaBean
 * @author 陈浩翔
 * 2016-9-9
 */
public class UsersTypes {
	private Users users;
	//只记录具体商品类型，也就是等级为3的
	private Types types;//服装类型
	private int buyTimes;//购买过的次数
	private int seeTimes;//浏览次数
	private long lastSeeTime;//最后浏览此类型服装的时间
	private double weights;//权重值
	
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	public Types getTypes() {
		return types;
	}
	public void setTypes(Types types) {
		this.types = types;
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
	public long getLastSeeTime() {
		return lastSeeTime;
	}
	public void setLastSeeTime(long lastSeeTime) {
		this.lastSeeTime = lastSeeTime;
	}
	public double getWeights() {
		return weights;
	}
	public void setWeights(double weights) {
		this.weights = weights;
	}
	
}
