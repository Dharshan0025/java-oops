package Wipro.encapsulation;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    Book(String name,Author author,double price,int qtyInStock){
        this.name=name;
        this.author=author;
        this.price=price;
        this.qtyInStock=qtyInStock;
    }
    String nameGetter(){
        return name;
    }
    Author authorGetter(){
       return author;
    }
    double priceGetter(){
        return price;
    }
    int qtyInStockGetter(){
        return qtyInStock;
    }
    

}
