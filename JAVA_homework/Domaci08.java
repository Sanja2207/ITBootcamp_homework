import java.util.Arrays;
import java.util.Scanner;

public class Domaci08 {
    public static void main(String[] args) {

        /** Zadatak
         Korisnik unosi recenicu. Potrebno je izbrojati Koliko reci je bilo u recenici koju je korisnik uneo I ispisati
         taj broj u konzolu. Koristiti metode.*/

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite recenicu: ");
        String recenica = s.nextLine().toLowerCase();
        System.out.println(brojacReci(recenica));

        /** Zadatak
         Inicijalizujte neki string. Korisnik unosi jedno slovo.Prebrojati Koliko puta se slovo koje je korisnik uneo
         ponavlja u stringu. Koristiti metode.*/

        String rec = "prosperirati";
        System.out.println("Unesite neko slovo: ");
        Scanner scan = new Scanner(System.in);
        String slovo = scan.nextLine();

        int n = brSlova(rec, slovo);
        System.out.println("Slovo -" + slovo + "- se nalazi " + n + " puta u reci.");


        /**  Zadatak:
         Deklarisati I inicijalizovati matricu n x m
         Napisati metodu koja ce za primljenu matricu da napravi novu rotiranu za 90⁰. Odnosno vrsi se zamena
         redova I kolona kao sa slike. Metoda vraca tu novodobijenu matricu*/

        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        prikazM(matrix);
        System.out.println();
        prikazM(rotiranaM(matrix));

    }

    public static int brojacReci(String sentence) {
        int brojac = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                brojac++;
            }
        }
        return (brojac + 1);
    }


    public static int brSlova(String rec, String slovo) {

        int brojac = 0;
        for (int i = 0; i < rec.length(); i++) {
            if (slovo.equals(rec.substring(i, i + 1))) {
                brojac++;
            }
        }
        return brojac;
    }


    public static int[][] rotiranaM(int[][] matrix) {
        int[][] rotiranaM = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                rotiranaM[j][i] = matrix[i][j];
            }
        }
        return rotiranaM;
    }

    public static void prikazM(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}

