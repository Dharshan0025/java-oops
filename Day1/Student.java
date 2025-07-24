package Day1;

public class Student {
    String name;
    int rollno;
    int[] marks=new int[3];

    public Student(String name,int rollno,int sub1,int sub2,int sub3){
        this.name=name;
        this.rollno=rollno;
        marks[0]=sub1;
        marks[1]=sub2;
        marks[2]=sub3;
    }

    void displayReportCard(){
        System.out.println(name+" report card ("+ rollno+")");
        System.out.println("Tamil mark "+marks[0]);
        System.out.println("English mark "+marks[1]);
        System.out.println("Maths mark "+marks[2]);
        System.out.println();
    }
    public static void main(String[] args) {
        Student s1=new Student("dharsha", 8, 97, 98, 95);
        Student s2=new Student("jeeva", 20, 98, 97, 92);
        Student s3=new Student("ram", 40, 99, 98, 93);
        s1.displayReportCard();
        s2.displayReportCard();
        s3.displayReportCard();
    }
}
