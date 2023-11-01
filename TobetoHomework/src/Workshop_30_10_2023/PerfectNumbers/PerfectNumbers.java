package Workshop_30_10_2023.PerfectNumbers;

public class PerfectNumbers {
    public static void main(String[] args) {
        long sayi, toplam;
        System.out.print("İlk 10 mükemmel sayı: ");
        int sayac = 0;
        for (sayi = 2; sayac < 10; sayi++) {
            toplam = 0;
            for (long i = 1; i <= sayi / 2; i++) {
                if (sayi % i == 0) {
                    toplam += i;
                }
            }
            if (toplam == sayi) {
                System.out.print(String.valueOf(sayi));
                sayac++;
                if (sayac < 10) {
                    System.out.print(", ");
                }
            }
        }
    }
}

