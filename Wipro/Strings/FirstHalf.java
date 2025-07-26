package Wipro.Strings;

import java.util.Scanner;


public class FirstHalf {

    public String half(String str){
       if(str.length()%2==0){
         return str.substring(0,str.length()/2);
       }
       return null;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first string");
        String str=sc.nextLine();
        FirstHalf fh=new FirstHalf();
        System.out.println(fh.half(str));
    }
}
