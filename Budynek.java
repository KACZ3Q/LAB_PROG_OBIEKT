import java.time.LocalDate;

public class Budynek {
    String nazwa;
    int rokBudowy;
    int liczbaPieter;

    public Budynek(String nazwa, int rokBudowy, int liczbaPieter) {
        this.nazwa = nazwa;
        this.rokBudowy = rokBudowy;
        this.liczbaPieter = liczbaPieter;
    }

    public int getLiczbaPieter() {
        return liczbaPieter;
    }

    public void setLiczbaPieter(int liczbaPieter) {
        this.liczbaPieter = liczbaPieter;
    }



    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getRokBudowy() {
        return rokBudowy;
    }

    public void setRokBudowy(int rokBudowy) {
        this.rokBudowy = rokBudowy;
    }
    public int wiek()
    {
        return LocalDate.now().getYear()-rokBudowy;
    }
    public void info() {
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Rok budowy: " + rokBudowy);
        System.out.println("Ile pieter: " + liczbaPieter);
        System.out.println("Wiek: " + wiek());

    }
}

