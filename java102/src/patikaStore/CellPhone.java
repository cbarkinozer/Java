package patikaStore;

public class CellPhone extends Product {

	
	private int color;
	private int batteryPower;
	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getBatteryPower() {
		return batteryPower;
	}

	public void setBatteryPower(int batteryPower) {
		this.batteryPower = batteryPower;
	}

	public int getCellMemory() {
		return cellMemory;
	}

	public void setCellMemory(int cellMemory) {
		this.cellMemory = cellMemory;
	}

	private int cellMemory;
	
	public CellPhone(int productId, String productName, int productCost, double discountRate, int stockAmount, int ram,
			double screenSize, int brandId, int color, int batteryPower,int cellMemory) {
		super(productId, productName, productCost, discountRate, stockAmount, ram, screenSize, brandId);
		this.color = color;
		this.batteryPower = batteryPower;
		this.cellMemory=cellMemory;
	}

}
