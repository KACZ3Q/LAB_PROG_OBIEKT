public class Main {
    public static void main(String[] args)
    {
        //zadanie1();
        zadanie2();
    }
        public static void zadanie1()
        {
            Punkt pk1= new Punkt();
            Punkt pk2= new Punkt(3.0,1.5);
            Punkt pk3= new Punkt(4.0,-1.5);

            System.out.println("Pkt1: ");
            pk1.setX(3.4);
            pk1.setY(0.5);
            pk1.przesun(1,1);
            pk1.opis();

            System.out.println("Pkt2: ");
            pk2.przesun(1,1);
            pk2.opis();

            System.out.println("Pkt3: ");
            pk3.przesun(1,1);
            pk3.opis();

            Okrag kolo=new Okrag();
            kolo.setPromien(4);
            kolo.setSrodek(pk3);
            System.out.println(kolo.wSrodku(pk3));
            System.out.println(kolo.wSrodku(pk1));
            System.out.println(kolo.opis());

            Prostokat p1=new Prostokat(2,3,"zielony");
            p1.setPunkt(1,2);
            p1.przesun(3,5);

            Kwadrat k1=new Kwadrat(3,3);
            System.out.println(p1.opis());

            Trojkat t1=new Trojkat(1,3);
            t1.kolor="niebieski";
            System.out.println(t1.opis());

        }

  public static void zadanie2()
    {
        Samochod s1=new Samochod("opel","c","A","bialy",2014,1555);
        s1.informacje();
        SamochodOsobowy s2=new SamochodOsobowy("opel","astra","C","szary",2011,7000,2,1.9,5);
        s2.informacje();

    }



}
