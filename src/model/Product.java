package model;

public class Product {
	private int id;
	private String name;
	private String description;
	private float price;
	private String src;
	private String type;
	private String brand;
	private int number;
	
	public Product() {};
	
	public Product(int id, String name, String description, float price, String src, String type, String brand, int number) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.src = src;
		this.type = type; 
		this.brand = brand; 
		this.number = number;
	}
	
	public Product(int id, String name, String description, float price, String src, String type, String brand) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.src = src;
		this.type = type; 
		this.brand = brand; 
	}
	
	public String getBrand() {
		return brand;
	}
	public String getDescription() {
		return description;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getNumber() {
		return number;
	}
	public float getPrice() {
		return price;
	}
	public String getSrc() {
		return src;
	}
	public String getType() {
		return type;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public void setType(String type) {
		this.type = type;
	}
}


