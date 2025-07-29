package Wipro.Collections.Lists.EmployeeCollection;

public class Employee {
    int empid;
    String empName;
    String email;
    String gender;
    float salary;
    Employee(int empid,String empName,String email,String gender,float salary){
       this.empid=empid;
       this.empName=empName;
       this.email=email;
       this.gender=gender;
       this.salary=salary;
    }
    void getEmployeeDetails(){
        System.out.println("employee id "+empid);
        System.out.println("employee name "+empName);
        System.out.println("employee email "+email);
        System.out.println("employee gender"+gender);
        System.out.println("employee Salary "+salary);
    }
}
