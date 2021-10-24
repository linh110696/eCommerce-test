package model;

import java.util.Date;
import java.util.List;

public class Orders {
	private int orderId;
	private float price; //total amount of order
	private int status;
	private Date orderDate;
	private String address;
	private String phoneNumber;
	private List<ProductOrders> lp;
	private String userMail;
	private Date receivedDate;
	private String discount;
	
	public Orders() {
		// TODO Auto-generated constructor stub
	}
	
	public Orders(int orderId, float price, int status, Date orderDate, String address, String phoneNumber, List<ProductOrders> lp, String userMail, Date receivedDate) {
		this.orderId = orderId;
		this.price = price;
		this.status = status;
		this.orderDate = orderDate;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.lp = lp;
		this.userMail = userMail;
		this.receivedDate = receivedDate;
	}
	public Orders(String userMail, int status, String discount, String address, String phoneNumber) {
		this.status = status;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.userMail = userMail;
		this.discount = discount;
	}
	
	public String getAddress() {
		return address;
	}
	public String getDiscount() {
		return discount;
	}
	public List<ProductOrders> getLp() {
		return lp;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public int getOrderId() {
		return orderId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public float getPrice() {
		return price;
	}
	public Date getReceivedDate() {
		return receivedDate;
	}
	public int getStatus() {
		return status;
	}
	public String getUserMail() {
		return userMail;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public void setLp(List<ProductOrders> lp) {
		this.lp = lp;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

}
