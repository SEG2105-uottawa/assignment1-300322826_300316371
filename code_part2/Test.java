public class Test {
    public static void main(String[] args){
        Address[] address = new Address[5];
        address[0] = new Address("Queen",48,"K1P1N2");
        address[1] = new Address("King Edward",800,"K1N6N5");

        Employee o1 = new Employee("Falcao", 40.0, 15.50, address);
        System.out.println(o1);

    }
}
