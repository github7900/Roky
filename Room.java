public class Room {
    int roomno;
    String roomtype;
    float roomarea;
    boolean AcMachine;

    public Room() {
        System.out.println("Hello,an object of room class is created.");
    }
        public Room(int roomno,String roomtype,float roomarea,boolean AcMachine){

            this.roomno=roomno;
            this.roomtype=roomtype;
            this.roomarea=roomarea;
            this.AcMachine=AcMachine;
       }
       void displayData(){
        System.out.println(roomno +"\n"+roomtype+"\n"+roomarea+"\n"+AcMachine);
       }

    public static void main(String[] args) {
        Room obj1 = new Room();
        Room obj2 = new Room(113,"Hall",2717.4f,true);

        obj2.displayData();
    }
    }