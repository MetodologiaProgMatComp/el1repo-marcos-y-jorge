package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Account2 {
    private int id;
    private Customer2 customer2;
    private double balance;
    public Account2(int id, Customer2 customer2, double balance){
        this.id=id;
        this.customer2=customer2;
        this.balance=balance;
    }
    public Account2(int id, Customer2 customer2){
        this.id=id;
        this.customer2=customer2;
    }

    public int getId() {
        return id;
    }

    public Customer2 getCustomer2() {
        return customer2;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return getCustomer2Name()+ "(" + id + ") balance=$" + balance ;
    }
    public String getCustomer2Name(){
        return customer2.getName();
    }
    public Account2 deposit(double amount){
        balance = amount+balance ;
        return this;
    }
    public Account2 withdraw(double amount){
        if (balance >= amount){
            balance -= amount;
        }
        else{
            System.out.println ("amount withdrawn exceeds the current balance");
        }
        return this;
    }
}
