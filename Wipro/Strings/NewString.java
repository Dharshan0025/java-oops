package Wipro.Strings;

import java.util.Scanner;

public class NewString {

        public String sub(String str){
            return str.substring(1,str.length()-1);
        }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first string");
        String str=sc.nextLine();
        NewString ns=new NewString();
        System.out.println(ns.sub(str));
    }
}
