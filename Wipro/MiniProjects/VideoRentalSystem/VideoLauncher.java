package Wipro.MiniProjects.VideoRentalSystem;
import java.util.*;


public class VideoLauncher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VideoStore store = new VideoStore();

        while (true) {
            System.out.println("\nMAIN MENU\n===============");
            System.out.println("1. Add Video");
            System.out.println("2. Check Out Video");
            System.out.println("3. Return Video");
            System.out.println("4. Receive Rating");
            System.out.println("5. List Inventory");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1..6): ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter video name to add: ");
                    String addName = sc.nextLine();
                    store.addVideo(addName);
                    break;
                case 2:
                    System.out.print("Enter video name to check out: ");
                    String checkName = sc.nextLine();
                    store.doCheckout(checkName);
                    break;
                case 3:
                    System.out.print("Enter video name to return: ");
                    String returnName = sc.nextLine();
                    store.doReturn(returnName);
                    break;
                case 4:
                    System.out.print("Enter video name to rate: ");
                    String rateName = sc.nextLine();
                    System.out.print("Enter rating (1–5): ");
                    int rating = sc.nextInt();
                    sc.nextLine(); 
                    store.receiveRating(rateName, rating);
                    break;
                case 5:
                    store.listInventory();
                    break;
                case 6:
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
