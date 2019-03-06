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

	public Order getOrder(int ID) {
		Order temp = orders.get(ID);
		boolean verify = verifyOrder(temp);
		if (verify) {
			return temp;
		}
		return new Order();
	}

	public static boolean verifyOrder(Order check){
		return true; //Check email on the order with the customers email.
	}
}