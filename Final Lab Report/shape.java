class shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
    void erase() {
        System.out.println("Erasing a shape");
    }
}
class Circle extends shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
    @Override
    void erase() {
        System.out.println("Erasing a circle");
    }
}
class Triangle extends shape {
    @Override
    void draw() {
        System.out.println("Drawing a triangle");
    }
    @Override
    void erase() {
        System.out.println("Erasing a triangle");
    }
}
class Square extends shape {
    @Override
    void draw() {
        System.out.println("Drawing a square");
    }
    @Override
    void erase() {
        System.out.println("Erasing a square");
    }
    public static void main(String[] args) {
        shape shape = new Circle();
        shape.draw();
        shape.erase();

        shape = new Triangle();
        shape.draw();
        shape.erase();

        shape = new Square();
        shape.draw();
        shape.erase();
    } }