package Oct03;

public class Utility {


    //Print out in console
    public void print(String message) {
        System.out.println(message);
    }

    //Check for driver license
    public boolean isEligible(int age) {
        //Apply rules to the age
        if (age <16) return false;

        return true;
    }
}
