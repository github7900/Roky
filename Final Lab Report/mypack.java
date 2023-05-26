package mypack;

class Point {
    private int x, y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Point point = new Point();
        point.setXY(10, 20);
        System.out.println("Coordinates: (" + point.getX() + ", " + point.getY() + ")");
    }

    private String getY() {
        return null;
    }

    private String getX() {
        return null;
    }
}
