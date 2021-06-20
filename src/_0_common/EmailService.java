package _0_common;

public class EmailService implements NotificationService {
    @Override
    public void sendNotification(User user, String msg) {
        System.out.printf("Email for %s\n%s\nRegards,\nABC inc.", user.getName(), msg);
    }
}
