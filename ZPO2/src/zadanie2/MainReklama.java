package zadanie2;

public class MainReklama {
    public static void main(String[] args) {
        Reklama reklama = new Reklama();
        Odbiorca odbiorca = new Odbiorca();

        RozsylaczReklam rozsylaczReklam = new RozsylaczReklam();
        rozsylaczReklam.wyslijReklame(reklama, odbiorca);


    }
}
