package Workshop_27_10_2023_Car_Models.core.logging;

public class MailLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("Mail gönderildi "+ data);
    }
}
