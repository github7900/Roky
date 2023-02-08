public class Main {
    static int method1(int a)
    {
        //System.out.println("Static Method");
        return a;
    }
    int method2(int b)
    {
        //System.out.println("non-Static Method");
        return b;
    }
    public static void main(String[] args) {
        method1('5');
        Main obj = new Main();
        obj.method2(Integer.parseInt("10"));
    }
}
