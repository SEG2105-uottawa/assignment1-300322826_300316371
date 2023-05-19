public class Employee {

    // Declaring the attributes
    private String name;
    //used double for hours since it is possible to work half hours
    private double hours;
    private double rate;
    private Address[] address;

    //default constructor
    public Employee(){
        this.name = "John Doe";
        this.hours = 0.0;
        this.rate = 0.0;
        this.address = null;
    }

    // main constructor
    public Employee(String name, double hours, double rate, Address[] address) {
        this.name = name;
        this.hours = hours;
        this.rate = rate;
        this.address = address;
    }

    public String toString(){
        return "Name: " + name + ", Hours: " + hours + ", Rate: " + rate + ", Primary Address: " + address[0];
    }

    //Insert Partial Constructors

    /*
    public static void main(String[] args){
        Employee joe = new Employee();
        System.out.println(joe.hours);
        System.out.println("JoeWeeMamma");
    }
    */
}
