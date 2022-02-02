package Java_test_1;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite neki broj");
        int n = sc.nextInt();
        int suma = 0;     //suma koju cu koristiti za ispis zbira
        int i = 0;        //integer koji ce se povecavati u svakoj iteraciji

        while(n != 0 && i < n){
            System.out.println("Molim vas unesite " + (i+1) + ". broj: ");
            int broj = sc.nextInt();                        //svaki sledeci broj
            suma = suma + broj;
            System.out.println(suma);
            if (broj == 0){                                //ukoliko je uneta nula ispisuje se poruka i program staje
                System.out.println("Uneli ste 0, kraj programa");
                break; //break oznacava izbacivanje iz petlje ukoliko je gore navedeni uslov ispunjen
            }
            i++;
        }
    }

}
