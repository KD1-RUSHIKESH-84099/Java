
public class Invoice {
	
	private String partType;
	private String desc;
	private int quantity;
	private double pricePerItem;
	
	public Invoice(String partType, String desc, int quantity, double pricePerItem) {
		this.partType = partType;
		this.desc = desc;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}

	public String getPartType() {
		return partType;
	}

	public void setPartType(String partType) {
		this.partType = partType;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	
	
	double invoiceAmount() {
		return (quantity*pricePerItem);
	}
	 
	 

}
