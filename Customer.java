import java.util.Scanner;

public class Customer{
	private String name;
	private String email;
	private String password;
	private String address;
	private String postalCode;
	private String phoneNumber;
	
	
	public Customer(){
		name = "John Doe";
		email = "Johndoe@gmail.com";
		password = "password123";
		address = "123 Street Road";
		postalCode = "A1A 1A1";
		phoneNumber = "1112223333";
	}
	public Customer(String n,String e,String p,String a, String pc, String pn) {
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
		if (checkName(change))
			name = change;
		else
			name = "Invalid";
	}
	public boolean checkName(String change){
		boolean wrong = false;
		char c;
		for(int x = 0; x < change.length();x++){
			c = change.charAt(x);
			if (!Character.isLetter(c) && !Character.isWhitespace(c))
				wrong = true;
		}
		if (wrong)
			return false;
		else 
			return true;
	}

	public String getEmail(){
		return email;
	}

	public void setEmail(String change){
		if (checkEmail(change))
			email = change;
		else 
			email = "Invalid";
	}
	public boolean checkEmail(String change){
		boolean atsign = false;
		boolean period = false; 
		if (change.indexOf("@")!=-1)
			atsign = true;
		if (change.indexOf(".")!= -1) 
			period = true;
		
		if (atsign && period)
			return true;
		else 
			return false;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String change){
		if (checkPassword(change))
			password = change;
		else 
			password = "Invalid";

	}
	public boolean checkPassword(String change){
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
			return true;
			//password = encryptPassword(change);
		else 
			return false;
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
		if (checkPhoneNumber(change))
			phoneNumber = change;
		else
			phoneNumber = "Invalid";
	}

	public boolean checkPhoneNumber(String change){
		char c;
		boolean valid = true;
		for(int x = 0;x < change.length(); x++){
			c = change.charAt(x);
			if (!Character.isDigit(c))
				valid = false;
		}
		return valid;
	}

	public static String encryptPassword(String password){
		String key = "";
		String output = "";
		return output;
	}
}