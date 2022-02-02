package Petlje;

import java.util.Scanner;
public class FizzBuzz{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite neki broj: ");
        int n = s.nextInt();

        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 !=0){
                System.out.println(i + ": " + "Fizz");
            } else if (i % 5 == 0 && i % 3 !=0){
                System.out.println(i + ": " + "Buzz");
            } else if(i % 3 == 0 && i % 5 == 0){
                System.out.println(i + ": ");
                System.out.println("Fizzbuzz");
            } else {
                System.out.println(i + ": ");
            }

        }
    }
}
