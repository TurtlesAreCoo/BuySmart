
public class Item {
	private itemCode String;
	private itemName String;
	private itemPrice float;
	
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
		itemPrice=price;
	}
	public float getItemPrice() {
		return itemPrice;
	}
	public static void main(String[] args) {
		
	}
}
