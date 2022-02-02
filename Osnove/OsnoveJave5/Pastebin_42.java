package Funkcije;

public class Pastebin_42 {
    public static void main(String[] args) {
        String [] imena = {"Milos", "Stefan", "Marija", "Jovana", "Petar", "Laza", "Ivana"};
        System.out.println(proveri(imena, "Marija", "Petar"));
    }
    public static boolean proveri(String[] a, String b, String c){
        boolean daLiPostojiIme = true;

        for(int i = 0; i < a.length; i++){
            if(a[i].equals(b) || a[i].equals(c)){
                daLiPostojiIme = true;
                break;
            } else {
                daLiPostojiIme = false;
            }
        }
        return daLiPostojiIme;
    }
}
