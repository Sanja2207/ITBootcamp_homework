package domaci_09;

public class Prodavnica {

    private Kafa[] kafe;
    private String adresa;
    private static int brojProdavnica;
    private int brojKupljenihProizvoda;

    public Prodavnica(Kafa[] kafe, String adresa) {
        this.kafe = new Kafa[kafe.length];

        for (int iter = 0; iter < kafe.length; iter++) {
            this.kafe[iter] = new Kafa();
        }

        for (int iter = 0; iter < kafe.length; iter++) {
            this.kafe[iter].setCena(kafe[iter].getCena());
        }

        this.adresa = adresa;
        brojProdavnica++;
    }

    public Kafa[] getKafe() {
        return kafe;
    }

    public String getAdresa() {
        return adresa;
    }

    public static int getBrojProdavnica() {
        return brojProdavnica;
    }

    public int getBrojKupljenihProizvoda() {
        return brojKupljenihProizvoda;
    }

    public void setKafe(Kafa[] kafe) {
        this.kafe = kafe;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public static int setBrojProdavnica() {
        return brojProdavnica;
    }

    public void setBrojKupljenihProizvoda(int brojKupljenihProizvoda) {
        this.brojKupljenihProizvoda = brojKupljenihProizvoda;
    }

    public void kupiKafu(Kafa kafa, int kolicina) {
        double racun = kafa.getCena() * kolicina;
        brojKupljenihProizvoda += kolicina;
        System.out.println("Vas racun je: " + racun);
    }

    public void popust(int popust) {
        for (Kafa kafa : kafe) {
            kafa.obracunajPopust(popust);
        }
    }

    public static String najuspesnijaProdavnica(Prodavnica[] prodavnice) {
        int provera = 0;
        for (int i = 1; i < prodavnice.length; i++) {
            if (prodavnice[i - 1].getBrojKupljenihProizvoda() <= prodavnice[i].getBrojKupljenihProizvoda()) {
                provera = i;
            } else {
                provera = i - 1;
            }
        }
        return ("Najuspesnija je " + prodavnice[provera].getAdresa());
    }


}
