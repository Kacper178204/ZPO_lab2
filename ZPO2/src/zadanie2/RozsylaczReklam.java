package zadanie2;

public class RozsylaczReklam {
    public void wyslijReklame(Reklama reklama,Odbiorca odbiorca) {
        SposobWysylki sposobWysylki = wybierzRodzajWysylki(reklama.getCena());
        sposobWysylki.wyslij(reklama, odbiorca);
    }
        private SposobWysylki wybierzRodzajWysylki(double cena){
        if(cena > 100){
            return new WiadomoscGlosowa();
        } else if (cena > 50) {
            return new SMS();
        } else{
            return new Email();
        }
        }

}
