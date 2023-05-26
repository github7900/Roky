class Box {
    protected double length;
    protected double breadth;

    public Box(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return length * breadth;
    }
}

class Box3D extends Box {
    protected double height;

    public Box3D(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    public double getVolume() {
        return length * breadth * height;
    }

    public static void main(String[] args) {
        Box3D box3d = new Box3D(5, 4, 3);
        double area = box3d.getArea();
        double volume = box3d.getVolume();

        System.out.println("Area: " + area);
        System.out.println("Volume: " + volume);
    }
}