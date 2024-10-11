package Oct10;

public class FilterString {

    // Fields
    private String message;

    // Constructor
    public FilterString(String message) {
        setMessage(message);
    }

    // Private Methods
    private void setMessage(String message) {
        if ( message == null ) System.out.println("Value cannot be null");
        else this.message = message;
    }

    public String getMessage() {return this.message;}

    private String getUpperCaseCharacter() {
        StringBuilder upperCaseCharacters = new StringBuilder();
        for ( char character : getMessage().toCharArray()  ) {
            if ( Character.isUpperCase(character) ) {
                upperCaseCharacters.append(character);
            }
        }
        return upperCaseCharacters.toString();
    }

    private String getLowerCaseCharacter() {
        StringBuilder lowerCaseCharacters = new StringBuilder();
        for ( char character : getMessage().toCharArray()  ) {
            if ( Character.isLowerCase(character) ) {
                lowerCaseCharacters.append(character);
            }
        }
        return lowerCaseCharacters.toString();
    }

    private String getNumbersCharacter() {
        StringBuilder numbers = new StringBuilder();
        for ( char character : getMessage().toCharArray()  ) {
            if ( Character.isDigit(character) ) {
                numbers.append(character);
            }
        }
        return numbers.toString();
    }

    private String getSpecialCharacter() {
        StringBuilder specialCharacters = new StringBuilder();
        for ( char character : getMessage().toCharArray()  ) {
            if ( Character.isLetterOrDigit(character) ) {
                specialCharacters.append(character);
            }
        }
        return specialCharacters.toString();
    }

    public void printUpperCaseCharacters() {
        String upperCaseCharacters = getUpperCaseCharacter();
        if ( !upperCaseCharacters.isEmpty() ) {
            System.out.println("UpperCase  Characters: " + upperCaseCharacters );
        }
    }

    public void printLowerCaseCharacters() {
        String lowerCaseCharacters = getLowerCaseCharacter();
        if ( !lowerCaseCharacters.isEmpty() ) {
            System.out.println("LowerCase  Characters: " + lowerCaseCharacters );
        }
    }

    public void printNumbers() {
        String numbers = getNumbersCharacter();
        if ( !numbers.isEmpty() ) {
            System.out.println("LowerCase  Characters: " + numbers );
        }
    }

    public void printSpecialCharacters() {
        String specialCharacters = getSpecialCharacter();
        if ( !specialCharacters.isEmpty() ) {
            System.out.println("LowerCase  Characters: " + specialCharacters );
        }
    }

    // A method to print all filters
    public void printAll() {
        printUpperCaseCharacters();
        printLowerCaseCharacters();
        printNumbers();
        printSpecialCharacters();
    }


}
