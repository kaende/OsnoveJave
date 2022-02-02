package Funkcije;

import java.util.Scanner;

public class Pastebin_31 {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Unesi i pomnozi tri broja: ");
        int rezultat = proizvod(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println(rezultat);
    }
    public static int proizvod(int a, int b, int c){
        return a*b*c;
    }
}
