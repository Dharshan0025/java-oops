package Wipro.Strings;

import java.util.Scanner;

public class Ncopies {

    public String copy(String str){
        String res="";
        for(int i=0;i<str.length();i++){
           res+=str.substring(0,2);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first string");
        String str=sc.nextLine();
        Ncopies nc=new Ncopies();
        System.out.println(nc.copy(str));
    }
}
