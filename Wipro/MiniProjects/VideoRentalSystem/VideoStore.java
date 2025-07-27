package Wipro.MiniProjects.VideoRentalSystem;

public class VideoStore extends Video{
    Video[] store;
    public VideoStore(){
      store=new Video[10];
    }
    public void addVideo(String name){
      Video v1=new Video(name);
      System.out.println("Video"+name+" added Sucessfully");
    }
    public void doCheckout(String name){
      System.out.println("video"+name+"checked out sucessfully");
    }
    public void doReturn(String name){

    }
    public void receiveRating(String name,int rating){
        Video v1=new Video(name);
        v1.receiveRating(rating);
        System.out.println("Rating"+rating+"has been mapped to"+name+"Sucessfully");
    }
    public void listInventory(){
       System.out.println("---------------------------------------");
       System.out.println("video name | checkout status | rating");
       Video v1=new Video();
       System.out.println(v1.getName() +" "+v1.getRating()+" "+v1.getcheckout());

    }
}
