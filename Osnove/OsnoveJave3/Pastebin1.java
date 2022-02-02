package Petlje.domaci_08_12;

import java.util.Scanner;

public class Pastebin1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesi neki broj: ");
        int n = s.nextInt();

        if(n % 2 == 0){
            System.out.println("Broj je paran");
        } else {
            System.out.println("Broj je neparan");
        }
    }
}
