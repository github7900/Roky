public class Student {
    private String name;
    public Student(){
        this.name= "Unknown";
    }
    public Student(String name){
        this.name= name;
    }

    public String getName() {
        return this.name;
    }
    public static void main(String[]args){
        Student[]students=
                { new Student("Roky"),
                new Student("Bony"),
                new Student(),
                new Student("Emon"),
                new Student()};
        for (Student student : students){
            System.out.println(student.getName());
        }
    }
}
