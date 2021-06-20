package _1_no_ioc;

import _0_common.User;

// called from some other classes
public class StorageCapacityListener {
    private final NotificationService notificationService = new EmailService();

    public void onAlmostLackOfFreeSpace(User user) {
        System.out.printf("ABC software found that %s almost run out of free space.\n", user.getName());

        notificationService.sendNotification(user, "Lack of free space.");
    }

    public void onStorageCapacityExpanded(User user) {
        System.out.printf("ABC software expanded %s's storage capacity.", user.getName());

        notificationService.sendNotification(user, "Your storage capacity has been expanded, congrats :)");
    }
}
