import java.util.Scanner;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import java.util.Random;

public class Lab01_W65532 {
    public static void main(String[] args) {
        //System.out.println(getName());
        //System.out.println(getAge());

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj a = ");
        int a = in.nextInt();
        System.out.println("Podaj b = ");
        int b = in.nextInt();

       // obliczenia(a, b);
        //System.out.println(a+" jest parzyste: "+parzyste(a));
        //System.out.println( a+" jest podzielna przez 3 i 5 : "+podzielne(a));

       // System.out.println(a+" Potega 3: "+potega3(a));
       // System.out.println(a+" Pierw: "+pierw(a));

        Random rand = new Random();
        int x = rand.nextInt(b-a+1)+a;
        int y = rand.nextInt(b-a+1)+a;
        int z = rand.nextInt(b-a+1)+a;

        System.out.println(x+" "+y+" "+z);
        System.out.println(trojkat(x,y,z));


    }

    public static String getName() {
        return "Jan";
    }

    public static String getAge() {
        return "22";
    }

    public static void obliczenia(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
    }

    public static boolean parzyste(int a)
    {
        if (a%2==0)
        {
            return true;
        }
        else return false;
    }
    public static boolean podzielne(int a)
    {
        if (a%3==0&&a%5==0)
        {
            return true;
        }
        else return false;
    }
    public static double potega3(int a)
    {
        return pow( a,3);

    }
    public static double pierw(int a)
    {
        return sqrt(a);

    }
    public  static boolean trojkat(int a, int b, int c)
    {
        if(a*a+b*b==c*c || a*a+c*c==b*b || c*c+b*b==a*a)
        {
            return true;
        }
        else return false;
    }
}
