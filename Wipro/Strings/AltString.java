package Wipro.Strings;

import java.util.Scanner;

public class AltString {
    public String alternate(String a,String b){
            if(a.length()<0 || b.length()<0){
                return null;
            }
            if(a.length()>b.length()){
                return b+a+b;
            }
            return a+b+a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first string");
        String a=sc.nextLine();
        System.out.println("enter the second string");
        String b=sc.nextLine();
        AltString as=new AltString();
        System.out.println(as.alternate(a,b));
    }
}
