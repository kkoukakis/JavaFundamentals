package gr.codehub.app;

public class Customer {

    //fields

    private int VAT;
    private int ID;
    private String fullname;
    private String favorite_shop;

    //constructors

    public Customer(int VAT, int ID, String fullname, String favorite_shop) {
        this.VAT = VAT;
        this.ID = ID;
        this.fullname = fullname;
        this.favorite_shop = favorite_shop;
    }


    //getter methods, accessors

    public int getVAT() {
        return VAT;
    }

    public int getID() {
        return ID;
    }

    public String getFullname() {
        return fullname;
    }

    public String getFavorite_shop() {
        return favorite_shop;
    }

    //setter methods,  mutators, modifiers

    public void setVAT(int VAT) {
        this.VAT = VAT;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setFavorite_shop(String favorite_shop) {
        this.favorite_shop = favorite_shop;
    }


    //toString


    @Override
    public String toString() {
        return "Customer{" +
                "VAT=" + VAT +
                ", ID=" + ID +
                ", fullname='" + fullname + '\'' +
                ", favorite_shop='" + favorite_shop + '\'' +
                '}';
    }



}
