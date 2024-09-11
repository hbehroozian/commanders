package basics;

public class ReviewW1 {
    public static void main(String[] args) {
        double x = 10 / 2 + 1 + 1 * 3;
        System.out.println(x);

        int a = 10;
        int b = 5;
        double c = 2.0;

        a = b + a * 2 /3;
        System.out.println(a);
        c = b + a * c;
        System.out.println(c);
        c = b / c;
        System.out.println(c);

        b = (int) c;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);



        int a1 = 5;
        int b1 = 3;
        double c1 = 5;
        double x1 = c/a+b/c;

        c1= a1/b1;
        x1= c1+ b1/a1;

        System.out.println(x1);



        int x2 = 10;
        int y2 = ++x2;
        x2 = y2++;
        System.out.println(x2);
        System.out.println(y2);



    }
}
