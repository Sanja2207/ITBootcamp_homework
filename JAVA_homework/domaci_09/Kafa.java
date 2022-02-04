package domaci_09;

public class Kafa {

    private String naziv;
    private int velicina;
    private String[] sastojci;
    private double cena;

    public Kafa(String naziv, int velicina, String[] sastojci, int cena) {
        this.naziv = naziv;
        this.velicina = velicina;
        this.sastojci = sastojci;
        this.cena = cena;
    }

    public Kafa() {

    }

    public String getNaziv() {
        return naziv;
    }

    public int getVelicina() {
        return velicina;
    }

    public String[] getSastojci() {
        return sastojci;
    }

    public double getCena() {
        return cena;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setVelicina(int velicina) {
        this.velicina = velicina;
    }

    public void setSastojci(String[] sastojci) {
        this.sastojci = sastojci;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public double obracunajPopust(double procenat) {
        double popust = this.cena * (procenat / 100);
        this.cena = cena - popust;
        return cena;
    }

}



