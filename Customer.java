import java.util.Scanner;

public class Customer{
	private String name;
	private String email;
	private String password;
	private String address;
	private String postalCode;
	private String phoneNumber;
	
	public static void main(String[] args) {
	}
	public  Customer(String n,String e,String p,String a, String pc, String pn) {
		name = n;
		email = e;
		password = encryptPassword(p);
		address = a;
		postalCode = pc;
		phoneNumber = pn; 
	}

	public String getName() {
		return name;
	}
	public void setName(String change){
		boolean wrong = false;
		char c;
		for(int x = 0; x < change.length();x++){
			c = change.charAt(x);
			if (!Character.isLetter(c))
				wrong = true;
		}
		if (!wrong)
			name = change;
		else
			name = "";
	}

	public String getEmail(){
		return email;
	}

	public void setEmail(String change){
		boolean atsign = false;
		boolean period = false; 
		boolean wrong = false;
		char c;
		for(int x = 0; x < change.length();x++){
			c = change.charAt(x);
			if (Character.toString(c).equals('@')){
				if(!atsign)
					atsign = true;
				else 
					wrong = true;
			}
			if (Character.toString(c).equals('.')){
				if(!period)
					period = true;
				else 
					wrong = true;
			}
		}
		if (atsign && period && !wrong)
			email = change;
		else 
			email = "";
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String change){
		boolean uppercase = false;
		boolean lowercase = false;
		boolean number = false;
		boolean wrong = false;
		char c;
		for(int x = 0; x < change.length();x++){
			c = change.charAt(x);
			if (Character.isDigit(c))
				number = true;
			else if(Character.isUpperCase(c))
				uppercase = true;
			else if(Character.isLowerCase(c))
				lowercase = true;
		}
		if (uppercase && lowercase && number)
			password = encryptPassword(change);
		else 
			password = "";

	}

	public String getAddress(){
		return address;
	}

	public void setAddress(String change){
		address = change;
	}

	public String getPostalCode(){
		return postalCode;
	}

	public void setPostalCode(String change){
		postalCode = change;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}

	public void setPhoneNumber(String change){
		phoneNumber = change;
	}

	public static String encryptPassword(String password){
		String key = "";
		String output = "";
		return output;
	}
}