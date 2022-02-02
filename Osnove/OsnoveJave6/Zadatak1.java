package Java_test_1;

public class Zadatak1 {
    public static void main(String[] args) {
        int [] niz = {1, 2, 44, 4, 91, 6, 11, 8, 9, 10};
        int max = niz[0]; //uzimam max kao pocetni index niza da bih ga kasnije poredio
        for(int i = 0; i < niz.length; i++){
            if(max < niz[i]){ //ukoliko je max manji od niza na i tj svih ostalih brojeva u nizu
                max = niz[i]; // u tom slucaju taj i ce postati max
            }
        }
        System.out.println("Najveci broj u nizu je: " + max);
    }
}
