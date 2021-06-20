package _4_dependency_injection;

import _3_abstract_factory.ServiceFactoryFactory;

public class Runner {
    public static void main(String[] args) {
        // you can use your factories here
        var notificationService = ServiceFactoryFactory.createServiceFactory().createNotificationService();

        var loginListener = new LoginListener(notificationService);
        var storageCapacityListener = new StorageCapacityListener(notificationService);

//        var notifiactionService1 = new PigeOnService();
//        var loginListener = new LoginListener(notifiactionService1);
    }
}
