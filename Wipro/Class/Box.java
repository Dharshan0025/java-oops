package Wipro.Class;
import java.util.Scanner;

public class Box {
    double width;
    double height;
    double depth;
    Box(double width,double height,double depth ){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    public double calculateVolume(){
        double volume=width*height*depth;
        return volume;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter width: ");
        double width=sc.nextDouble();
        System.out.println("enter height");
        double height=sc.nextDouble();
        System.out.println("enter depth");
        double depth=sc.nextDouble();
        Box b1=new Box(width,height,depth);
        System.out.println("the volume is :"+b1.calculateVolume());


    }
}
