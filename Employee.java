import javax.lang.model.element.Name;

public class Employee {
    int empId;
    String empName;
    Employee(int id, String Name){
        this.empId=id;
        this.empName=Name;
    }
    void info(){
        System.out.println("Id:"+empId+"Name:"+empName);
    }
    public static void main(String[] args){
        Employee emp1=new Employee(4972, "ROKY");
        emp1.info();
    }
}
