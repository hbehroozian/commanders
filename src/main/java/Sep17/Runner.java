package Sep17;

public class Runner {

    public static void main(String[] args) {

        Book obj1 = new Book("Harry Potter and the Philosopher's Stone", "J. K. Rowling", "978-0-7475-3269-9");
        System.out.println(obj1);

        System.out.println(obj1.getTitle());
        obj1.setIsbn("32135as1d5a1s5d");
        System.out.println(obj1);

    }
}
