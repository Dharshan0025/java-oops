package Wipro.Packages.Automobile.Twowheeler;

public class Test {
    public static void main(String[] args) {
        Hero hr=new Hero("hero12","abc123","dharshan",150);
        Honda hd=new Honda("honda12","abc123","dharshan",200);
        System.out.println(hr.getModelName());
        System.out.println(hr.getOwnerName());
        System.out.println(hr.getRegistrationNumber());
        System.out.println(hr.getSpeed());
        hr.radio();
        System.out.println(hd.getModelName());
        System.out.println(hd.getOwnerName());
        System.out.println(hd.getRegistrationNumber());
        System.out.println(hd.getSpeed());
        hd.cdPlayer();

        
        

    }
}
