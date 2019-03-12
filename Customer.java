import java.util.Scanner;

public class Customer{
	private String name;
	private String email;
	private String password;
	private String address;
	private String postalCode;
	private int phoneNumber;

	public  Customer(String n,String e,String p,String a, String pc, int pn) {
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
		for(char c: change) {
			if (!Character.isLetter(c))
				throw new InputMismatchExpcetion("That is not a valid name");
		}
		name = change;
	}

	public String getEmail(){
		return email;
	}

	public void setEmail(String change){
		boolean atsign = false;
		boolean period = false; 
		for(char c: change){
			if (c.equals('@')){
				if(!atsign)
					atsign = true;
				else 
					throws new InputMismatchExpcetion("Invalid email");
			}
			if (c.equals('.')){
				if(!period)
					period = true;
				else 
					throws new InputMismatchExpcetion("Invalid email");
			}
		}
		email = change;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String change){
		boolean uppercase = false;
		boolean lowercase = false;
		boolean number = false;
		String out = "Your password is missing a"
		for(char c: change){
			if (Character.isDigit(c))
				number = true;
			else if(Character.isUpperCase(c))
				uppercase = true;
			else if(Character.isLowerCase(c))
				lowercase = true;
		}
		if (uppercase && lowercase && number)
			password = encryptPassword(change);
		if (!uppercase)
			out += "Uppercase";
		if (!lowercase)
			out += " Lowercase"
		if (!number)
			out+= " a Number";
		throw new InputMismatchExpcetion(out);

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

	public int getPhoneNumber(){
		return phoneNumber;
	}

	public void setPhoneNumber(int change){
		phoneNumber = change;
	}

	public static String encryptPassword(String password){
		String key = "";
		String output = "";
		return output;
	}
}