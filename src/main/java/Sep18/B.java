package Sep18;

import java.util.Objects;

public class B extends A{


    String strInB;

    public B(){
        super();
        this.strInB = "";
    }

    public B(String strInB, int numberInA){
        super(numberInA);
        this.strInB = strInB;
    }

    @Override
    public int getNumberInA(){
        System.out.println("this is the method in B");
        return 10;
    }


    @Override
    public String toString() {
        return "B{" +
                "strInB='" + strInB + '\'' +
                '}';
    }
}
