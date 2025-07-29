package Wipro.Collections.Lists.EmployeeCollection;
import java.util.*;
public class EmployeeDB {
    ArrayList<Employee> list=new ArrayList<>();
    public boolean addEmployee(Employee e){
        list.add(e);
        return true;
    }
    public boolean deleteEmployee(int empid){
        ListIterator<Employee> it = list.listIterator();
        while(it.hasNext()){
           if(it.next().empid==empid){
               it.remove();
               return true;
           } 
        }
        return false;
        
    }
    public String paySlip(int empid){
        ListIterator<Employee> it = list.listIterator();
        while(it.hasNext()){
           if(it.next().empid==empid){
               return "Pay slip for employee ID "+empid+" is "+it.next().salary;
           } 
        }
        return "no employee found ";
    }
    public static void main(String[] args) {
        Employee e1=new Employee(1,"dharshan","d@gmail.com","male",250000.00f);
        Employee e2=new Employee(2,"jeeva","j@gmail.com","male",250000.00f);
        Employee e3=new Employee(3,"vishnu","v@gmail.com","male",250000.00f);
        Employee e4=new Employee(4,"john","jh@gmail.com","male",250000.00f);
        EmployeeDB db=new EmployeeDB();
        db.addEmployee(e1);db.addEmployee(e2);db.addEmployee(e3);db.addEmployee(e4);
        System.out.println(db.deleteEmployee(1));
        System.out.println(db.paySlip(2));
    }
}

