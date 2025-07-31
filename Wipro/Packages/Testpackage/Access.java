package Wipro.Packages.Testpackage;
import Wipro.Packages.Testpackage.Foundation;
public class Access {
    public static void main(String[] args) {
        Foundation fd=new Foundation();
        // fd.var1 // error we cant access private variables
        System.out.println(fd.var2);
        System.out.println(fd.var3);
        System.out.println(fd.var4);
    }
}
