package Workshop_27_10_2023_Car_Models.core.logging;

public class DatabaseLogger implements Logger {

    @Override
    public void log(String data) {
        System.out.println("Veritabanına loglandı "+ data);
    }
}
