interface test {
    int square(int num);
}
class Arithmetic implements test {
    @Override
    public int square(int num) {
        return num * num;
    }
}
class ToTestInt {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        int result = arithmetic.square(7);
        System.out.println("Square: " + result);
    }
}