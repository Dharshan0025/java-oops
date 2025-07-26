package Wipro.Polymorphism.overriding;

public class Shape {
    public void draws(){
        System.out.println("Drawing Shape");
    }
    public void erase(){
        System.out.println("Erasing shape");
    }
    public static void main(String[] args) {
        Circle c=new Circle();
        Square s=new Square();
        Triangle t=new Triangle();
        c.draws();
        c.erase();
        t.draws();
        t.erase();
        s.draws();
        s.erase();
    }
}
