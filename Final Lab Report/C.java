interface C {
    void meth1();
}
interface D {
    void meth2();
}
class MyClass implements C, D {
    @Override
    public void meth1() {
        System.out.println("meth1()");
    }
    @Override
    public void meth2() {
        System.out.println("meth2()");
    }
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.meth1();
        myClass.meth2();
    }
}