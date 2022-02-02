package Petlje;

import java.util.Scanner;

public class Faktorijel {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesi neki broj: ");
        int n = s.nextInt();
        int f = 1;

        for (int i = n; i > 0; i--) {
            //prva iteracija ce biti jednaka broju n, u svakoj sledecoj i opada za 1
                f = f * i;
            // na primeru broja 5:
            // f(1) --- f(1) * i(5), f(5) --- 5 * i(4), f(20) --- 20 * i(3)
            // f(60) --- 60 * i(2) f postaje 120, posle se mnozi sa 1 i rezultat se ne menja
            }
        System.out.println(f);
        }
    }


