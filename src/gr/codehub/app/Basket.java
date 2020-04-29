package gr.codehub.app;

import java.util.ArrayList;

public class Basket {

    private ArrayList<Product> products = new ArrayList<>();

    public void add(Product p){
        products.add(p);
    }

    public void remove(int index){
        if(index >=0 && index < products.size())
        products.remove(index);
        else
            System.out.println("Index out of bound.");
    }
    public void clearProducts () {
        products.clear();
        System.out.println("Clear done.");
    }
    public void  display (){
        //print with foreach
        //for(Product p : products){
        //System.out.println(p);
        //}

        //printing using Lambda calculus
        //products.forEach( product -> System.out.println(product));

        //new way - same with the above line
        products.forEach(System.out::println);

    }
    public double  getTotalCost  (){
//        double total = 0;
//        for (Product p: products) {
//           total += p.getPrice() * p.getQuantity();
//        }

        return products.stream().map(p -> p.getPrice()*p.getQuantity()).reduce(0.0f,(a,b) -> a+b);
    }
}
