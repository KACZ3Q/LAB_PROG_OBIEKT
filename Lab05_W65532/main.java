public class Main {
    public static void main(String[] args) {
       // zadanie1();
        zadanie2();



    }
    public static void zadanie1(){
        Prostokat p=new Prostokat(2,3);
        System.out.println("Pole prosokata "+p.pole());
        System.out.println("Obwod prostokata "+p.obwod());
        System.out.println("Dlugosc przekatnej prostokata "+p.dlugoscprze());
    }
    public static void zadanie2(){
        Budynek b1=new Budynek("dom",2007,2);
        Budynek b2=new Budynek("blok",2000,6);
        b1.info();
        b2.info();
    }
    public static void zadanie3(){
        Gatunek g1=new Gatunek("a","b",26, 2);
        Gatunek g2=new Gatunek("a","c",56, 2);
        Gatunek g3=g1.kopiaGatunku();
        g1.pelnaNazwa();
        g1.haploidalne();
        System.out.println();
        g2.wypisz();
        System.out.println();
        g1.wypisz();
        g3.wypisz();
    }
}
