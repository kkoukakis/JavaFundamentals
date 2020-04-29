package gr.codehub.app;

import java.util.Scanner;

public class Ui {
    public int menu(){
        System.out.println("1. Add a product to Basket?\n2. Remove a product\n3. Display Basket\n4. Clear Basket\n0. Exit");
        int choice ;

        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();
        return choice;
    }

    //factory method design pattern
    public Product createProduct(){
        String code;
        String name;
        float price;
        int quantity;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the product code ");
        code = scanner.next();
        System.out.println("Give the product name ");
        name = scanner.next();
        System.out.println("Give the product price ");
        price = scanner.nextFloat();
        System.out.println("Give the product quantity ");
        quantity = scanner.nextInt();

        return new Product(code,name,price,quantity);

    }


}
