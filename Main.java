public class Main {
    int x=5;
    void sum()
    {
        x=x+5;
        System.out.println(x);
    }
    public static void main(String[] args) {
       /* Main myobj= new Main();
        System.out.println("Hello world!");
        System.out.println(myobj.x);
        myobj.sum();
        myobj.display();
        */

        Student obj=new Student();
        obj.name="ABC";
        obj.age=28;
        obj.cgpa=3.5F;
        obj.display();

    }
}