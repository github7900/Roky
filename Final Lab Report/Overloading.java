class Overloading {
    void sum(int a, int b) {
        System.out.println("Sum of a and b is: " + (a + b));
    }
    void sum(int a, int b, int c) {
        System.out.println("Sum of a, b and c is: " + (a + b + c));
    }
    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.sum(10, 20);
        obj.sum(30, 40, 50);
     } }