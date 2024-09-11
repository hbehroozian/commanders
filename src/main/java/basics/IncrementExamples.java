package basics;

public class IncrementExamples {
    public static void main(String[] args) {

        int x = 1;
        int y = 5;

        System.out.println(++x); // 2
        System.out.println(x++ + ++y + --x); // 10
        System.out.println(--y + x++ - y++); //
        System.out.println(x);
        System.out.println(y);


        // increment and decrement
        // increase by one and decrease by one

        // pre vs post =
        // pre is performing the operation then returning the result
        // post is returning the current value and then performing the operation

        // note: the operation of increment and decrement will actually change the value of the variable



        int w = 10;

        System.out.println(w + 10 * (w = w + 1));
        System.out.println(w-- + 5 + 2);
        System.out.println(++w);



    }
}
