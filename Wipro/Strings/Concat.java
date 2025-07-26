package Wipro.Strings;
import java.util.*;
public class Concat {
    public String concaString(String str1,String str2){

        if(str1.charAt(str1.length()-1)==str2.charAt(0)){
            return str1+str2.substring(1,str2.length());
        }
        return str1+str2;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first string");
        String str1=sc.nextLine();
        System.out.println("enter the second string");
        String str2=sc.nextLine();
        Concat con=new Concat();
        System.out.println("the new string is "+con.concaString(str1, str2));
    }
}
