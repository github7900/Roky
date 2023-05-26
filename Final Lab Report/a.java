class a {
    void display() {
        System.out.println("This is class A");
    }
}
class b extends a {
    @Override
    void display() {
        System.out.println("This is class B");
    }
public static void main(String[] args) {
        a a = new a();
        a.display();

        b b = new b();
        b.display();
    }
}