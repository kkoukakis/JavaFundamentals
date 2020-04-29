package gr.codehub.app;

public class Main {

    public static void main(String[] args) {

        Ui ui = new Ui();
        Basket basket = new Basket();
        int choice;
       do {

           choice = ui.menu();

           switch (choice) {
               case 1:
                   Product product = ui.createProduct();
                   basket.add(product);
                   break;
               case 2:

                   break;
               case 3:
                   basket.display();
                   break;
               case 4:
                   basket.clearProducts();
                   break;
               case 5:
                   System.out.println("Total Cost: " + basket.getTotalCost());
               case 0:
                   return;
           }
       }while(choice !=0);
       
    }


    //method declaration or method definition
    // static method, should be avoided
    public static float calculation(int quantity, float price) {
          float totalPrice;
          float tax = 1.1f;
          totalPrice = quantity * price;
          return totalPrice + tax;
    }


}
