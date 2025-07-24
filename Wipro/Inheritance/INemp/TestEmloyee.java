package Wipro.Inheritance.INemp;

public class TestEmloyee {
    public static void main(String[] args) {

        Employee emp=new Employee(10000.00,2025,"emp1_in");
        emp.setter("ramesh");
        System.out.println(emp.name()+" "+emp.Annualsalary()+" "+emp.year()+" "+emp.NiN());

        

    }
}
