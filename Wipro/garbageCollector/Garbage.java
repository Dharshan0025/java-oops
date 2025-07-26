package Wipro.garbageCollector;

public class Garbage {
    public static void main(String[] args) {
        examplegarbage g=new examplegarbage();
        g.display();
        g=null;
        System.gc();
    }

}
