package Petlje.domaci_08_12;

import java.util.Scanner;

public class Pastebin5 {
//    5. Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa -14 do i zakljucno sa 2n.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesi broj: ");
        int n = s.nextInt();

        for(int i = -14; i <= n*2; i++){
            if(n > 0){
                System.out.println(i);
            }
        }


    }
}
