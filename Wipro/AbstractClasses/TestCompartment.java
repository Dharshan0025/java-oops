package Wipro.AbstractClasses;

import java.util.Random;

public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] comp=new Compartment[10];
        Random rand=new Random();
        for (int i = 0; i < comp.length; i++) {
           int type = rand.nextInt(4) + 1; // Generates 1 to 4
           switch (type) {
           case 1:
            comp[i] = new FirstClass();
            break;
           case 2:
            comp[i] = new Ladies();
            break;
           case 3:
            comp[i] = new General();
            break;
           case 4:
            comp[i] = new Luggage();
            break;
           }
        }   
        for (int i = 0; i < comp.length; i++) {
            System.out.println("Compartment " + (i + 1) + ": " + comp[i].notice());
        }  
    }
}
