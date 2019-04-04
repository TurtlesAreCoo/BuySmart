
public class Item {
	private String itemName;
	private String itemCode;
	private double itemPrice;
	
	public Item(){ 
		itemName="no Item";
		itemCode="N/a";
		itemPrice=0.00;
	}

	public void setItemName(String name) { 
		itemName=name;
	}

	public String getItemName() {
		return itemName;
	}
	
	public void setItemCode(String code) {
		itemCode=code;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemPrice(double price) {
		if (price > 0)
			itemPrice=price;
		else
			itemPrice = 0;
	}
	
	public double getItemPrice() {
		return itemPrice;
	}
}
