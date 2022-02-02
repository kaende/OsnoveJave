package Petlje.domaci_08_12;
import java.util.Scanner;

public class Suma_intervala {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //[Suma intervala] Korisnik unosi cele brojeve m i n sa konzole, m <= n. Ispisati sumu brojeva [m, n].
        System.out.print("Unesi broj: ");
        int m = s.nextInt();
        System.out.print("Unesi broj: ");
        int n = s.nextInt();
        int suma = 0;

        if(m <= n){
            for(int i = m; i <= n; i++){
                suma = suma + i;
            } System.out.println(suma);
        }
    }
}


