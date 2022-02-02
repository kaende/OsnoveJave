package Funkcije;

public class Pastebin_41 {
    public static void main(String[] args) {
        double [] niz = {1.5, 2.8, 4.7, 5,9, 7.81};
        System.out.println(prosek(niz));
    }
    public static double prosek(double[]x){
        double suma = 0;
        for(int i = 0; i < x.length; i++){
            suma = suma + x[i];
        }
        return suma/x.length;
    }
}
