package basics;

public class BreakAndContinueExample {
    public static void main(String[] args) {
        // break - will stop the loop
        for (int i = 0; i < 10; i++) {
            if (i > 5) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("------------------------------");

        // continue - will skip the iteration
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

    }
}
