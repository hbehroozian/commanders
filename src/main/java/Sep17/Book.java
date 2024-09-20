package Sep17;

import java.util.ArrayList;

public class Book{

    // create your variables
    private String title;
    private ArrayList<String> authors;
    private String isbn;

    // create your constructors

    public Book() {
        super();
        this.title = "";
        this.authors = new ArrayList<>();
        this.isbn = "";
    }

    public Book(String title, ArrayList<String> authors, String isbn) {
        this();
        this.title = title;
        this.authors = authors;
        this.isbn = isbn;
    }

    public Book(String title, String author, String isbn) {
        this();
        this.title = title;
        this.authors = new ArrayList<>();
        this.authors.add(author);
        this.isbn = isbn;
    }

    public Book(String title) {
        this();
        this.title = title;
    }

    // create any method that you like

    //getter
    public String getTitle(){
        return title;
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public String getIsbn() {
        return isbn;
    }

    //setter
    public void setTitle(String title){
        this.title = title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

//    public void setAuthors(ArrayList<String> authors) {
//        this.authors = authors;
//    }
    // toString: to represent this object in String format


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authors=" + authors +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
