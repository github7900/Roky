public class Volvo extends Car1{
    double price;
    String productionYear;
    String registrationNumber;
    Engine eng;
    DashBord db;
    public Volvo(double price, String productionYear, String registrationNumber, Engine eng, DashBord db)
    {
        this.price=price;
        this.productionYear=productionYear;
        this.registrationNumber=registrationNumber;
        this.eng=eng;
        this.db=db;
    }
    public void changeFuel()
    {
        System.out.println("Changing Fuel");
    }
    public void checkBattery()
    {
        System.out.println("Checking battery");
    }
}
