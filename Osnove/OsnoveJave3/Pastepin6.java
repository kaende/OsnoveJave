package Petlje.domaci_08_12;

import java.util.Scanner;

public class Pastepin6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesi broj: ");
        int n = s.nextInt();
        int suma = 0;
        for(int i = 1; i <= n; i++){
            suma = n * i;
            System.out.println(suma);
        }

    }
}
