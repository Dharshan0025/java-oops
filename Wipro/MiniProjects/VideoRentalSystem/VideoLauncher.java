package Wipro.MiniProjects.VideoRentalSystem;
import java.util.*;
public class VideoLauncher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Video v=new Video();
        VideoStore vid=new VideoStore();
        System.out.println("MAIN MENU \n ===============\n1.Add Videos:\n2.Check Out Video: \n3.Return Video: \n4.Receive Rating: \n5.List Inventory: \n6.Exit:\nEnter your choice(1..6)");
        int choice=sc.nextInt();
        switch(choice){
         case 1:
             System.out.println("Enter the name of the Video you want to add :");
             String aname=sc.nextLine();
             vid.addVideo(aname);
             break;
        case 2:
             System.out.println("Enter the name of the Video you want to checkout :");
             String cname=sc.nextLine();
             vid.doCheckout(cname);
             break;
        case 3:
             System.out.println("Enter the name of the Video you want to Return :");
             String rname=sc.nextLine();
             vid.doReturn(rname);
             break;
        case 4:
             System.out.println("Enter the name of the Video you want to Rate :");
             String raname=sc.nextLine();
             System.out.println("Enter the Rating :");
             int rate=sc.nextInt();
             vid.receiveRating(raname,rate);
             break;
        case 5:
             vid.listInventory();
             break;
        case 6:
             System.out.println("Exiting .....!! Thanks for using the application");
             break;
        default:
             System.out.println("Invalid choice! Please select 1–6.");
        }
    }
}
