package _2_factory_method;

public class ServiceFactory {
    public static NotificationService createNotificationService() {
        return new EmailService();
    }
}
