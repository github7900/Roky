public class Main {
    static void method1(int a)
    {
        System.out.println("Static Method");
    }
    void method2(int b)
    {
        System.out.println("non-Static Method");
    }
    public static void main(String[] args) {
        method1();
        Main obj = new Main();
        obj.method2();
    }
}
