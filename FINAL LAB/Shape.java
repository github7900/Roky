public class Shape {
    private int height;
    private int width;

    public Shape() {
        this.height = height;
        this.width = width;
        System.out.println("shape constuctor");

    }

    public Shape(int height, int width) {

        this.height = height;
        this.width = width;
        System.out.println("shape constuctor 2");
        System.out.println(height + width);
    }

    public void setheight(int height) {
        this.height = height;
    }

    public void setwidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int area(int height, int width) {
        return height * width;
    }
}