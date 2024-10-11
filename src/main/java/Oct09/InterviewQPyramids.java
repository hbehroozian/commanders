package Oct09;

public class InterviewQPyramids {
    public static void main(String[] args) {

        // * * * * *
        // * * * *
        // * * *
        // * *
        // *
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *

        printPyramid1(5);
        printPyramid2(5);

    }

    public static void printPyramid1(int row) {
        for (int i = row; i >= 1; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPyramid2(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
