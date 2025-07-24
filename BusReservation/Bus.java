package BusReservation;

public class Bus {
    private int busid;
    private String busname;
    private int totalseats;
    private int bookedseats=0;
    private static int totalbuses=0;

    Bus(int busid,String busname,int totalseats){
      this.busid=busid;
      this.busname=busname;
      this.totalseats=totalseats;
      totalbuses++;
    }
    static void showTotalbuses(){
        System.out.println("total buses "+totalbuses);

    }
    public void showStatus(){
        System.out.println("busname "+busname);
        System.out.println("totalseats "+totalseats);
        System.out.println("booked seats "+bookedseats);
        System.out.println("available seats "+(totalseats-bookedseats));

    }
    public void bookSeat(){
     if(totalseats>bookedseats){
       System.out.println("your seat booked");
       bookedseats++;
     }
      else{
        System.out.println("available seats "+(totalseats-bookedseats));
    }
       
    }
    public void bookSeats(int ticket){
        if(Math.abs(totalseats-bookedseats)>ticket){
            System.out.println("your seats booked successfully");
            bookedseats+=ticket;
        }     

        else{
            System.out.println("only available seats "+(totalseats-bookedseats));
        }
    }
    public static void main(String[] args) {
        Bus bus1=new Bus(01,"v23", 60);
        Bus bus2=new Bus(02, "v40", 75);
        bus1.bookSeat();
        bus1.bookSeats(29);
        bus1.showStatus();
        Bus.showTotalbuses();
    }
}
