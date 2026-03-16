package btth;

public class EmailNotificationService implements NotificationService {

    @Override
    public void send(String email, String message) {

        System.out.println("Da gui email toi: " + email);

    }

}