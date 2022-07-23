package util;

import java.util.Scanner;

public class ChangeData {

    private static Scanner scan = new Scanner(System.in);

    public static void changePassword(String password) {
        base.DataBase.user.setPassword(password);
    }

}
