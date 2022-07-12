package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double ortalama = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Matematik Puan:");

        double matematik = scan.nextDouble();
        System.out.print("Fizik Puan:");
        double fizik = scan.nextDouble();

        System.out.print("Kimya Puan:");
        double kimya = scan.nextDouble();

        System.out.print("Türkçe Puan:");
        double turkce = scan.nextDouble();

        System.out.print("Müzik Puan:");
        double muzik = scan.nextDouble();

        System.out.print("Tarih Puan:");
        double tarih = scan.nextDouble();

        ortalama = ((matematik + fizik + kimya + turkce + tarih + muzik) / 6);
        
        String message=ortalama>60?"Sinifi gecti":"sinifta kaldi";
        
        System.out.println("Message: "+message+" Ortalama:"+ortalama);
        
        

    }

}
