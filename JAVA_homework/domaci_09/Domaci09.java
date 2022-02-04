package domaci_09;

public class Domaci09 {
    public static void main(String[] args) {
        Kafa kafa1 = new Kafa("MACCHIATO", 200, new String[]{"instant kafa", "mleko", "voda"}, 150);
        Kafa kafa2 = new Kafa("LUNGO", 150, new String[]{"voda", "espreso", "secer"}, 100);
        Kafa kafa3 = new Kafa("AFFOGATO", 200, new String[]{"sladoled", "voda", "espreso"}, 200);

        Kafa[] kafe1 = {kafa1, kafa2, kafa3};
        Kafa[] kafe2 = {kafa1, kafa2};

        System.out.println(kafa1.obracunajPopust(10));

        Prodavnica prodavnica1 = new Prodavnica(kafe1, "Narodnog fronta 77");
        Prodavnica prodavnica2 = new Prodavnica(kafe2, "Narodnog gronta 75");

        System.out.println(Prodavnica.getBrojProdavnica());

        prodavnica1.kupiKafu(kafa1, 5);
        prodavnica2.kupiKafu(kafa2, 10);
        prodavnica2.kupiKafu(kafa3, 13);
        System.out.println(prodavnica1.getBrojKupljenihProizvoda());
        System.out.println(prodavnica2.getBrojKupljenihProizvoda());

        System.out.println(prodavnica1.getKafe()[0].getCena());
        System.out.println(prodavnica1.getKafe()[1].getCena());
        System.out.println(prodavnica1.getKafe()[2].getCena());
        System.out.println(prodavnica2.getKafe()[0].getCena());
        System.out.println(prodavnica2.getKafe()[1].getCena());

        System.out.println((Prodavnica.najuspesnijaProdavnica(new Prodavnica[]{prodavnica1, prodavnica2})));

        prodavnica2.popust(20);

        System.out.println(prodavnica1.getKafe()[0].getCena());
        System.out.println(prodavnica1.getKafe()[1].getCena());
        System.out.println(prodavnica1.getKafe()[2].getCena());
        System.out.println(prodavnica2.getKafe()[0].getCena());
        System.out.println(prodavnica2.getKafe()[1].getCena());


    }


}
