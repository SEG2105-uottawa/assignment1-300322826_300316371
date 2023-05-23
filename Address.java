public class Address {

    //instance variables
    private String street;
    private int number;
    private String postal;

    public Address(String street, int number, String postal){
        this.street = street;
        this.number = number;
        this.postal = postal;
    }


    //getters
    public String getStreet(){
        return this.street;
    }

    public int getNumber(){
        return this.number;
    }

    public int getPostal(){
        return this.postal;
    }


    //setters
    public void setStreet(String street){
        this.street = street;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public void setPostal(String postal){
        this.postal = postal;
    }


    public String toString(){
        return number + " " + street + " Street, " + postal;
    }

}
