package zadanie2;

public class SMS implements SposobWysylki{
    @Override
    public void wyslij(Reklama reklama, Odbiorca odbiorca) {
        String przetlumaczonaTresc = Tlumacz.tlumacznie(reklama.getTresc(),odbiorca.getPreferowanyJezyk());

        System.out.println("SMS " + przetlumaczonaTresc);
    }
}
