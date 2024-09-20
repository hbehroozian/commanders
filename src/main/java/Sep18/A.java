package Sep18;

public class A {

    private int numberInA;

    public A(){
       super();
       numberInA = 0;
    }
    public A(int numberInA){
        this();
        this.numberInA = numberInA;
    }

    public int getNumberInA(){
        System.out.println("this is the method in A");

        return numberInA;
    }

    public void setNumberInA(int numberInA){
        this.numberInA = numberInA;
    }

}
