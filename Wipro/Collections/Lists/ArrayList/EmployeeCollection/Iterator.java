package Wipro.Collections.Lists.ArrayList.EmployeeCollection;

import java.util.*;
public class Iterator {
    public void printAll(ArrayList<String>list){
        ListIterator<String> it = list.listIterator();
        while(it.hasNext()){
          System.out.println(it.next());
        }
    }
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("java");
        list.add("python");
        list.add("c#");
        list.add("ruby");
        Iterator pr=new Iterator();
        pr.printAll(list);
    }
}
