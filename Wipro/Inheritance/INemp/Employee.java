package Wipro.Inheritance.INemp;

public class Employee extends Person{
    private double annual_Salary;
    private int year;
    private String NiN;

    Employee(double annual_Salary,int year,String NiN){
     this.annual_Salary=annual_Salary;
     this.year=year;
     this.NiN=NiN;
    }
    public double Annualsalary(){
        return annual_Salary;
    }
    public int  year(){
        return year;
    }
    public String NiN(){
        return NiN;
    }
    
}
