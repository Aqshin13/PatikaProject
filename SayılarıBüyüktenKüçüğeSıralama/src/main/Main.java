package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("3 sayi giriniz:");

        System.out.println("Birinci sayi: ");
        int a = scan.nextInt();

        System.out.println("Ikinci sayi: ");
        int b = scan.nextInt();

        System.out.println("Ucuncu sayi: ");
        int c = scan.nextInt();

        if (a > b && b > c) {
            System.out.println("A>B>C");
        }
        if (a>c && c>b) {
            System.out.println("A>C>B");
        }
        if (b > a && a > c) {
            System.out.println("B>A>C");
        }
        if (b>c && c>a) {
            System.out.println("B>C>A");
        }
        if (c > a && a > b) {
            System.out.println("C>A>B");
        }
        if (c > b && b > a) {
            System.out.println("C>B>A");
        }
        if (a==b && b==c) {
            System.out.println("A=B=C");
        }

    }

}
