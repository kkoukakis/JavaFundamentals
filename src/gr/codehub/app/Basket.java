package gr.codehub.app;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

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

    public  void saveBasket(String filename){
        try{
            PrintWriter printWriter = new PrintWriter(new File(filename));
            for (Product p: products) {
                printWriter.println(p.getCode()+","+p.getName()+","+p.getPrice()+","+p.getQuantity());
            }
            printWriter.close();
        }catch(Exception e){
            System.out.println("The file cannot be saved");
        }

    }

    public  void loadBasket(String filename){
        try {
            Scanner scanner = new Scanner(new File(filename));

            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] words = line.split(",");
                Product product = new Product(words[0],words[1],Float.parseFloat(words[2]),Integer.parseInt(words[3]));
                products.add(product);
            }


        } catch (Exception e) {
            System.out.println("The file cannot be loaded");
        }
    }


}
