package Wipro.Packages.Automobile.Twowheeler;
import Wipro.Packages.Automobile.Vehicle;
public class Honda extends Vehicle {
    String modelNo;
    String regNo;
    String ownerName;
    int speed;
    Honda(String modelNo,String regNo,String ownerName,int speed){
       this.modelNo=modelNo;
       this.ownerName=ownerName;
       this.regNo=regNo;
       this.speed=speed;
    }
    public String getModelName(){
      return modelNo;
    }
    public String getRegistrationNumber(){
     return regNo;
    }
    public String getOwnerName(){
     return ownerName;
    }
    public int getSpeed(){
       return speed;
    }
    public void cdPlayer(){
        System.out.println("cd player available");
    }
}
