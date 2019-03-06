import java.util.Scanner;

public class Customer{
	private String name;
	private String email;
	private String password;
	private String address;
	private String postalCode;
	private int phoneNumber;

	public String getName() {
		return name;
	}

	public void setName(String change){
		name = change;
	}

	public String getEmail(){
		return email;
	}

	public void setEmail(String change){
		email = change;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String change){
		password = encryptPassword(change);
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

	public void createAccout(String n,String e,String p,String a, String pc, int pn) {
		name = n;
		email = e;
		password = encryptPassword(p);
		address = a;
		postalCode = pc;
		phoneNumber = pn; 
	}
}