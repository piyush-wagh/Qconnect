package hr;

import java.util.Scanner;
import java.util.ArrayList;
public class Homepage {
	Scanner scanner = new Scanner(System.in);
	public void features() {
		System.out.println("Home Page");
		System.out.println("1 . Add Student");
		System.out.println("2 . Edit Student");
		System.out.println("3 . Add Mock Rating");
		System.out.println("4 . Update mock Rating");
		System.out.println("5 . Placed Student");
		System.out.println("6 . Requirements");
		System.out.println("7 . Upadate Profile");
		System.out.println("8 . Logout");
		System.out.print("9 . Enter the option");
		int opt = scanner.nextInt();
		switch(opt) {
		case 1:
			addStudent();
			break;
				
		default:
			break;
		}
	}
	private void addStudent() {
		System.out.println("Student Details");
		System.out.println("Name :");
		String name = scanner.nextLine();
		System.out.println("Contact :");
		long contact = scanner.nextLong();
		System.out.println("Email :");
		String email = scanner.next();
		System.out.println("Address :");
		String address = scanner.nextLine();
		System.out.println("Gender :");
		String gender = scanner.next();
		ArrayList<Education> list = addEducation();
		Student student = new Student(name ,contact,email,address,gender,list);
	}
	private ArrayList<Education> addEducation(){
	ArrayList<Education> list = new ArrayList<Education>();
	for(;;) {
		System.out.println("Enter Education Details");
		System.out.println("Qualification");
		String qual = scanner.nextLine();
		System.out.println("College/School Name :");
		String college = scanner.nextLine();
		System.out.println("University :");
		String university = scanner.nextLine();
		String stream = null;
		if(!(qual.equals("10")||qual.equals("12")))
		{
			System.out.println("Stream :");
			stream = scanner.nextLine();
		}
		System.out.println("Yop :");
		int yop = scanner.nextInt();
		System.out.println("cgpa/Percentage : ");
		double cgpa = scanner.nextDouble();
	}
	}
}
