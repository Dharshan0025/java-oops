package Day2;
import java.util.*;
public class Calculator {

    public void add(int a,int b){
        int sum=a+b;
        System.out.println("the sum is "+sum);

    }
    public void sub(int a,int b){
        int diff=a-b;
        System.out.println("the difference is "+diff);

    }
    public void  multiply(int a,int b){
        int mul=a*b;
        System.out.println("the product is "+mul);
    }
    public void division(int a,int b){
        float div=(float)(a/b);
        System.out.println("the quiotent is "+ div);
        
    }
    public void squareRoot(double a){
        double sqr=Math.sqrt(a);
        System.out.println("the square root 1" + sqr);
        
    }

    public static void main(String[] args) {
        Calculator cal=new Calculator();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter input 1");
        int a=in.nextInt();
        System.out.println("Enter input 2");
        int b=in.nextInt();
        System.out.println("Enter the operation");
        String str=in.next();
        switch(str){
            case "addition": 
              cal.add(a, b);
              break;
            case "subtraction":
              cal.sub(a, b);
              break;
            case "multiplication":
              cal.multiply(a, b);
              break;
            case "division":
              cal.division(a, b);
              break;
            case "root":
              cal.squareRoot(a);
              break;
        }

    }
}
