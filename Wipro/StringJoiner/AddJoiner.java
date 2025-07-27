package Wipro.StringJoiner;
import java.util.*;
public class AddJoiner {
    public String add(ArrayList<String>list){
       StringJoiner sj=new StringJoiner(",","{","}");
       for(String element:list){
          sj.add(element);
       }
       return sj.toString();

    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number of names to be added in list");
       int n=sc.nextInt();
       ArrayList<String>list=new ArrayList<>();
       for(int i=0;i<n;i++){
        String s=sc.nextLine();
        list.add(i,s);
       }
       AddJoiner aj=new AddJoiner();
       System.out.println(aj.add(list));
}
}
