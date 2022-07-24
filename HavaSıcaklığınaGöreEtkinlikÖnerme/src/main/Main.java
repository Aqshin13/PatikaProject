package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        
        System.out.println("Hava Sicakligi giriniz:");
        int a=scan.nextInt();
        
        
        
        if (a<=5) {
            System.out.println("Kayak Yap");
        }else if(a>5 && a<=15){
            System.out.println("Sinemaya Git");
        }else if(a>15 && a<=25){
            System.out.println("Pikniye Git");
        }else{
            System.out.println("Yuzmeye git");
        }
        
    }
    
}
