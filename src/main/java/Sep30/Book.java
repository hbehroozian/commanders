package Sep30;

public class Book {

    // variables
    private String title;
    private double price;

    private static String publisher = "company";

    // methods

    // constructors -
    public Book(){
        this.title = "";
        this.price = 0;
    }

    public Book(String title, double price){
        this.title = title;
        this.price = price;
    }


    // method
    public String getTitle(){
        return title;
    }
    public double getPrice(){
        return price;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public static String getPublisher(){
        return publisher;
    }



    @Override
    public String toString(){
        return "Book - Title: " + title + ", Price: " + price + "." ;
    }

}
