package zadanie1;

public abstract class Klasa {
    Bron bron;

    public Klasa(Bron bron){
        this.bron = bron;
    }
    public void setBron(Bron bron){
        this.bron = bron;
    }

    public void atakuj(){
        bron.atakuj();
    }
}
