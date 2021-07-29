package patikaStore;

public class Notebook extends Product {
	private int notebookMemory;

	public Notebook(int productId, String productName, int productCost, double discountRate, int stockAmount, int ram,
			double screenSize, int brandId,int notebookMemory) {
		super(productId, productName, productCost, discountRate, stockAmount, ram, screenSize, brandId);
		this.notebookMemory=notebookMemory;
	}

	public int getNotebookMemory() {
		return notebookMemory;
	}

	public void setNotebookMemory(int notebookMemory) {
		this.notebookMemory = notebookMemory;
	}
}
