package Oct03;

import java.util.Scanner;

public class ExampleQuestion {

    //Password => get user input and check against roles
    /*
    At Least 1 Character upper case
    At Least 1 Special Character
    At Least 1 Number
    Have to 8 character length
     */

    /*
    If Conditions and use replace all for regular expression [A-Za-z0-9]
     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password:");
        String password = scanner.next();

        if (password.length() < 8) {
            throw new RuntimeException("Password length should be 8 characters");
        }

        String uppercase = password.replaceAll("[a-z0-9]", "")
                .replaceAll("[^A-Za-z0-9]", "");
        if (uppercase.isEmpty()) {
            throw new RuntimeException("At Least 1 Uppercase Character is required");
        }

        String specialCharacter = password.replaceAll("[A-Za-z0-9]", "");
        if (specialCharacter.isEmpty()) {
            throw new RuntimeException("At least 1 special character required");
        }

        String numberCharacter = password.replaceAll("[A-Za-z]", "")
                .replaceAll("[^A-Za-z0-9]" ,"");
        if (numberCharacter.isEmpty()) {
            throw new RuntimeException("At Least 1 Number required");
        }

        System.out.println("Password accepted");
    }


    /*
    Using scanner
    convert to char array
    check for length
    Loop through each character
    for Upper case, number,  regex,
     */
    public void solution1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a password:");
        String password = scanner.next();
        if (password.length() < 8) {
            throw new RuntimeException("Password length not match");
        }
        char[] characters = password.toCharArray();

        boolean uppercaseLetterFlag = false;
        boolean specialCharacterFlag = false;
        boolean numberFlag = false;

        for (int i = 0; i < characters.length; i++) {
            char charactor = characters[i];
            if (Character.isUpperCase(charactor)) {
                uppercaseLetterFlag = true;
            }
            if (Character.isDigit(charactor)) {
                numberFlag = true;
            }
            if (!Character.isAlphabetic(charactor) && !Character.isDigit(charactor)) {
                specialCharacterFlag = true;
            }
        }

        if (uppercaseLetterFlag && specialCharacterFlag && numberFlag) {
            System.out.println("Password is accepted");
        } else {
            System.out.println("Password not accepted");
        }
    }

}
