package Day3;
import java.util.*;
public class Library {
    static ArrayList<String>bookname=new ArrayList<>();
    static ArrayList<String> authorname=new ArrayList<>();
    static ArrayList<Long> id=new ArrayList<>();

    static void add(){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the book name");
        String book=in.next();
        bookname.add(book);
        System.out.println("enter the author name");
        String author=in.next();
        authorname.add(author);
        System.out.println("enter the ISBN");
        long isbn=in.nextLong();
        id.add(isbn);

        
    }

    public void search(String name){
        int index=name.indexOf(name);
        if(index==-1){
            System.out.println("no book found");
        }
        System.out.println("bookname "+bookname.get(index));
        System.out.println("author "+authorname.get(index));
        System.out.println("id "+id.get(index));
    }
    public void search(String author,String genre){
        int index=author.indexOf(author);
        if(index==-1){
            System.out.println("no book found");
        }
        System.out.println("bookname "+bookname.get(index));
        System.out.println("author "+authorname.get(index));
        System.out.println("id "+id.get(index));
    }
    public void search(long ISBN){
        int index=id.indexOf(ISBN);
        if(index==-1){
            System.out.println("no book found");
        }
        System.out.println("bookname "+bookname.get(index));
        System.out.println("author "+authorname.get(index));
        System.out.println("id "+id.get(index));
    }
    public static void main(String[] args) {
        Library.add();
        Library user=new Library();
        user.search("harrypotter");
        user.search("jkrowling","fantasy");
        user.search(1223);
        System.out.println(bookname);
        System.out.println(authorname);
        System.out.println(id);

    }

}
