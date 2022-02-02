package Java_test_1;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String motor = "motor";
        String automobil = "automobil";
        String kombi = "kombi";
        String kamion = "kamion";

        System.out.println("Unesite tip vozila: ");
        String tipVozila = sc.next();             //ovde se unosi string tip vozila
        System.out.println("Unesite predjenu kilometrazu: ");
        double predjeniKilometri = sc.nextDouble();  // ovde su unosi predjena km


        switch (tipVozila){ //switch ce obraditi string tip vozila i na osnovu toga pokrenuti odgovarajuci case
            case "Motor":
                System.out.println(tipVozila + " na " + predjeniKilometri + "km potrosi " + predjeniKilometri / 20 + " litara goriva");
                break; // u slucaju motora primenice formulu za gorivo i ispisati zadato
            case "Automobil":
                System.out.println(tipVozila + " na " + predjeniKilometri + "km potrosi " + predjeniKilometri/ 14.28 + " litara goriva");
                break;
            case "Kombi":
                System.out.println(tipVozila + " na " + predjeniKilometri + "km potrosi " + predjeniKilometri/ 9.09 + " litara goriva");
                break;
            case "Kamion":
                System.out.println(tipVozila + " na " + predjeniKilometri + "km potrosi " + predjeniKilometri/ 6.67 + " litara goriva");
                break;
            default:
                System.out.println("Uneli ste pogresan tip vozila");
        }        //ovo je poruka koja ce se ispisati u slucaju defaulta, tj pogresno unete vrednosti






    }
}
