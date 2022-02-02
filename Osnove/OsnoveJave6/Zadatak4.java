package Java_test_1;

import java.util.Scanner;

public class Zadatak4<evro> {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Molim vas unesite iznos u dinarima: ");
        int dinar = sc.nextInt();
        System.out.println("Unesite valutu");
        String valuta = sc.next();
        System.out.println(dinar + ".0 dinara, kad se prebaci u " + valuta + " iznosi " + menjacnica(dinar, valuta) + " " + valuta);
                                                                                    //ovde se stampa return iz metoda i kombinuje se sa ostatkom stringa

    }

    public static double menjacnica(double iznos, String valuta){ //deklarise se metod sa dva mesta, za int i string
        String x = "";
        double evro = iznos / 117.5;    //ovde doublovima dodeljujemo formulu koju ce obraditi
        double franak = iznos / 112.8;
        double dolar = iznos / 103.6;
        if(valuta.equals("evro")){
            return evro;
        } else if(valuta.equals("franak")){ //ukoliko je neki od uslova zadovoljen pokrenuce se odgovarajuci if
            return franak;
        } else if(valuta.equals("dolar")){
            return dolar;
        } else if (valuta != "dolar" && valuta != "franak" && valuta != "evro"){ //slucaj da se string ne poklapa
            System.out.println("Niste uneli dobru valutu");
        }
        return Double.parseDouble(x); // ovo sam napisao jer nisam znao sta drugo za return a intelij mi je traio
    }


}
