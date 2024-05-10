package SolidPrinciples.OpenClosedPrinciple.Example1;
import java.util.List;

public class NotificationSender {

    public void sendNotifications(List<NotificationType> notificationTypes) {
        for (NotificationType type: notificationTypes) {
            if (type == NotificationType.SMS) {
                NotificationType.sendSMSNotification();
            } else if (type == NotificationType.EMAIL) { 
                NotificationType.sendEmailNotification();
            } else if (type == NotificationType.WHATSAPP) {
                NotificationType.sendWhatsAppNotification();
            }
        }
    }
}
