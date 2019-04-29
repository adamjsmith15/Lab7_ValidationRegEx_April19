package co.grandcircus;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidationRegEx {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		final String PROMPT = "Please enter a valid ";
		System.out.println(valueCheck(scnr, "name", PROMPT));
		scnr.nextLine();
		System.out.println(valueCheck(scnr, "email", PROMPT));
		System.out.println(valueCheck(scnr, "phone number", PROMPT));
		System.out.println(valueCheck(scnr, "date",PROMPT));
		
		scnr.close();

	}
//	public static String getName(Scanner sc, String prompt) {
//		
//		String s = "";
//		boolean boole = false;
//		while (boole == false) {
//			System.out.print(prompt);
//			s = sc.next();
//			if(nameValidator(s) == true) {
//				boole = true;
//			}else {
//				continue;
//			}
//		}
//		return s;
//		
//	}
	
	public static String valueCheck(Scanner sc, String value, String prompt) {
		System.out.print(prompt + value + ": ");
		String s = sc.next();
		if(value.equals("name")) {
			if (nameValidator(s) == true) {
				return value + " is valid!";
			} else {
				return "Sorry, " + value + " is not valid!";
			}
		} else if(value.equals("email")) {
			if (emailValidator(s) == true) {
				return value + " is valid!";
			} else {
				return "Sorry, " + value + " is not valid!";
			}
		} else if (value.equals("phone number")) {
			if (phoneValidator(s) == true) {
				return value + " is valid!";
			} else {
				return "Sorry, " + value + " is not valid!";
			}
		} else if(value.equals("date")) {
			if (dateValidator(s) == true) {
				return value + " is valid!";
			} else {
				return "Sorry, " + value + " is not valid!";
			}
		}else {
			return "Error! Not an appropriate type";
		}
		
	}

	public static boolean nameValidator(String name) {
		name = name.toLowerCase();
		boolean boole = Pattern.matches("[a-z]{1,30}", name);
		return boole;
	}

	public static boolean emailValidator(String email) {
		boolean boole = Pattern.matches("[a-z0-9]{5,30}@[a-z0-9]{5,30}.[a-z0-9]{2,3}", email);
		return boole;
	}

	public static boolean phoneValidator(String number) {
		boolean testPhone = Pattern.matches("\\d{3}-\\d{3}-\\d{4}", number);
		return testPhone;
	}

	public static boolean dateValidator(String date) {
		boolean boole = Pattern.matches("\\d{2}\\/\\d{2}\\/\\d{4}", date);
		return boole;
	}

}
//public static String getString(Scanner sc, String prompt) {
//	System.out.print(prompt);
//	String s = sc.next(); // read user entry
//	sc.nextLine(); // discard any other data entered on the line
//	return s;
//}
//public static int getInt(Scanner sc, String prompt) {
//	int i = 0;
//	boolean isValid = false;
//	while (isValid == false) {
//		System.out.print(prompt);
//		if (sc.hasNextInt()) {
//			i = sc.nextInt();
//			isValid = true;
//		} else {
//			System.out.println("Error! Invalid integer value. Try again.");
