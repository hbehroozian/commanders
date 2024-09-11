package basics;

import java.util.Scanner;

public class WhiteLoopExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean isEmailValid = false;
        boolean isNameValid = false;

        String email = "", fullName= "";
        while(!isEmailValid || !isNameValid){
            if(isNameValid == false){
                System.out.println("Please provide first and Last Name: ");
                fullName = sc.nextLine();
            }
            if(isEmailValid == false){
                System.out.println("Please provide a valid gmail account: ");
                email = sc.nextLine();
            }
            isNameValid = fullName.split(" ").length > 1;
            isEmailValid = email.endsWith("@gmail.com");
        }

        System.out.println("Full Name: " + fullName);
        System.out.println("Email: " + email);
    }
}
