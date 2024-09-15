package UserService;


// UserFacade.java
//provides a simplified interface for the client to interact with these services. It encapsulates the complexity of the underlying services.

public class UserFacade {
    private UserService userService;
    private NotificationService notificationService;

    public UserFacade() {
        this.userService = new UserService();
        this.notificationService = new NotificationService();
    }

    public void registerUser(String username) {
        userService.createUser(username);
        notificationService.sendNotification(username, "Welcome to our service!");
    }

    public void removeUser(String username) {
        userService.deleteUser(username);
        notificationService.sendNotification(username, "Your account has been deleted.");
    }
}