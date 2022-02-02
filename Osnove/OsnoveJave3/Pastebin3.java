package Petlje.domaci_08_12;

import java.util.Scanner;

public class Pastebin3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesi broj: ");
        int n = s.nextInt();

        for(int i = 0; i <= n; i++){
            if(n > 0){
                System.out.println(i);
            }
        }

    }
}
