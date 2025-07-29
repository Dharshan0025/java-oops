package Wipro.Collections.Lists.ArrayList;
import java.util.*;
public class Months {

    public void listdisplay(){
        ArrayList<String>list=new ArrayList<>();
        list.add("1-jan");
        list.add("2-feb");
        list.add("3-mar");
        list.add("4-apr");
        list.add("5-may");
        list.add("6-jun");
        list.add("7-jul");
        list.add("8-aug");
        list.add("9-sep");
        list.add("10-oct");
        list.add("11-nov");
        list.add("12-dec");


        // using list iterator to print all the elements in the list

        ListIterator<String> it=list.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        };

    }
    public static void main(String[] args) {
        Months mon=new Months();
        mon.listdisplay();
    }
}
