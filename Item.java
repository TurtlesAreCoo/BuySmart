
public class Item {
	private itemName String;
	private itemCode String;
	private itemPrice float;
	
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
	public void setItemPrice(float price) {
		if (price > 0)
			itemPrice=price;
		else
			itemPrice = 0;
	}
	public float getItemPrice() {
		return itemPrice;
	}
	public static void main(String[] args) {
		
	}
}
