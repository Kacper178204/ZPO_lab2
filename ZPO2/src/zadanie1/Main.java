package zadanie1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    static Random losowanie;


    public static void main(String[] args) {
        ArrayList<Klasa> Klasa = new ArrayList<Klasa>();
        ArrayList<Bron> bronie = new ArrayList<Bron>();

        Klasa.add(new Lucznik(new Luk()));
        Klasa.add(new Rycerz(new Miecz()));
        Klasa.add(new Strzelec(new WyrzutniaRakiet()));
        Klasa.add(new Kanonier(new Pistolet()));
        Klasa.add(new Rzezimieszek(new Sztylet()));

        bronie.add(new Karabin());
        bronie.add(new Kusza());
        bronie.add(new Luk());
        bronie.add(new Miecz());
        bronie.add(new Pistolet());
        bronie.add(new Sztylet());
        bronie.add(new WyrzutniaRakiet());

        for(Klasa klasa: Klasa){
            klasa.atakuj();
            System.out.println("Zmiana broni");
            Bron nowaBron = losowaBron(bronie);
            klasa.setBron(nowaBron);
            System.out.println("BRONIE PO ZMIANIE: ");
            klasa.atakuj();
            System.out.println("-.-.-.-.-.-.-");
        }
    }
    public static Bron losowaBron(ArrayList<Bron> bronie){
        losowanie = new Random();

        return bronie.get(losowanie.nextInt(bronie.size()));
    }
}
