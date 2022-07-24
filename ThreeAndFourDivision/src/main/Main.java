package main;

public class Main {

    private static double method(int a) {

        int cem = 0;

        int count = 0;
        for (int i = 0; i<=a; i++) {

            if (i % 3 == 0 && i % 4 == 0) {
                cem += i;
                count++;
            }

        }
        return cem / (double) count;
    }

    public static void main(String[] args) {

        
        System.out.println(method(100));
    }

}
