import java.util.Objects;

public class Samochod {
    String marka, model, nadwozie, kolor;
    int rok;
    double przebieg;

    public Samochod(String marka, String model, String nadwozie, String kolor, int rok, double przebieg) {
        this.marka = marka;
        this.model = model;
        this.nadwozie = nadwozie;
        this.kolor = kolor;
        this.rok = rok;
        if (przebieg >= 0)
            this.przebieg = przebieg;
    }

    public void setPrzebieg(double przebieg) {
        if (przebieg >= 0)
            this.przebieg = przebieg;
        else System.out.println("Przebieg nie moze byc ujemny");
    }

    public void informacje() {
        System.out.println("Marka: " + marka +
                "\n Model: " + model +
                "\n Nadwozie: " + nadwozie +
                "\n Kolor: " + kolor +
                "\n Rok produkcji: " + rok +
                "\n Przebieg: " + przebieg);
    }
}
