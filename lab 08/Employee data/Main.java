public class Main {
    public static void main(String[] args) {
        AddressInfo addressInfo= new AddressInfo("Sector 7", "Uttara", "Rajshahi", "6512");
        InsuranceInfo insuranceInfo =new InsuranceInfo("Life Insurance", 773);
        Employee employee =new Employee("Mr. Abdur Rahman",addressInfo, insuranceInfo );
        employee.display();
    }
}
