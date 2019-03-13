import java.util.Map;
import java.util.HashMap;

public class CustomerDatabase {
		Map<String,Customer> customers;
		//String n,String e,String p,String a, String pc, String pn
		public CustomerDatabase() {
			customers = new HashMap<String,Customer>();
		}
		public void addCustomer(Customer newOne) { 
			customers.put(newOne.getEmail(), newOne);
		}

		public Customer getCustomer(String email){
			return customers.get(email);
		}
		public void removeCustomer(String email){
			customers.remove(email);
		}
		public int getSize(){
			return customers.size();
		}
}