package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz:");

        double boy = scan.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz:");
        
        double kilo = scan.nextDouble();
        
        double index=kilo/Math.pow(boy, 2);
        
        System.out.print("Vücut Kitle İndeksiniz:"+index);
    }

}
