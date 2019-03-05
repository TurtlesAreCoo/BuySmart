import java.util.Scanner;

public class Customer{
	private String name;
	private String email;
	private String password;
	private String address;
	private String postalCode;
	private int phoneNumber;

	public static String getName() {
		return name;
	}

	public static String getEmail(){
		return email;
	}

	public static String getPassword(){
		return password;
	}
	public static String getAddress(){
		return address;
	}
	public static String getPostalCode(){
		return postalCode;
	}

	public static String getPhoneNumber(){
		return phoneNumber;
	}

	public static String encryptPassword(String password){
		String key = "";
		String output = "";
		return output;
	}

	public void createAccout(String n,String e,String p,String a, String pc, String pn) {
		name = n;
		email = e;
		password = encryptPassword(p);
		address = a;
		postalCode = pc;
		phoneNumber = pn; 
	}
}