import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Lab03_W65532 {
    public static void main(String[] args) {

        //Zadanie1();
        //Zadanie2();
        //Zadanie3();
        //Zadanie4();

        String a="ala",b="aleks",c="KAJAK";
        System.out.println("Palindrom: "+a+" = "+Zadanie5(a));
        System.out.println("Palindrom: "+b+" = "+Zadanie5(b));
        System.out.println("Palindrom: "+c+" = "+Zadanie5(c));

    }// koniec main
    public static double Input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj n: ");
        double n = input.nextDouble();
        return n;
    }
    public static void Zadanie1(){
        double ileS=Input(),pkt,suma=0;
        int a=0,b=40,ile=0;

        if (ileS>0){
            while(ileS>0){
                System.out.println("Podaj lp. pkt 0 - 40");
                pkt=Input();
                if (pkt>=a&&pkt<=b){
                    suma+=pkt;
                    ile++;
                    ileS--;
                }
            }//koniec while
            System.out.println("Suma pkt= "+suma);
            System.out.println("Srednia= "+suma/ile);
        }//koniec if
        else System.out.println("Grupa musi miec conajmniej 1 studenta");
    }
    public static void Zadanie2(){
    double sumaD=0,sumaU=0,ileD=0,ileU=0,liczba;
        for (int i = 0; i < 10 ; i++) {
            liczba=Input();
            if (liczba>=0){
                sumaD+=liczba;
                ileD++;
            }
            else {
                sumaU+=liczba;
                ileU++;
            }
        }
        System.out.println("Suma liczb dod: "+sumaD+" ilosc liczb "+ileD);
        System.out.println("Suma liczb ujem: "+sumaU+" ilosc liczb "+ileU);

    }
    public static void Zadanie3(){
        double n=Input();
        double liczba,suma=0;
        if (n>0)
        {
            while (n>0){
                liczba=Input();
                if (liczba%2==0)suma+=liczba;
                n--;
            }
            System.out.println("Suma liczba parzystych "+suma);
        }
        else
        {
            System.out.println("Ciag musi miec conajmniej jedna liczbe ");
        }
    }
    public static void Zadanie4(){
        double n=Input();
        int liczba,suma=0;
        Random rand=new Random();
        if (n>0)
        {
            while (n>0){
                liczba=rand.nextInt(56)-10;
                if (liczba%2==0)suma+=liczba;
                n--;
            }
            System.out.println("Suma liczba parzystych "+suma);
        }
        else
        {
            System.out.println("Ciag musi miec conajmniej jedna liczbe ");
        }
    }
    public static boolean Zadanie5(String text){
        int end=text.length()-1;
        text.toLowerCase(Locale.ROOT);
        for (int i = 0; i < text.length()/2 ; i++) {
            if (text.charAt(i)!=text.charAt(end)) return false;
            end--;
        }
        return true;
    }


}