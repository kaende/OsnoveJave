import java.util.Scanner;

public class Sintaksa1 {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Duzina jednog zida: ");
        double zid1 = scan.nextDouble();

        System.out.print("Duzina drugog zida: ");
        double zid2 = scan.nextDouble();

        System.out.print("Visina zidova: ");
        double visina = scan.nextDouble();

        double plafon = zid1 * zid2;
//        System.out.println("Povrsina plafona je " + plafon);

        double okrecenaPovrsina = plafon + ((zid1*visina) * 2) + ((zid2*visina) * 2);

        System.out.println("Okrecena povrsina je " + okrecenaPovrsina + " m²");
    }
}
