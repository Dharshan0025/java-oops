package Wipro.Strings;

import java.util.Scanner;

public class FirstLastX {

    public String remove(String str){
        if(str.charAt(0)=='x' && str.charAt(str.length()-1)=='x'){
            return str.substring(1,str.length()-1);
        }
       return str;
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first string");
        String str=sc.nextLine();
        FirstLastX flx=new FirstLastX();
        System.out.println(flx.remove(str));
    }
}
