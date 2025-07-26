package Wipro.Strings;
import java.util.*;
public class Replace {
    public String rep(String str){
      StringBuffer sb=new StringBuffer();
      sb.append(str);
      int index=sb.indexOf("*");
      sb.delete(index-1, index+2);
      return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first string");
        String str=sc.nextLine();
        Replace r=new Replace();
        System.out.println(r.rep(str));
    }
}

