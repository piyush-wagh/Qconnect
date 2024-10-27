package hr;

import java.util.Scanner;

public class Login {
	Scanner scanner = new Scanner(System.in);
	HR hr;
	
	public void login() {
		for(;;) {
			System.out.println("1 . Login");
			System.out.println("2 . Create Account");
			System.out.println();
			System.out.println("Enter the option");
			int opt = scanner.nextInt();
			
			switch(opt) {
			case 1:{
				loginHR();
				break;
			}
			case 2:{
				createAccount();
				break;
			}
			default:
				System.out.println("Wrong option Entered");
			}
		}
	}
	
	private void createAccount() {
		System.out.println("ACCOUNT CREATION MODULE");
		System.out.println("Username :");
		String un = scanner.next();
		System.out.println("Contact :");
		long cont = scanner.nextLong();
		System.out.println("Password :");
		String pass = scanner.next();
		System.out.println("Email :");
		String email = scanner.next();
		hr = new HR(un,cont,pass,email);
	}
	private  void loginHR() {
		if(hr != null) {
			System.out.println("Login Module");
			for(int i = 1;i<=3 ; i++) {
				System.out.println( "Username : ");
				String un = scanner.next();
				System.out.println("Password :");
				String pass = scanner.next();
				
				if(un.equals(hr.name)&& pass.equals(hr.pass))
				{
					Homepage homepage = new Homepage();
					homepage.features();
				}
				else {
					System.out.println("WRONG CREDENTIALS");
				}	
			}
			System.out.println("Forgot Password");
			boolean cndt = scanner.nextBoolean();
			if(cndt) {
				ForgotPassword forgotPassword = new ForgotPassword();
				forgotPassword.forgotPassword();
			}
		}
		else {
			System.out.println("CREATE YOUR ACCOUT FIRST");
		}
	}

}
