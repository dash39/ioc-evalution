package _1_no_ioc;

import _0_common.Device;
import _0_common.User;

// called from some other classes
public class LoginListener {
    private final NotificationService notificationService = new EmailService();

    public void onLoginFromNewLocation(User user, Device device) {
        System.out.printf("ABC software detected that %s logged in from unknown location %s",
                user.getName(), device.getLocation());

        notificationService.sendNotification(user, String.format("New login from new location %s detected.", device.getLocation()));
    }
}
