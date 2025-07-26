package Wipro.Strings;

import java.util.Scanner;

public class LastN {
    public String rep(String str,int n){
       if(str.length()<n){
        return null;
       }
       String res="";
       for(int i=0;i<n;i++){
        res+=str.substring(str.length()-n,str.length());
       }
       return res;
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first string");
        String str=sc.nextLine();
        System.out.println("enter no of repetions");
        int n=sc.nextInt();
        LastN ln=new LastN();
        System.out.println(ln.rep(str,n));
    }
}
