package Wipro.encapsulation;

public class Author {
    private String aname;
    private String email;
    private char gender;

    Author(String aname,String email,char gender){
        this.aname=aname;
        this.email=email;
        this.gender=gender;
    }
    String anameGet(){
        return aname;
    }
    String emailGet(){
        return email;
    }
    char genderGet(){
        return gender;
    }
    
}
