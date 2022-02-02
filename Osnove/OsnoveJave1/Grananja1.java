import java.util.Scanner;
public class Grananja1 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Proveri da li je broj paran ili neparan");
        System.out.print("Upisi broj: ");
        int x = scanner.nextInt();

        if (x % 2 == 0) {
            System.out.println("Broj je paran!");
        } else
            System.out.println("Broj je neparan!");
    }
}