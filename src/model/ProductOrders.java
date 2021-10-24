package model;

public class ProductOrders {
	private int orderId;
	private int productId;
	private int amountProduct;
	private String nameProduct;
	
	public ProductOrders(int orderId, int productId, int amountProduct, String nameProduct) {
		this.orderId = orderId;
		this.productId = productId;
		this.amountProduct = amountProduct;
		this.nameProduct = nameProduct;
	}
	
	public int getAmountProduct() {
		return amountProduct;
	}
	public String getNameProduct() {
		return nameProduct;
	}
	public int getOrderId() {
		return orderId;
	}
	public int getProductId() {
		return productId;
	}
	public void setAmountProduct(int amountProduct) {
		this.amountProduct = amountProduct;
	}
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
}
