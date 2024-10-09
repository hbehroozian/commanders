package Oct08;

import java.util.ArrayList;

public class InterviewQFibNumbers {

    public static void main(String[] args) {


        // create a function that returns n fib numbers

        System.out.println(Long.MAX_VALUE);
        // 0, 1, 1, 2, 3
        System.out.println(getFibNumbers(150));
    }

    public static ArrayList<Long> getFibNumbers(int n) {
        ArrayList<Long> res = new ArrayList<>();
        res.add(0L);
        res.add(1L);
        for (int i = 2; i < n; i++) {
            res.add(res.get(i - 1) + res.get(i - 2));
        }
        return res;
    }

}
