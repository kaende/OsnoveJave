package Petlje.domaci_08_12;

import java.util.Scanner;

public class Naizmenicna_suma {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesi broj: ");
        int n = s.nextInt();
        int suma = 0;

        for(int i = 0; i <= n; i++){
            if(i % 2 != 0){
                suma = suma + i;
            } else if(i % 2 == 0){
                suma = suma -i;
            }
            System.out.println(suma);
        }
    }
}
