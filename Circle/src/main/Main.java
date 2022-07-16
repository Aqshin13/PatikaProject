package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Radius:");

        double radius=scan.nextDouble();
        
        System.out.print("Alfa: ");
        
        double a=scan.nextDouble();
        
        
        
        double area=(Math.PI*Math.pow(radius, 2)*a)/360;
        
        
        System.out.println("Area: "+area);
    }

}
