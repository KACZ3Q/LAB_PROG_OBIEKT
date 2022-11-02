import java.util.Random;
import java.util.Scanner;

public class Lab04_W65532
{
    public static void main(String[] args)
    {
        //Zadanie1();
        //Zadanie2();
        //Zadanie3();
        //Zadanie4();
        //zadanie5();
        //zadanie6();
        zadanie7();
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
            String reverse = new StringBuffer(tab[i]).reverse().toString();
            System.out.println(reverse);
        }

    }
    public static void zadanie5()
    {
        int []tab= new int[8];
        Scanner in = new Scanner(System.in);
        for(int i=0;i< tab.length;i++)
        {
            tab[i] = in.nextInt();
        }
        int x;
        for(int i = 0; i < tab.length - 1; i++)
        {
            for(int j = 0; j < tab.length - 1; j++)
            {
                if(tab[j] > tab[j + 1])
                {
                    x=tab[j];
                    tab[j]=tab[j+1];
                    tab[j+1]=x;
                }
            }
        }
        for (int i: tab)
        {
            System.out.print(i+"\t");
        }
    }
    public static void zadanie6()
    {
        double []tab= new double[5];
        Scanner in = new Scanner(System.in);
        for(int i=0;i< tab.length;i++)
        {
            tab[i] = in.nextDouble();
        }
        for (double i:tab)
        {
            if(i>=0)System.out.println(silnia(i));
            else System.out.println("Brak silni");
        }
    }
    public static double silnia(double x)
    {
        if(x==0)return 1;
        else return silnia(x-1)*x;
    }
    public static void zadanie7()
    {
        String []tab1={"aBc","Qwerty","b","xZ"};
        String []tab2={"aBc","Qwerty","b","xZ"};
        boolean rowne=true;
        for(int i =0; i< tab1.length; i++)
        {
            if(tab1[i]!=tab2[i])
            {
                rowne=false;
                break;
            }
        }
        if(rowne==true)System.out.println("Wyrazy Sa rowne");
        else System.out.println("Nie sa rowne");
    }
}
