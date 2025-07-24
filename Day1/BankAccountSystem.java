package Day1;
import java.lang.*;
public class BankAccountSystem {
    String accholder;
    int account_no;
    int phone_no;
    int aadhaar;
    String pan_no;
    String address;
    double deposit_amount;
    
    BankAccountSystem(){
        System.out.println("account created without any details");
    }
    BankAccountSystem(String accholder,int phone_no,int aadhaar,String pan_no,String address ,double deposit_amount ){
            this.accholder=accholder;
            this.account_no=createAccountNo();
            this.phone_no=phone_no;
            this.aadhaar=aadhaar;
            this.pan_no=pan_no;
            this.address=address;
            this.deposit_amount=deposit_amount;

            System.out.println("Account created Sucessfully "+accholder);
            deposit(deposit_amount);
    }
    public int createAccountNo(){
        int accno=(int) (Math.random()*1000000);
        return accno;
    }
    public void display(){
          System.out.println("Account holder name "+accholder);
          System.out.println("Account holder Accno "+account_no);
          System.out.println("Account holder phone "+phone_no);
          System.out.println("Account holder aadhaar "+aadhaar);
          System.out.println("Account holder pan "+pan_no);
          System.out.println("Account holder address "+address);

    }

    public void deposit(double amount){
        System.out.println("available balance "+amount);
    }
      public static void main(String[] args) {
       // BankAccountSystem ac1=new BankAccountSystem();
        BankAccountSystem ac2=new BankAccountSystem("dharsha",951410289,65436,"DBA1111","3/323 sri nagar kelambakkam",250000);
        ac2.display();

    }


}
