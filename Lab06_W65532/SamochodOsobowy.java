public class SamochodOsobowy extends Samochod{
    double waga;
    double poj;
    int iloscOs;

    public SamochodOsobowy(String marka, String model, String nadwozie, String kolor, int rok, double przebieg, double waga, double poj, int iloscOs) {
        super(marka, model, nadwozie, kolor, rok, przebieg);
        if (waga>=2&&waga<=3)
        this.waga = waga;
        if (poj>=0.8&&poj<=3.0)
        this.poj = poj;
        this.iloscOs = iloscOs;
    }

    public void setWaga(double waga) {
        if (waga>=2&&waga<=3)
        this.waga = waga;
        else System.out.println("Waga niepoprawna");
    }

    public void setPoj(double poj) {
        if (poj>=0.8&&poj<=3.0)
        this.poj = poj;
        else System.out.println("pojemnosc niepoprawna");
    }
    public void informacje() {
        System.out.println("Marka: " + marka +
                        "\n Model: " + model +
                        "\n Nadwozie: " + nadwozie +
                        "\n Kolor: " + kolor +
                        "\n Rok produkcji: " + rok +
                        "\n Przebieg: " + przebieg+
                        "\n Waga: " + waga +
                        "\n Pojemnosc: " + poj +
                        "\n Ilosc Osob: " + iloscOs);
    }
}
