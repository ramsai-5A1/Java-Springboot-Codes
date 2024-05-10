package OOPSClasses.OOPSFour;

public class SMSNotificationService implements NotificationService {

    private String phoneNumber;
    private int flag;

    public SMSNotificationService(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println(message + " delivered");
        System.out.println("Sent SMS to " + phoneNumber);
    }

    @Override
    public void subscribeToTopic(String topic) {
        System.out.println("Subscribed " + phoneNumber + " to SMS notifications for topic: " + topic);
    }

}
