public class Gatunek {
    String nazwaRodzaju, nazwaGatunku;
    int liczbaChr2n;
    int liczbaChrX;

    public Gatunek(String nazwaRodzaju, String nazwaGatunku, int liczbaChr2n, int liczbaChrX) {
        this.nazwaRodzaju = nazwaRodzaju;
        this.nazwaGatunku = nazwaGatunku;
        this.liczbaChromo2n = liczbaChromo2n;
        this.liczbaChromoX = liczbaChromoX;
    }

    public void pelnaNazwa(){
        System.out.println(nazwaRodzaju+" "+nazwaGatunku);
    }
    public void haploidalne(){
        System.out.println("Haploidalna liczba chromosomow: "+(liczbaChromo2n/2));
    }
    public void wypisz(){
        System.out.println("Rodzaj: "+nazwaRodzaju);
        System.out.println("Gatunek: "+nazwaGatunku);
        System.out.println("Liczba chromosomow: "+liczbaChr2n);
        System.out.println("Liczba chromosomow x: "+liczbaChrX);
    }
    public Gatunek kopiaGatunku(){
        Gatunek klon=new Gatunek(nazwaRodzaju,nazwaGatunku,liczbaChr2n,liczbaChrX);
        return klon;
    }
}
