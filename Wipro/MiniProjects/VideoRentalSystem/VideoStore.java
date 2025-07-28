package Wipro.MiniProjects.VideoRentalSystem;
import java.util.*;

public class VideoStore {
    private Video[] store = new Video[10];
    private int count = 0;

    public void addVideo(String name) {
        if (count < store.length) {
            store[count++] = new Video(name);
            System.out.println("Video \"" + name + "\" added successfully.");
        } else {
            System.out.println("Store is full! Cannot add more videos.");
        }
    }

    public void doCheckout(String name) {
        Video video = findVideo(name);
        if (video != null && !video.getCheckout()) {
            video.doCheckout();
            System.out.println("Video \"" + name + "\" checked out successfully.");
        } else {
            System.out.println("Video not found or already checked out.");
        }
    }

    public void doReturn(String name) {
        Video video = findVideo(name);
        if (video != null && video.getCheckout()) {
            video.doReturn();
            System.out.println("Video \"" + name + "\" returned successfully.");
        } else {
            System.out.println("Video not found or not checked out.");
        }
    }

    public void receiveRating(String name, int rating) {
        Video video = findVideo(name);
        if (video != null) {
            video.receiveRating(rating);
            System.out.println("Rating " + rating + " has been mapped to \"" + name + "\" successfully.");
        } else {
            System.out.println("Video not found.");
        }
    }

    public void listInventory() {
        System.out.println("\nInventory:");
        System.out.println("Name\t\tChecked Out\tRating");
        for (int i = 0; i < count; i++) {
            System.out.println(store[i].getName() + "\t\t" + store[i].getCheckout() + "\t\t" + store[i].getRating());
        }
        System.out.println();
    }

    private Video findVideo(String name) {
        for (int i = 0; i < count; i++) {
            if (store[i].getName().equalsIgnoreCase(name)) {
                return store[i];
            }
        }
        return null;
    }
}
