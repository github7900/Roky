public class Rectangle {
    private double length;
    private double breadth;
    private Rectangle(){
        this.length =0;
        this.breadth =0;
    }
    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public Rectangle(double side){
        this.length = side;
        this.breadth = side;
    }
    public double getArea(){
        return this.length*this.breadth;
    }
    public static void main (String[]args){
        Rectangle r1 = new Rectangle();
        System.out.println("Area of rectangle with no parameters:" + r1.getArea());
        Rectangle r2 = new Rectangle(5,10);
        System.out.println("Area of rectangle with two parameters:" + r2.getArea());
        Rectangle r3 = new Rectangle(7);
        System.out.println("Area of rectangle with one parameters:" + r3.getArea());
    }
}
