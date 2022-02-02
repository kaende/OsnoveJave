package Petlje.domaci_08_12;

import java.util.Scanner;

public class Pastebin7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesi mesec i dan: ");
        String mesec = s.nextLine();
        int dan = s.nextInt();

        if(mesec.equals("januar") && dan < 21 || mesec.equals("decembar") && dan > 21){
            System.out.println("Jarac");
        } else if (mesec.equals("februar") && dan < 20 || mesec.equals("januar") && dan > 20){
            System.out.println("Vodolija");
        } else if (mesec.equals("mart") && dan < 21 || mesec.equals("februar") && dan > 21){
            System.out.println("Ribe");
        } else if (mesec.equals("april") && dan < 21 || mesec.equals("mart") && dan > 20){
            System.out.println("Ovan");
        } else if (mesec.equals("maj") && dan < 22 || mesec.equals("april") && dan > 20){
            System.out.println("Bik");
        } else if (mesec.equals("jun") && dan < 22 || mesec.equals("maj") && dan > 21){
            System.out.println("Blizanac");
        } else if (mesec.equals("jul") && dan < 23 || mesec.equals("jun") && dan > 21){
            System.out.println("Rak");
        } else if (mesec.equals("avgust") && dan < 23 || mesec.equals("jul") && dan > 22){
            System.out.println("Lav");
        } else if (mesec.equals("septembar") && dan < 23 || mesec.equals("avgust") && dan > 22){
            System.out.println("Devica");
        } else if (mesec.equals("oktobar") && dan < 24 || mesec.equals("septembar") && dan > 22){
            System.out.println("Vaga");
        } else if (mesec.equals("novembar") && dan < 22 || mesec.equals("oktobar") && dan > 23){
            System.out.println("Skorpija");
        } else if (mesec.equals("decembar") && dan < 22 || mesec.equals("novembar") && dan > 21){
            System.out.println("Strelac");
        }
 }
}
