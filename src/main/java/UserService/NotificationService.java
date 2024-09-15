package UserService;

public class NotificationService {
    public void sendNotification(String username, String message) {
        System.out.println("Notification sent to " + username + ": " + message);
    }
}