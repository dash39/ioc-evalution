package _2_factory_method;

import _0_common.User;

public class EmailService implements NotificationService {
    @Override
    public void sendNotification(User user, String msg) {
        System.out.printf("Email for %s\n%s\nRegards,\nABC inc.", user.getName(), msg);
    }
}
