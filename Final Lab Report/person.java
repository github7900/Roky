public class person {
    private final String Name;

    public person(String name) {
        this.Name = name;
    }

    public void printName() {
        System.out.println("Name: " + this.Name);
    }
    public static void main(String[] args) {
        person p1 = new person("Rocky");
        p1.printName();}}