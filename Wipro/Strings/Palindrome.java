package Wipro.Strings;
import java.util.*;
public class Palindrome {
    public boolean check(String str){
        int i=0;
        int j=str.length()-1;
        str=str.toLowerCase();
        while(i<j){
          if(str.charAt(i)<97 || str.charAt(i)>122){
            i++;
            continue;
          }
          if(str.charAt(j)<97 || str.charAt(j)>122){
            j--;
            continue;
          }
          if(str.charAt(i)!=str.charAt(j)){
            return false;
            
          }
          i++;
          j--;

        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Palindrome p=new Palindrome();
        System.out.println(p.check(str));
        

    }
}
