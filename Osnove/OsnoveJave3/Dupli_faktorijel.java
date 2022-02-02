package Petlje.domaci_08_12;

import java.util.Scanner;

public class Dupli_faktorijel {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesi neki broj: ");
        int n = s.nextInt();
        int f = 1;
        for (int i = n; i > 0; i-=2) {
            f = f * i;
        }
        System.out.println(f);

    }
}

