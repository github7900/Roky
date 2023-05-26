class room {
    private int roomno;
    private String roomtype;
    private float roomarea;
    private boolean ACmachine;
    public void setdata(int roomno, String roomtype, float roomarea, boolean ACmachine) {
        this.roomno = roomno;
        this.roomtype = roomtype;
        this.roomarea = roomarea;
        this.ACmachine = ACmachine;
    }
    public void displaydata() {
        System.out.println("Room number: " +roomno);
        System.out.println("Room type: " +roomtype);
        System.out.println("Room area: " +roomarea);
        System.out.println("AC machine: " +ACmachine);
    }
    public static void main(String[]args){
        room room1 = new room();
        room1.setdata(113, "Bedroom", 400, true);
        room1.displaydata();
    }
}
