package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Birinci sayiyi giriniz: ");

        double birinciSayi = scan.nextDouble();

        System.out.print("Ikinci sayiyi giriniz: ");

        double ikinciSayi = scan.nextDouble();

        System.out.println("Islemi seciniz: + - * /");

        char c = scan.next().charAt(0);

        double result = 0;

        switch (c) {

            case '+':
                result = birinciSayi + ikinciSayi;
                break;
            case '-':
                result = birinciSayi - ikinciSayi;
                break;
            case '*':
                result = birinciSayi * ikinciSayi;
                break;
            case '/':
                result = birinciSayi / ikinciSayi;
                break;
            default:
                System.out.println("Boyle bir islem yok");

        }
        
        
        System.out.println("Result:"+result);

    }

}
