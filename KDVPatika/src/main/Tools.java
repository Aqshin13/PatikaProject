package main;

public class Tools {

    public static double KDV(double miktar, double faiz) {
        double x = (miktar * faiz) / 100;
        System.out.println("KDV Tutari: "+x);
        double result=x+miktar;
        return result;
    }
}
