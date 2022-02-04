import java.util.*;

public class GameXO {
    public static void main(String[] args) {

        String[] tabla = new String[9];
        int [] slobodnePozicije = {0,1,2,3,4,5,6,7,8};

        String[] izbori = izboriIgraca();
        String player1 = izbori[0];
        String player2 = izbori[1];

        while(slobodnePozicije.length != 0){
            stampajTablu(tabla);
            slobodnePozicije =  potezKorisnik(tabla,slobodnePozicije,player1);
            if(slobodnePozicije.length == 0) break;
            slobodnePozicije = potezKomp(tabla,slobodnePozicije,player2);
        }

        System.out.println("KRAJ IGRE: ");
        stampajTablu(tabla);

    }

    public static String[] izboriIgraca(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Izaberi X ili O : ");
        String player1 = sc.next();
        String player2 = "X";
        if(player1.equals("X")){
            player2 = "O";
        }
        return new String[]{player1,player2}; //moze i u dva reda String[] nizZaVracanje = {player1,player2};
    }
    public static void stampajTablu(String[] tabla){
        for (int i =0 ; i < tabla.length;i++){
            System.out.print(tabla[i]+ " ");
            if(i == 2 || i ==5) System.out.println();
        }
        System.out.println();
    }
    public static int[] potezKorisnik(String[] tabla,int[] slobodnePozicije,String player1){
        Scanner sc = new Scanner(System.in);
        System.out.println("Izaberite poziciju:");
        int poz1 = sc.nextInt();
        tabla[poz1] = player1;
        return updateSlobodnePozicije(tabla,slobodnePozicije.length-1);
    }
    public static int[] potezKomp(String[] tabla,int[] slobodnePozicije,String player2){
        int poz2 = (int)(Math.floor(Math.random()*slobodnePozicije.length));
        tabla[slobodnePozicije[poz2]] = player2;
        return updateSlobodnePozicije(tabla,slobodnePozicije.length-1);
    }
    public static int[] updateSlobodnePozicije(String[] tabla,int brSlobodnih){
        int [] slobodnePozicije = new int[brSlobodnih];
        for (int i =0 ,j=0; i < tabla.length;i++){
            if(tabla[i] == null){
                slobodnePozicije[j] = i;
                j++;
            }
        }
        return slobodnePozicije;
    }
}