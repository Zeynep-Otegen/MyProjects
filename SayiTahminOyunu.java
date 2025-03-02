package same_example;
import java.util.Scanner;
public class SayiTahminOyunu {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int sayi = 1 + (int) (Math.random() * 100);
        System.out.println("1 ve 100 arasında bir sayı tutan makine hangi sayıyı tutmuştur?");
        int tahmin = keyboard.nextInt();
        int denemesayisi = 1;

        while (tahmin > sayi) {
            System.out.println("Tutulan sayı daha küçük bir sayıdır,tekrar dene:");
            tahmin = keyboard.nextInt();
            denemesayisi = denemesayisi + 1;
        }
        while (tahmin < sayi) {
            System.out.println("Tutulan sayı daha büyük bir sayıdır,tekrar dene:");
            tahmin = keyboard.nextInt();
            denemesayisi = denemesayisi + 1;
        }
        if (tahmin == sayi) {
            System.out.println("Cevabınız doğru!! " + denemesayisi + ". denemede sonuca ulaşıldı:)");
            
        }

    }
}









