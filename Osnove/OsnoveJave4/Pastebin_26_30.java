package Funkcije;

import java.util.Scanner;

public class Pastebin_26_30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesi broj duzine niza: ");
        int n;
        int[] niz = new int[n = sc.nextInt()];
        for(int i = 0; i < niz.length; i++){
            System.out.print("Unesi " + (i + 1) + ". broj u nizu: ");
            niz[i] = sc.nextInt();
        }
        dvadesetSest(niz);
        System.out.println();

        dvadesetSedmi(niz);
        System.out.println();

        dvadesetOsmi(niz);
        System.out.println();

        dvadesetDeveti(niz);
        System.out.println();

        trideseti(niz);
    }
    public static void dvadesetSest(int[] niz){
        for(int j = niz.length-1; j >= 0; j--) {
            System.out.print(niz[j]);
        }
    };
    public static void dvadesetSedmi(int[] niz){
        for (int j = 0; j < niz.length; j += 2) {
            System.out.print(niz[j]);
        }
    };
    public static void dvadesetOsmi(int[] niz){
        int suma = 0;
        for(int i = 0; i < niz.length; i++){
            suma = suma + niz[i];
        }
        System.out.print(suma);
    };
    public static void dvadesetDeveti(int[] niz){
        for(int j = niz.length -1; j >= 0; j-=3){
            System.out.print(niz[j]);
        }
    };
    public static void trideseti(int[] niz){
        int proizvod = 1;
        for(int j = 0; j < niz.length; j++){
            proizvod = proizvod * niz[j];
        }
        System.out.print(proizvod);
    };
}
