public class Box {
    void display(){
        int height=5, width=4, length=8;
        int area = height*width*length;
        System.out.println(area);

    }

    static int area(int height, int width,int length){
       int area = height*width*length;
        return area;
    }
    static int area(int length, int width){
        int area = width*length;
        return area;
    }

    public static void main(String[] args) {
        int height=5, width=4, length=8;

        int a1 = area(length , width);
        System.out.println(a1);

        int a2 = area(height, width, length);
        System.out.println(a2);

        Box box1 = new  Box();
        box1.display();

    }
}
