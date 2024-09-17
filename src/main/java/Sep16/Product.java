package Sep16;

import java.awt.*;

public class Product {

    // 1. define your variables
    String name;
    double price;
    String category;
    Color color;
    String model;
    String sku;

    // 2. constructors
    // - if you do not create any constructor, you will get one from Object
    // - default constructor - it has no arguments
    // - parameterized constructor - it has arguments
    // what is a constructor? it's used to create objects of the class
    // constructors typically initialize all variables of the class
    public Product(){
        this.name = "";
        this.price = 0;
        this.category = "";
        this.color = new Color(0,0,0);
        this.model = "";
        this.sku = "";
    }

    public Product(String name, double price, String category, Color color, String model, String sku){
        this.name = name;
        this.price = price;
        this.category = category;
        this.color = color;
        this.model = model;
        this.sku = sku;
    }

    public String getName(){
        return name;
    }


    // just to test
    public static void main(String[] args) {
        System.out.println("print line 1");
        Product obj1 = new Product();
        Product obj2 = new Product();
        Product obj3 = new Product();


        System.out.println(obj1.getName());

        obj1.name = "TV 65 inch Samsung";
        obj1.model = "";
        obj2.name = "iPhone 16";
        obj3.name = "iMac";

        System.out.println(obj1.getName());

        Product obj4 = new Product("iPhone", 899.99, "Electronics", Color.GRAY, "+ 16inch + 256 GB", "jh123iouas89");

        System.out.println(obj4.name + " " + obj4.sku);


    }


}
