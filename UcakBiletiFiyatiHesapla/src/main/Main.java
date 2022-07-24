package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int toplam = 0;
        int indirim = 0;
        int tipIndirim = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("HOS GELDINIZ\nBilet almak icin asagidaki bilgileri giriniz!");

        System.err.println("Hatirlatma\n"
                +"(Mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır."
                + "Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.\n"
                + "Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.\n"
                + "Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.\n"
                + "Kişi \"Yolculuk Tipini\" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.");

        System.out.print("KM(Mesafe başına ücret 0,10 TL / km): ");
        int km = scan.nextInt();

        if (km < 0) {
            System.out.println("Hatali veri Girdiniz!");
            return;
        } else {
            toplam += km * 0.1;
        }

        System.out.print("Yasinizi Giriniz: ");
        int yas = scan.nextInt();

        if (yas < 0) {
            System.out.println("Hatali Veri Girdiniz!");
            return;
        } else if (yas < 12) {
            indirim = (toplam * 50) / 100;
            System.out.println("Indirim: " + indirim + " TL olacaq");
        } else if (yas > 12 && yas < 24) {
            indirim = (toplam * 10) / 100;
            System.out.println("Indirim: " + indirim + " TL olacaq");
        } else if (yas > 65) {
            indirim = (toplam * 30) / 100;
            System.out.println("Indirim: " + indirim + " TL olacaq");
        } else {
            System.out.println("Indirim: " + indirim + " TL olacaq");
        }

        toplam -= indirim;

        System.out.println("Yas Indirimi ile fiyat: " + toplam);

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");

        int tip = scan.nextInt();

        if (tip == 1) {
            System.out.println("Tip indirimi: " + tipIndirim);
        } else if (tip == 2) {
            tipIndirim = toplam * 20 / 100;
            toplam -= tipIndirim;
            toplam *= 2;
        } else {
            System.out.println("Hatali Veri Girdiniz");
            return;
        }

        System.out.println("Toplam Fiyat: "+toplam+" Indirimler: "+(indirim+tipIndirim));
        
    }

}
