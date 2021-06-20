package _4_dependency_injection;

import _0_common.NotificationService;
import _0_common.User;


// called from some other classes
public class StorageCapacityListener {
    private final NotificationService notificationService;

    public StorageCapacityListener(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void onAlmostLackOfFreeSpace(User user) {
        System.out.printf("ABC software found that %s almost run out of free space.\n", user.getName());

        notificationService.sendNotification(user, "Lack of free space.");
    }

    public void onStorageCapacityExpanded(User user) {
        System.out.printf("ABC software expanded %s's storage capacity.", user.getName());

        notificationService.sendNotification(user, "Your storage capacity has been expanded, congrats :)");
    }
}
