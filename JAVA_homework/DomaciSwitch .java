
import java.util.Scanner;

/**
 * Od korisnika zahtevati da unese mesec.
 * U zavisnosti koji mesec u godini je unet ispisati Koliko taj mesec ima dana.
 * Racunati da godina nije prestupna (ne obazirati se na to)
 */


public class DomaciSwitch {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Unesite mesec:");

        String mesec = scan.next();
        mesec = mesec.toLowerCase().trim();

        switch (mesec) {
            case "januar":
            case "mart":
            case "maj":
            case "jul":
            case "avgust":
            case "oktobar":
            case "decembar":
                System.out.println(mesec + " ima 31 dan");
                break;
            case "april":
            case "jun":
            case "septembar":
            case "novembar":
                System.out.println(mesec + " ima 30 dana");
                break;
            case "februar":
                System.out.println(mesec + " ima 28 dana");
                break;
            default:
                System.out.println("Pogresan unos");


        }
    }
}
