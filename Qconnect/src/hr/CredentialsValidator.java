package hr;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CredentialsValidator{
    Scanner scanner = new Scanner(System.in);
    String phoneNumber;
    String password;
    String email;
    public void PhoneValidator(){
        //System.out.println("Enter valid phone number");
        for(;;){

        phoneNumber  = scanner.next();
        if(Pattern.matches("[6-9]{1}[0-9]{9}", phoneNumber)){
            System.out.println("Phone Number is valid go ahead");
           // return phoneNumber;
            break;
            
        }

        else{
            System.out.println("Invalid Phone Number please enter valid phone number !!!!");
        }
    }

    }
    public void PasswordValidator(){
        //System.out.println("Enter valid password");
        for(;;){
            password = scanner.nextLine();
            if (Pattern.matches("(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&]).{6,}$", password)) {
                System.out.println("Valid Password go ahead");
                break; // Exit loop if password is valid
            }
            else{
                System.out.println("Please enter a valid Password as we want !!!!");
                //System.out.println("1.Atleast one Upper case and one lowercase along with special character and integer with minimum length of 6");
            }

    }
}

public void emailValidator(){
    //System.out.println("Enter valid password");
    for(;;){
        email = scanner.nextLine();
        if (Pattern.matches("[a-z0-9._%+-]+@(gmail\\.com|qconnect\\.com|gmail\\.in|qconnect\\.in)$", email)) {
            System.out.println("Valid Email go ahead");
            break; 
        }
        else {
            System.out.println("Invalid Email. Must be in lowercase and end with @gmail.com, @qconnect.com, @gmail.in, or @qconnect.in.");
        }

}
}

}