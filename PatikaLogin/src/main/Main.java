package main;

import java.util.Scanner;
import util.ChangeData;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Kullanici ismini giriniz:");
            String userName = scan.next();
            System.out.println("Parolayi giriniz:");
            String password = scan.next();
            if (userName.equals(base.DataBase.user.getUserName())
                    && password.equals(base.DataBase.user.getPassword())) {
                System.out.println("Giris Basarili");
                return;
            } else {
                 while (true) {
            System.out.println("Bilgiler Yanlis.Parolayi Sifirlmak Icin X basiniz.Cikis icin Q");
            char option = scan.next().charAt(0);
            if (option == 'X') {
                System.out.println("Yeni parola giriniz");
                String newPassword = scan.next();
                if (base.DataBase.user.getPassword().equals(newPassword)) {
                    System.out.println("Hata");
                    continue;
                }
                ChangeData.changePassword(newPassword);
                System.out.println("Parola degisti " + base.DataBase.user.getUserName()
                        + " " + base.DataBase.user.getPassword());
                System.out.println("Yeniden giris yapiniz");
                break;
            } else if (option == 'Q') {
                System.exit(0);
            }
        }
            }
        }

    }

}
