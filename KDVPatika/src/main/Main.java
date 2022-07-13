package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double result = 0;
        System.out.print("Bir miktar dahil ediniz: ");
        double miktar = scan.nextDouble();
        if (miktar > 0 && miktar < 1000) {

            result = Tools.KDV(miktar, 18);
        } else if (miktar >= 1000) {
            result = Tools.KDV(miktar, 8);
        }
        System.out.println("KDVsiz fiyat: " + miktar);
        System.out.println("KDVli fiyat: " + result);
    }

}
