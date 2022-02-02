import java.util.Scanner;

public class Grananja3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Proveri koloko dana ima u mesecu. ** Uneti brojcane vrednosti - primer za maj: 5");
        System.out.print("Godina: ");
        int godina = s.nextInt();
        System.out.print("Mesec: ");
        int mesec = s.nextInt();
        int februar = 28;

        if(godina % 4 == 0 && godina % 100 != 0|| godina % 400 == 0){
            februar = februar +1;
        }

        if(mesec > 12 || mesec <= 0){
            System.out.println("Godina mora da ima 12 meseci");
        } else if (godina < 1583){
            System.out.println("Godina mora biti veca od 1582 po Gregorijanskom kalendaru");
        }else if (mesec == 1){
            System.out.println("Januar ima 31 dan");
        } else if (mesec == 2){
            System.out.println("Februar ima " + februar + " dana");
        } else if (mesec == 3){
            System.out.println("Mart ima 31 dan");
        } else if (mesec == 4){
            System.out.println("April ima 30 dana");
        } else if (mesec == 5){
            System.out.println("Maj ima 31 dan");
        } else if (mesec == 6){
            System.out.println("Jun ima 30 dana");
        } else if (mesec == 7){
            System.out.println("Jul ima 31 dan");
        } else if (mesec == 8){
            System.out.println("Avgust ima 31 dan");
        } else if (mesec == 9){
            System.out.println("Septembar ima 30 dana");
        } else if (mesec == 10){
            System.out.println("Oktobar ima 31 dan");
        } else if (mesec == 11){
            System.out.println("Novembar ima 30 dana");
        } else if (mesec == 12){
            System.out.println("Decembar ima 31 dan");
        }
    }
}


