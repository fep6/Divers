package fr.KOOR.E.A.premiresExpressionsRegulieres;

public class Main {

	public static boolean isValidEmail(String email) {
		// Le dernier  - (car il est à la fin (ou au début)), passe pour lui-même
		String regExp="^[A-Za-z0-9._-]+@.+\\..+$";
		return email.matches( regExp );
	}
	
	public static void main(String[] args) {
		
//		String regExp = "nobody@nowhere.com";
		System.out.println(isValidEmail("nobody@nowhere.com"));

	}

}
