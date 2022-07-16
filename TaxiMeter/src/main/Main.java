package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int start = 10;

        double x = 2.2;

        Scanner scan = new Scanner(System.in);

        System.out.print("How many kilometers: ");

        int km = scan.nextInt();

        double result = 2.2 * km;

        result += start;
        
        if(result<20){
            result=20;
        }
        
        
        System.out.println("Total: "+result+" TL");

    }

}
