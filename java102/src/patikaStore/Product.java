package patikaStore;

public class Product {
	private int productId;
	private String productName;
	private int productCost;
	private double discountRate;
	private int stockAmount;
	private int ram;
	private double screenSize;
	
	
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductCost() {
		return productCost;
	}
	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public double getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	private int brandId;
	
	
	public Product(int productId, String productName, int productCost, double discountRate, int stockAmount, int ram,
			double screenSize, int brandId) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
		this.discountRate = discountRate;
		this.stockAmount = stockAmount;
		this.ram = ram;
		this.screenSize = screenSize;
		this.brandId = brandId;
	}
	public void listProduct(){}
	public void deleteById() {}

}
