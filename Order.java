import java.util.ArrayList;

public class Order { 
	private String orderID;
	private boolean standard;
	private String email;
	private ArrayList<Item> cart;
	
	public Order(){
		orderID="000000";
		standard = true;
		email="Johndoe@gmail.com";
		cart = new ArrayList<Item>();
	}

	public Order(String id, boolean ship, String e){
		orderID = id;
		standard = ship;
		email = e;
		cart = new ArrayList<Item>();
	}

	public void setOrderID(String ID){
		orderID = ID;
	}

	public String getOrderID(){
		return orderID;
	}
	
	public void setShipping(String ship) {
		if (ship.toLowerCase().equals("standard")){
			standard = true;
		} else if (ship.toLowerCase().equals("express")){
			standard = false;
		} else { 
			standard = true;
		}
	}

	public String getShipping(){
		if (standard)
			return "Standard";
		else
			return "Express";
	}

	public void setEmail(String e){
		email = e;
	}

	public String getEmail(){
		return email;
	}

	public void addItem(Item item1){
		cart.add(item1);
	}

	public Item getItem(String name){
		return cart.get(cart.indexOf(name));
	}

	public int getSize(){
		return cart.size();
	}
}