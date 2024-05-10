package OOPSClasses.OOPSFour;

public class NotificationExample {

    public static void main(String[] args) {
        NotificationService emailService = new EmailService("arjun@gmail.com");
        NotificationService smsNotificationService = new SMSNotificationService("9123456788");

        emailService.sendNotification("Hello, this is a email notification");
        smsNotificationService.sendNotification("Hello, this is a sms notification");
        
        emailService.subscribeToTopic("News");
        smsNotificationService.subscribeToTopic("Alerts");


    }

}
