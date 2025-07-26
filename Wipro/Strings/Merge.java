package Wipro.Strings;

import java.util.Scanner;

public class Merge {
    public String merge(String a,String b ){
        String res="";
        int i=0;
        int j=0;
        while(i<a.length() && j<b.length()){
           res+=a.charAt(i);
           res+=b.charAt(j);
           i++;
           j++;
        }
        if(i<a.length()){
            res+=a.substring(i,a.length());
        }
        if(j<b.length()){
            res+=b.substring(j,b.length());
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first string");
        String a=sc.nextLine();
        System.out.println("enter the second string");
        String b=sc.nextLine();
        Merge m=new Merge();
        System.out.println(m.merge(a,b));
    }
}
