package OOPSClasses.OOPSFour;

public class EmailService implements NotificationService {

    private String email;

    public EmailService(String email) {
        this.email = email;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println(message + " delivered");
        System.out.println("Sent mail to " + email);
    }

    @Override
    public void subscribeToTopic(String topic) {
        System.out.println("Subscribed " + email + " to email notifications for topic: " + topic);
    }

}
