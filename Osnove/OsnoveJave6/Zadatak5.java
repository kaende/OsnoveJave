package Java_test_1;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] niz = {1, 2, 3, 3, 4, 5, 3, 5, 1, 2}; // proizvoljni niz
        System.out.println("Unesite koji broj zelite da proverite: ");
        int n = sc.nextInt();
        System.out.println("Broj " + n + " se pojavljuje " +  ponavljanje(niz, n) + ". puta u nasem nizu");
        //pozivanje metoda sa nizom i nekim brojem koji proveravamo
    }

    public static int ponavljanje(int[] niz, int n){ //unosimo niz i neki broj
        int brojac = 0;                              // brojac krece od nule
        for(int i = 0; i < niz.length; i++){
            if(niz[i] == n){                      //ukoliko su niz na i i neki broj jednaki brojac se povecava za jedan
                brojac++;                         //tako znamo koliko puta se ponavlja
            }
        } return brojac;          //ovde vracamo brojac
    }

}
