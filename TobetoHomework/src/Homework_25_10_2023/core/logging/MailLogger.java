package Homework_25_10_2023.core.logging;

public class MailLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Mail gönderildi : "+ data);
    }
}
