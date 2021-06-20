package _3_abstract_factory;

import _0_common.EmailService;
import _0_common.NotificationService;

public class ModestUserServiceFactory implements ServiceFactory {
    @Override
    public NotificationService createNotificationService() {
        return new EmailService();
    }

    // createPaymentService()
    // createGreetingService()

    // some other factory methods here
}
