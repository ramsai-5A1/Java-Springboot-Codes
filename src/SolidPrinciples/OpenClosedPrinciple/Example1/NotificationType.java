package SolidPrinciples.OpenClosedPrinciple.Example1;

public enum NotificationType {

    SMS,
    EMAIL,
    WHATSAPP;

    public static void sendSMSNotification() {
        System.out.println("Sending SMS notification");
    }

    public static void sendEmailNotification() {
        System.out.println("Sending Email notification");
    }

    public static void sendWhatsAppNotification() {
        System.out.println("Sending whatsapp notification");
    }
}

