package cn.hncu.domain.users;

import cn.hncu.domain.clothing.Clothing;

/**
 * 用户订单明细表
 * @author 陈浩翔
 * @version 1.0 
 */
public class OrderDetails {
	private String id;
	private String ordersId;//所属订单的id
	private Clothing clothing;//服装
	private int amount;//购买的数量
	private double price;//总价格
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOrdersId() {
		return ordersId;
	}
	public void setOrdersId(String ordersId) {
		this.ordersId = ordersId;
	}
	public Clothing getClothing() {
		return clothing;
	}
	public void setClothing(Clothing clothing) {
		this.clothing = clothing;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
