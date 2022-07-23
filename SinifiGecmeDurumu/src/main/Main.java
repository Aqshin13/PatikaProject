package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Double> list = new ArrayList<>();
        double ortalama = 0;
        int dersSayisi = 0;
        double toplam = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Matematik Puan:");
        double matematik = scan.nextDouble();
        list.add(matematik);

        if (matematik >= 0 && matematik <= 100) {
            toplam += matematik;
            dersSayisi++;
        }

        System.out.print("Fizik Puan:");
        double fizik = scan.nextDouble();
        list.add(fizik);

        if (fizik >= 0 && fizik <= 100) {
            toplam += fizik;
            dersSayisi++;
        }

        System.out.print("Kimya Puan:");
        double kimya = scan.nextDouble();
        list.add(kimya);

        if (kimya >= 0 && kimya <= 100) {
            toplam += kimya;
            dersSayisi++;
        }
        System.out.print("Türkçe Puan:");
        double turkce = scan.nextDouble();
        list.add(turkce);

        if (turkce >= 0 && turkce <= 100) {
            toplam += turkce;
            dersSayisi++;
        }
        System.out.print("Müzik Puan:");
        double muzik = scan.nextDouble();
        list.add(muzik);

        if (muzik >= 0 && muzik <= 100) {
            toplam += muzik;
            dersSayisi++;
        }

        ortalama = toplam / dersSayisi;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 100 || list.get(i) < 0) {
                System.out.println("Yanlis bilgi dahil etdiniz.Yeniden bilgileri dahil edin"
                        + "100den kucuk 0 dan buyuk olmali");
                return;
            }
        }
        if (ortalama < 55) {
            System.out.println("Sinifta kaldiniz...");
        } else {
            System.out.println("Gectiniz");
        }
        System.out.println("Ortalama: " + ortalama);

    }

}
