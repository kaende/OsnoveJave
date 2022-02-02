import java.util.Scanner;




public class Grananja2 {
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


        if (zid1 <= 0 && zid2 > 0 && visina > 0) {
            System.out.println("Fali zid1");
        } else if (zid2 <= 0 && zid1 > 0 && visina > 0) {
            System.out.println("Fali zid2");
        } else if (visina <= 0 && zid1 > 0 && zid2 > 0) {
            System.out.println("Fali visina");
        } else if (zid1 <= 0 && zid2 <= 0 && visina > 0) {
            System.out.println("Fali zid1 i fali zid2");
        } else if (zid1 <= 0 && zid2 > 0 && visina <= 0) {
            System.out.println("Fali zid1 i visina");
        } else if (zid2 <= 0 && zid1 <= 0 && visina > 0) {
            System.out.println("Fale zid1 i zid2");
        } else if (zid2 <= 0 && zid1 > 0 && visina <= 0) {
            System.out.println("Fale zid2 i visina");
        } else if (visina <= 0 && zid1 <= 0 && zid2 > 0) {
            System.out.println("Fale visina i zid1");
        } else if (visina <= 0 && zid1 > 0 && zid2 <= 0) {
            System.out.println("Fale visina i zid2");
        } else if (visina <= 0 && zid1 <= 0 && zid2 <= 0) {
            System.out.println("Veceras spavam u parku");
        } else {
            double okrecenaPovrsina = plafon + ((zid1 * visina) * 2) + ((zid2 * visina) * 2);
            System.out.println("Okrecena povrsina je " + okrecenaPovrsina + " m²");
        }
    }
}
