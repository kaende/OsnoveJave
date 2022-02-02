package Petlje.domaci_08_12;

import java.util.Scanner;

 public class Pastebin4 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.print("Unesi broj: ");
            int n = s.nextInt();

            for (int i = n; i <= 0; i++) {
                if (n < 0) {
                    System.out.println(i);
                }
            }
        }
    }

