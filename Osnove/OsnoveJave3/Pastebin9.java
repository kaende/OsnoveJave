package Petlje.domaci_08_12;

import java.util.Scanner;
public class Pastebin9{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite neki broj: ");
        int n = s.nextInt();

        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 !=0 && i % 7 != 0){
                System.out.println(i + ": Fizz");
            } else if (i % 5 == 0 && i % 3 !=0 && i % 7 != 0){
                System.out.println(i + ": Buzz");
            } else if(i % 7 == 0 && i % 3 !=0 && i % 5 !=0){
                System.out.println(i + ": Zazz");
            } else if(i % 3 == 0 && i % 5 == 0 && i % 7 !=0){
                System.out.println(i + ": FizzBuzz");
            } else if(i % 3 == 0 && i % 7 == 0 && i % 5 !=0){
                System.out.println(i + ": FizzZazz");
            } else if(i % 5 == 0 && i % 7 == 0 && i % 3 !=0){
                System.out.println(i + ": BuzzZazz");
            } else {
                System.out.println(i + ": ");
            }

        }
    }
}
