package _2_factory_method;

import _0_common.User;

import static _2_factory_method.ServiceFactory.createNotificationService;

// called from some other classes
public class StorageCapacityListener {
    private final NotificationService notificationService = createNotificationService();

    public void onAlmostLackOfFreeSpace(User user) {
        System.out.printf("ABC software found that %s almost run out of free space.\n", user.getName());

        notificationService.sendNotification(user, "Lack of free space.");
    }

    public void onStorageCapacityExpanded(User user) {
        System.out.printf("ABC software expanded %s's storage capacity.", user.getName());

        notificationService.sendNotification(user, "Your storage capacity has been expanded, congrats :)");
    }
}
