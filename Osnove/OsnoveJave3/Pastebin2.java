package Petlje.domaci_08_12;

import java.util.Scanner;

public class Pastebin2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesi broj: ");
        int n = s.nextInt();

        if(n > 0){
            System.out.println("Pozitivan");
        } else if(n < 0) {
            System.out.println("Negativan");
        } else {
            System.out.println("Neutralan");
        }

    }
}
