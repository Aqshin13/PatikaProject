package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Yili Giriniz: ");
        
        int yil=scan.nextInt();
        
        if (yil%4==0) {
            System.out.println(yil+ " Artik Yildir");
        }else{
            System.out.println(yil+ " Artik yil degildir");
        }
    }

}
