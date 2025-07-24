package Day3;

public class Exam {
    public static void main(String[] args) {
        Department cse=new Department();
        cse.examRules();
        cse.depRules();
    }
}
class University{
   final String university="Anand Institute";
    final void examRules(){
        System.out.println("clean shave \n no copying \n neat dress code");

    }
}
   
class Department extends University{
    void depRules(){
        System.out.println("study well");
    }
}
