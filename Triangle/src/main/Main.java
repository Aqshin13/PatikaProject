package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Katet1: ");

        int katet1 = scan.nextInt();

        System.out.print("Katet2: ");

        int katet2 = scan.nextInt();

        
        double hypotenuse =Math.sqrt(Math.pow(katet1, 2)+Math.pow(katet2, 2));
        
        
        System.out.println("Hypotenus: "+hypotenuse);
        
    }

}
