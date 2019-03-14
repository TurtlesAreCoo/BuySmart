import java.util.Map;
import java.util.HashMap;

public class OrderDatabase{ 
	Map<Integer,Order> orders;

	public OrderDatabase(){
		orders = new HashMap<Integer, Order>();
	}

	public void addOrder(Order newOne){
		orders.put(newOne.getOrderID(),newOne);
	}

	public Order getOrder(int id,String email) {
		Order temp = orders.get(id);
		boolean verify = verifyOrder(temp,email);
		if (verify) {
			return temp;
		}
		return new Order();
	}

	public static boolean verifyOrder(Order check,String email){
		if (check.getEmail().equals(email))
			return true; //Check email on the order with the customers email.
		else
			return false;
	}

	public int getSize(){
		return orders.getSize();
	}
}