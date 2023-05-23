import sun.jvm.hotspot.debugger.Address;

public class Employee {

    // Declaring the attributes
    private String name;
    //double to suit half hours
    private double hours;
    private double rate;
    private Address[] address;

    //default constructor
    public Employee() {
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

    //getters
    public String getName() {
        return this.name;
    }

    public double getHours(){
        return this.hours;
    }

    public double getRate(){
        return this.rate;
    }

    public Address[] getAddress(){
        return this.address;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }

    public void setHours(double hours){
        this.hours = hours;
    }

    public void setRate(double rate){
        this.rate = rate;
    }

    public void setAddress(Address[] address){
        this.address = address;
    }

    public String toString() {
        return "Name: " + name + ", Hours: " + hours + ", Rate: " + rate + ", Primary Address: " + address[0];
    }
}
