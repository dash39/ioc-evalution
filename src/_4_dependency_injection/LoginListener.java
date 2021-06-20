package _4_dependency_injection;

import _0_common.Device;
import _0_common.NotificationService;
import _0_common.User;


// called from some other classes
public class LoginListener {
    private final NotificationService notificationService;

    public LoginListener(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void onLoginFromNewLocation(User user, Device device) {
        System.out.printf("ABC software detected that %s logged in from unknown location %s",
                user.getName(), device.getLocation());

        notificationService.sendNotification(user, String.format("New login from new location %s detected.", device.getLocation()));
    }
}
