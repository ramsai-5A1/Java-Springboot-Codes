package SolidPrinciples.OpenClosedPrinciple.Example1.BetterCode;

import java.util.List;


public class NotificationSender {

    public void sendNotifications(List<Notification> notificationTypes) {
        for (Notification type: notificationTypes) {
            type.send();
        }
}
