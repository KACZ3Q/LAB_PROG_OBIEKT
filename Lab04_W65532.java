import java.util.Random;
import java.util.Scanner;

public class Lab04_W65532
{
    public static void main(String[] args)
    {
      //Zadanie1();
      //Zadanie2();
      //Zadanie3();
      Zadanie4();
    }
    public static void Zadanie1()
    {
        double []array=new double[10];
        double suma=0,srednia;

        System.out.println("Elementy tablicy: ");
        for (int i = 0; i < array.length; i++)
        {
         array[i]=Losuj();
         suma+=array[i];
            System.out.println(array[i]+"\t");
        }
        System.out.println("Suma: "+suma+" srednia: "+suma/array.length);

        System.out.println("\n wersja foreach");
        //foreach

        suma=0;
        for (double data:array)
        {
            System.out.println(array+"\t");
            suma+=data;
        }
        System.out.println("Suma: "+suma+" srednia: "+suma/array.length);
    }
    public static double Losuj()
    {
        Random rand =new Random();
        double Liczba = rand.nextDouble(26)-10;
        return Liczba;
    }
    public static void Zadanie2()
    {
        int []tab1={1,2,3,4,5,6};
        int []tab2={12,34,21,43,64,17};
        System.out.println("Tablica pierwsza:");
        for (int i = 0; i < tab1.length; i++)
        {
            System.out.println(tab1[i]+"\t");
        }
        System.out.println("Tablica druga:");
        for (int i = 0; i < tab2.length; i++)
        {
            System.out.println(tab2[i]+"\t");
        }
    }
    public static void Zadanie3()
    {
        String []tab={"aA","Cc","Ala","aLa"};
        for (String i :tab)
        {
            System.out.println(i.toUpperCase()+"\t");
        }
    }
    public static void Zadanie4()
    {
        String[]tab=new String[5];
        Scanner in=new Scanner(System.in);
        for (int i = 0; i < tab.length; i++)
        {
         tab[i]=in.nextLine();
        }
        for (int i = tab.length-1; i >=0; i--)
        {

        }

    }
}