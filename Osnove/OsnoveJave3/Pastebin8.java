package Petlje.domaci_08_12;

import java.util.Scanner;

public class Pastebin8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vase ime, prezime i godinu rodjenja: ");
        String ime = s.next();
        String prezime = s.next();
        int godinaRodjenja = s.nextInt();
        int trenutnoGodina = 2021 - godinaRodjenja;

        if(trenutnoGodina < 7){
            System.out.println(ime + " " + prezime + " tek treba da zapocne obrazovanje");
        } else if (trenutnoGodina > 18){
            System.out.println(ime + " " +  prezime + " je zavrsio skolu");
        }

        for(int i = trenutnoGodina; i < 18; i++){
                    int razred = i - 6;
                    if(i == trenutnoGodina && razred > 0){
                        System.out.println("Dobrodosao u " + razred + ". razred, " + ime + " " + prezime);
                    }
                }





        }
    }

