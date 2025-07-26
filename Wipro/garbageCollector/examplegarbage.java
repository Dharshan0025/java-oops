package Wipro.garbageCollector;

public class examplegarbage {
    public void display(){
        System.out.println("explict grabage collector operation");
    }
    protected void finalize(){
      System.out.println("finalize call");
    }
}
