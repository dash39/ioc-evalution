package _2_factory_method;

import _0_common.EmailService;
import _0_common.NotificationService;

public class ServiceFactory {
    public static NotificationService createNotificationService() {
        return new EmailService();
    }
}
