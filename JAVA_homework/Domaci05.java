import java.util.Scanner;

public class Domaci05 {
    public static void main(String[] args) {

        /*Ispisati u konzoli sumu svih parnih brojeva od 1 do n. Korisnik unosi n. 
(za ovaj zadatak nisu potrebninizovi samo petlje)*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Unesite neki broj:");
        int n = scan.nextInt();
        int zbir = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                zbir += i;
            }
        }
        System.out.println(zbir);


//----------------------------------------------------------------------------------

        /*Nacrtati pomocu petlji sledeci oblik : Primer za N = 5*/

        int broj = 5;
        String zvezde = "";
        for (int i = 0; i < broj; i++) {
            for (int j = 0; j < broj - i; j++) {
                System.out.print(" ");
            }
            zvezde = zvezde.concat("*");
            System.out.println(zvezde);
        }

//----------------------------------------------------------------------------------

        /*3. Deklarisati I inicijalizovati proizvoljan niz celih brojeva. Od tog niza napraviti novi koji ce imati obrnuti
        redosled elemenata. Primer : pocetni niz -> {1,4,6,5,3} , krajnji niz -> {3, 5, 6, 4,1}*/

        int[] niz = {1, 2, 3, 4, 5, 6};

        System.out.println("Pocetni niz:");
        for (int i = 0; i < niz.length; i++){
            System.out.print(niz[i]);}

        System.out.println();

        System.out.println("Kontra niz:");
        for (int i = niz.length - 1;i >= 0; i--){
            System.out.print(niz[i]);}

//----------------------------------------------------------------------------------

        /*4. Deklarisati I inicijalizovati niz celih brojeva. Korisnik unosi jedan ceo broj koji se cuva u promenljivoj x.
Proveriti da li se broj x nalazi u nizu , ako se nalazi ispisati poruku “Nadjen” ako ne “Ovaj broj ne postoji u nizu”
Primer: niz -> {2,5,4,3,3,6,5} , Korisnik uneo x -> 5 , rezultat -> “Nadjen”
** Dodatak : Koliko puta se broj x nalazi u nizu. U primeru bi rezultat bio 2 puta.*/

        int[] niz2 = new int[]{1, 2, 3, 4, 5, 6, 1};
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite jedan ceo broj: ");
        int broj2 = s.nextInt();
        int brojac = 0;
        for (int i = 0; i < niz2.length; i++) {
            if (niz2[i] == broj2) {
                brojac++;
            }
        }
        if (brojac == 0) {
            System.out.println("Nema ni jedan");
            return;
        }
        System.out.println("Broj se ponavlja " + brojac + " puta.");
    }
}