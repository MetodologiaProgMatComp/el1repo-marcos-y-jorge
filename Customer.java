package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Customer {
    private int id;
    private String name;
    private int discount;
    public Customer(int id, String name,int discount){
        this.id=id;
        this.discount=discount;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return name + "(" + id + ") (" + discount + "%)" ;
    }
}
