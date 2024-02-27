package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty;
    public Book(String name, Author author, double price){
        this.name=name;
        this.author=author;
        this.price=price;
    }
    public Book(String name, Author author, double price, int qty){
        this.name=name;
        this.author=author;
        this.price=price;
        qty=0;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' + ", " +
                " author=" + author +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
    public String getAuthorName(){
        return author.getName();
    }
    public String getAuthorEmail(){
        return author.getEmail();
    }
    public String getAuthorGender(){
        return getAuthorGender();
    }
}
