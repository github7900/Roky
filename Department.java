public class Department {
    String depertment, faculty;
        int deptCode;

        public static void main(String[] args) {
            Department st1 = new Department();
            st1.depertment = "Computer Science";
            st1.faculty = "FSIT";
            st1.deptCode = 15;
            System.out.println("Department : "+st1.depertment);
            System.out.println("Faculty : "+st1.faculty);
            System.out.println("Code : "+st1.deptCode);


            Department st2 = new Department();
            st2.depertment = "Softwaer Engeneering";
            st2.faculty = "FSIT";
            st2.deptCode = 33;
            System.out.println("Department : "+st2.depertment);
            System.out.println("Faculty : "+st2.faculty);
            System.out.println("Code : "+st2.deptCode);
        }
    }

