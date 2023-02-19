import java.time.Period;

public class Programming {
    private String language;
    public Programming(){
        this.language="programming language";
    }
    public Programming(String language){
        this.language=language;
    }
    public void printMessage(){
        System.out.println("I love"+ this.language);
    }
    public static void main(String[]args){
        Programming p1= new Programming();
        p1.printMessage();
        Programming p2= new Programming("Java");
        p2.printMessage();
    }
}
