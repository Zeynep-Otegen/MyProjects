package homeWORKS;
import java.util.Scanner;
public class Hesapmakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.println("Birinci sayıyı gir:");
        double sayi1=input.nextDouble();
        System.out.println("İşlem gir:");
        char islem=input.next().charAt(0);
        System.out.println("İkinci sayıyı gir:");
        double sayi2=input.nextDouble();

        double sonuc=0;
switch (islem) {
    case '+':sonuc=sayi1+sayi2;
    break;
    case '-':sonuc=sayi1-sayi2;
    break;
    case '*':sonuc=sayi1*sayi2;
    break;
    case '/':if(sayi2==0){
        System.out.println("Reel sayılarda cevap tanımsızdır!");
    }
    else{sonuc=sayi1/sayi2;}

    break;
    default:System.out.println("Geçersiz işlem!!");
        }


System.out.println("Sonuç="+sonuc);}}

