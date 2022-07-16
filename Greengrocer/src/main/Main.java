package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL*/

        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5;

        Scanner scan = new Scanner(System.in);

        System.out.print("Kac kila armut:");

        double armutKilo = scan.nextDouble();

        System.out.print("Kac kila elma:");

        double elmaKilo = scan.nextDouble();

        System.out.print("Kac kila domates:");

        double domatesKilo = scan.nextDouble();

        System.out.print("Kac kila muz:");

        double muzKilo = scan.nextDouble();

        System.out.print("Kac kila patlican:");

        double patlicanKilo = scan.nextDouble();

        double total = armutKilo * armut + elmaKilo * elma + domatesKilo * domates + muzKilo * muz + patlicanKilo * patlican;

        
        
        System.out.println("Miktar: "+total);
    }

}
