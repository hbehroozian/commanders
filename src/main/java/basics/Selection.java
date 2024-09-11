package basics;

import java.util.Random;

public class Selection {


    public static void main(String[] args) {


        int a = 10;
        int b = 5;

        if (a > b) {
            System.out.println("a is bigger");
        } else {
            System.out.println("b is bigger");
        }


        if (a == b) {
            System.out.println("a is same as b");
        } else if (a < b) {
            System.out.println("here b is bigger");
        }


        // you can have multiple true statemens if you create a block of code = it's called true block
        if (true) {
            // this is a block of code
            // I can have multiple lines in here
        }

        // you can only run one branch from a selection
        if (true) {
            // this is if the condition is true
        } else {
            // this is if the condition is false
        }
        // and you can only run one of them


        // you can only run one branch from a selection
        if (true) {
            // this is if the condition is true
        } else if (false) {
            // this is if the condition is false
        } else {

        }
        // and you can only run one of them

        // dont meistake two if statement with one
        if (true) {
            System.out.println("runt line 1");
        }
        if (true) {
            System.out.println("runt line 2");
        }
        // in this case this is two if statements
        // so both can be executed


        int x = 10;
         if ((x = ++x + 5) > 14){
              System.out.println("is this going to run? ");

          } else if ((x = 10) < 10){

         }




         // unary operator - (conditions) ? true : false

        int c = a > b ? 15 : 8;



        // switch case
        // switch (expression)
        // cases
        // end each case with break
        // default

        // the data types you could use for expressions is  byte , short , char , and int, String, Enum

        System.out.println("--------------------------");
        // question 1:
        // int day will be from 0-6
        // you have to print the names of the remaining days of the week

        int day = getRand();

        switch (day){
            case 0:
                System.out.println("Saturday");
//                break;
            case 1:
                System.out.println("Sunday");
//                break;
            case 2:
                System.out.println("Monday");
//                break;
            case 3:
                System.out.println("Tuesday");
//                break;
            case 4:
                System.out.println("Wednesday");
//                break;
            case 5:
                System.out.println("Thursday");
//                break;
            case 6:
                System.out.println("Friday");
                break;
            default:
                System.out.println("number is out of range");
        } // << end








    }

    public static int getRand(){
        Random temp = new Random();
        int res = temp.nextInt(10);
        System.out.println(res);
        return res;
    }



}
