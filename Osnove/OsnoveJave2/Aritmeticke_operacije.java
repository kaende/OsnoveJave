package Petlje;
import java.util.Scanner;
public class Aritmeticke_operacije {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesi prvi broj: ");
        int prviBr = s.nextInt();

        System.out.print("Unesi drugi broj: ");
        int drugiBr = s.nextInt();

        System.out.println(prviBr + drugiBr);
        System.out.println(prviBr - drugiBr);
        System.out.println(prviBr * drugiBr);
        System.out.println(prviBr / drugiBr);
        System.out.println(prviBr % drugiBr);
    }
}