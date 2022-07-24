package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dogum gununu yaziniz");
        System.out.print("Month: ");
        int month = scan.nextInt();
        System.out.print("Day: ");
        int day = scan.nextInt();
        if (month == 12 || month == 1) {//Oğlak Burcu : 22 Aralık - 21 Ocak
            if (day >= 22 && day <= 31 && month == 12) {
                System.out.println("Oglak Burcusunuz");
            } else if (day >= 1 && day <= 21 && month == 1) {
                System.out.println("Oglak Burcusunuz");

            }
        }if (month == 1 || month == 2) {//Kova Burcu : 22 Ocak - 19 Şubat
            if (day >= 22 && day <= 31 && month == 1) {
                System.out.println("Kova Burcusunuz");
            } else if (day >= 1 && day <= 19 && month == 2) {
                System.out.println("Kova Burcusunuz");

            }
        }  if (month == 2 || month == 3) {//Balık Burcu : 20 Şubat - 20 Mart
            if (day >= 20 && day <= 29 && month == 2) {
                System.out.println("Balık Burcusunuz");
            } else if (day >= 1 && day <= 20 && month == 3) {
                System.out.println("Balık Burcusunuz");

            }
        }  if (month == 3 || month == 4) {//Koç Burcu : 21 Mart - 20 Nisan
            if (day >= 21 && day <= 31 && month == 3) {
                System.out.println("Koç Burcusunuz");
            } else if (day >= 1 && day <= 20 && month == 4) {
                System.out.println("Koç Burcusunuz");

            }
        }  if (month == 4 || month == 5) {//Boğa Burcu : 21 Nisan - 21 Mayıs
            if (day >= 21 && day <= 30 && month == 4) {
                System.out.println("Boğa Burcusunuz");
            } else if (day >= 1 && day <= 21 && month == 5) {
                System.out.println("Boğa Burcusunuz");

            }
        }  if (month == 5 || month == 6) {//İkizler Burcu : 22 Mayıs - 22 Haziran

            if (day >= 22 && day <= 31 && month == 5) {
                System.out.println("İkizler Burcusunuz");
            } else if (day >= 1 && day <= 22 && month == 6) {
                System.out.println("İkizler Burcusunuz");

            }
        }  if (month == 6 || month == 7) {//Yengeç Burcu : 23 Haziran - 22 Temmuz

            if (day >= 23 && day <= 30 && month == 6) {
                System.out.println("Yengeç Burcusunuz");
            } else if (day >= 1 && day <= 22 && month == 7) {
                System.out.println("Yengeç Burcusunuz");

            }
        }  if (month == 7 || month == 8) {//Aslan Burcu : 23 Temmuz - 22 Ağustos

            if (day >= 23 && day <= 31 && month == 7) {
                System.out.println("Aslan Burcusunuz");
            } else if (day >= 1 && day <= 22 && month == 8) {
                System.out.println("Aslan Burcusunuz");

            }
        }  if (month == 8 || month == 9) {//Başak Burcu : 23 Ağustos - 22 Eylül

            if (day >= 23 && day <= 31 && month == 8) {
                System.out.println("Başak Burcusunuz");
            } else if (day >= 1 && day <= 22 && month == 9) {
                System.out.println("Başak Burcusunuz");

            }
        }  if (month == 9 || month == 10) {//Terazi Burcu : 23 Eylül - 22 Ekim

            if (day >= 23 && day <= 30 && month == 9) {
                System.out.println("Terazi Burcusunuz");
            } else if (day >= 1 && day <= 22 && month == 10) {
                System.out.println("Terazi Burcusunuz");

            }
        }  if (month == 10 || month == 11) {//Akrep Burcu : 23 Ekim - 21 Kasım

            if (day >= 23 && day <= 31 && month == 10) {
                System.out.println("Akrep Burcusunuz");
            } else if (day >= 1 && day <= 21 && month == 11) {
                System.out.println("Akrep Burcusunuz");

            }
        }  if (month == 11 || month == 12) {//Yay Burcu : 22 Kasım - 21 Aralık

            if (day >= 22 && day <= 30 && month == 11) {
                System.out.println("Yay Burcusunuz");
            } else if (day >= 1 && day <= 21 && month == 12) {
                System.out.println("Yay Burcusunuz");

            }
        }

    }

}
