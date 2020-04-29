package gr.codehub.app;

import java.util.Scanner;

public class Ui {


    public Choice menu(){
        System.out.println("1. Add a product to Basket?\n2. Remove a product\n3. Display Basket\n4. Clear Basket\n5. Print TotalCost\n6. Save to file\n7. Load from file\n0. Exit");
        int choice ;

        Scanner scanner = new Scanner(System.in);
        try{
            choice = scanner.nextInt();
            switch(choice){
                case 1:
                    return Choice.ADD;
                case 2:
                    return Choice.REMOVE;
                case 3:
                    return Choice.DISPLAY;
                case 4:
                    return Choice.CLEAR;
                case 5:
                    return Choice.TOTALCOST;
                case 6:
                    return Choice.SAVE;
                case 7:
                    return Choice.LOAD;
                case 0:
                    return Choice.EXIT;
                default:
                    return Choice.ERROR;
            }
        }catch(Exception e){
            return Choice.ERROR;
        }
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

    public int getIndex(){
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        return index;
    }


    public void manage(Basket basket){
        Choice choice;
        do {

            choice = menu();

            switch (choice) {
                case ADD:
                    Product product = createProduct();
                    basket.add(product);
                    break;
                case REMOVE:
                    basket.remove(getIndex());
                    break;
                case DISPLAY:
                    basket.display();
                    break;
                case CLEAR:
                    basket.clearProducts();
                    break;
                case TOTALCOST:
                    System.out.println("Total Cost: " + basket.getTotalCost());
                    break;
                case SAVE:
                    basket.saveBasket("basket.txt");
                    break;
                case LOAD:
                    basket.loadBasket("basket.txt");
                    break;
                case EXIT:
                    return;
                case ERROR:
                    System.out.println("You gave erroneous input");
                    break;
            }
        }while(choice != Choice.EXIT);

    }
}
