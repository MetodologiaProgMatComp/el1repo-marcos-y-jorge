package S03.POO.UML;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName,String lastName, int salary){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary= salary;
    }
    public int getId(){
    return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getName(){
        String name= firstName.concat(lastName) ;
        return name;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return salary*12;
    }
    public int raiseSalary(int percent){
        salary=salary+((salary*percent)/100);
        return salary;
    }
    public String toString() {
        return "S03.POO.UML.Employee[id=" + id + " name= " + firstName + lastName + " salary= "+ salary+" ]";
    }

}
