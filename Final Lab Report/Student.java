class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Address {
    String street;
    String city;
    String state;
    int zipCode;

    public Address(String street, String city, String state, int zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
}

class Employee extends Person {
    Address address;

    public Employee(String name, int age, Address address) {
        super(name, age);
        this.address = address;
    }
    public static void main(String[] args) {
        Employee employee = new Employee("Doe Jho", 30, new Address("124 Main Street", "Russia", "CA", 12345));

        System.out.println("Employee name: " + employee.name);
        System.out.println("Employee age: " + employee.age);
        System.out.println("Employee address: " + employee.address.street + ", " + employee.address.city + ", " + employee.address.state + " " + employee.address.zipCode);
    }
}