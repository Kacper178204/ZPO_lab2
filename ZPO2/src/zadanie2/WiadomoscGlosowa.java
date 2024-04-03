package zadanie2;

public class WiadomoscGlosowa implements SposobWysylki{
    @Override
    public void wyslij(Reklama reklama, Odbiorca odbiorca) {
        String przetlumaczonaTresc = Tlumacz.tlumacznie(reklama.getTresc(),odbiorca.getPreferowanyJezyk());

        System.out.println("Wiadomosc Glosowa " + przetlumaczonaTresc);
    }
}
