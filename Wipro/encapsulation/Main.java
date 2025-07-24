package Wipro.encapsulation;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        double price=sc.nextDouble();
        int qtyInStock=sc.nextInt();
        String aname=sc.nextLine();
        String email=sc.nextLine();
        char gender=sc.nextLine().charAt(0);

        Author author = new Author(aname,email,gender);

        Book b1=new Book(name,author,price,qtyInStock);

        String Bname=b1.nameGetter();
        Author Bauthor=b1.authorGetter();
        double Bprice=b1.priceGetter();
        int BqtyInStock=b1.qtyInStockGetter();
        String Aname=author.anameGet();
        String Aemail=author.emailGet();
        char Agender=author.genderGet();

        System.out.println("name of the book:"+Bname);
        System.out.println("author details:"+Aname+" "+Aemail+" "+Agender);
        System.out.println("price of the book"+Bprice);
        System.out.println("quantity of the stock"+BqtyInStock);
    }
}
