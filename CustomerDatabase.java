import java.util.Map;
import java.util.HashMap;

public class CustomerDatabase {
		Map<String,Customer> customers;
		
		public CustomerDatabase() {
			customers = new HashMap<String,Customer>();
		}
		public void addCustomer(Customer newOne) { 
			customers.put(newOne.getEmail(), newOne);
		}

		public Customer getCustomer(String email){
			return customers.get(email);
		}
}