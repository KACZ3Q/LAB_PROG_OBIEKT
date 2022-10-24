import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

import static java.lang.Math.sqrt;

public class Lab02_W65532 {
    public static void main(String[] args)
    {
    //zadanie1();
    //zad2A();
    //zad2B();
    //zad2C();
    //zadanie3();
    //zadanie4();
    //zadanie5();
        zadanie6();

    }
    public static double in()
    {
        Scanner in = new Scanner(System.in);
        return in.nextDouble();
    }
    public static void zadanie1()
    {
        System.out.println("Podaj a: ");
        double a = in();

        System.out.println("Podaj b: ");
        double b = in();

        System.out.println("Podaj c: ");
        double c = in();

        System.out.println(a+"x^2 + "+b+"x + "+c+" = 0");

        double x1,x2;
        double d;

        if(a==0)
        {
            if(b==0)
            {
                if(c!=0)System.out.println("Brak rozwiazan");
                else System.out.println("Nieskonczena ilosc rozwiazan");
            }
            else
            {
                x1=-c/b;
                System.out.println("Jedno rozwiązanie: \n"+"x="+x1);
            }
        }
        else
        {
            d=b*b-4*a*c;
            if(d>0)
            {
                x1=(-b-sqrt(d))/(2*a);
                x2=(-b+sqrt(d))/(2*a);
                System.out.println("Dwa rozwiązania: ");
                System.out.println("x1="+x1);
                System.out.println("x2="+x2);
            }
            else if (d==0)
            {
                x1=(-b)/(2*a);
                System.out.println("Jedno rozwiązanie: \n"+"x="+x1);
            }
            else System.out.println("Brak rozwiazan");
        }



    }


    public static void zad2A()
    {
        System.out.println("Podaj liczbe:" );
        double x=in(),a;
        if(x>0) a=2*x;
        else if (x==0) a=0;
        else a=-3*x;
        System.out.println("a(x)="+a);
    }
    public static void zad2B()
    {
        System.out.println("Podaj liczbe:");
        double x=in(),b;
        if(x>=1) b=x*x;
        else b=x;
        System.out.println("b(x)="+b);
    }
    public static void zad2C()
    {
        System.out.println("Podaj liczbe:");
        double x=in(),c;
        if(x>2)c=2+x;
        else if (x==2) c=8;
        else c=x-4;
        System.out.println("c(x)="+c);
    }
    public static void zadanie3()
    {
        System.out.println("Podaj x: ");
        double x = in();
        System.out.println("Podaj y: ");
        double y = in();
        System.out.println("Podaj z: ");
        double z = in();
        if(x>=y&&x>=z)
        {
            if(y>z) System.out.println("x: "+x+"; y: "+y+"; z: "+z);
            else System.out.println("x: "+x+"; z: "+z+"; y: "+y);
        }
        else if (y>=x&&y>=z)
        {
            if(x>z) System.out.println("y: "+y+"; x: "+x+"; z: "+z);
            else System.out.println("y: "+y+"; z: "+z+"; x: "+x);
        }
        else
        {
            if(x>y) System.out.println("z: "+z+"; x: "+x+"; y: "+y);
            else System.out.println("z: "+z+"; y: "+y+"; x: "+x);
        }
    }

    public static void zadanie4()
    {

        Scanner in = new Scanner(System.in);
        System.out.print("Czy pada? (t/n)");
        String pada = in.next();
        boolean czyPada = pada == "t";

        System.out.print("Jest autobus? (t/n)");
        String autobus = in.next();
        boolean jestAutobus = autobus == "t";

        if(czyPada && jestAutobus) System.out.println("Weź parasol, dostaniesz sięna uczelnię");
        if(czyPada && !jestAutobus) System.out.println("Nie dostaniesz się na uczelnię");
        if(!czyPada && jestAutobus) System.out.println("Dostaniesz się na uczelnię, miłego dnia i pięknej pogody");

    }
    public static void zadanie5()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Jest zniżka? (t/n)");
        String znizka = in.next();
        boolean czyZnizka = znizka == "t";

        System.out.print("Jest Premia? (t/n)");
        String premia = in.next();
        boolean czyPremia = premia == "t";

        if (!czyZnizka || czyPremia) System.out.println("Możesz kupić samochód, zniżki na samochód nie ma");
        if (!czyZnizka && !czyPremia)
            System.out.println("Zakup samochodu trzeba odłożyć na później, zniżki na samochód nie ma");
        if (czyZnizka || czyPremia) System.out.println("Możesz kupić samochód");
    }

        public static void zadanie6()
        {
            int wybierz;

            System.out.println("Wybierz dzialanie: ");
            System.out.println("1 - Dodawanie");
            System.out.println("2 - Odejmowanie");
            System.out.println("3 - Mnozenie");
            System.out.println("4 - Dzielenie");
            System.out.println("5 - Reszta");
            Scanner input = new Scanner(System.in);
            wybierz = input.nextInt();
            System.out.println("a: ");
            double a = in();
            System.out.println("b: ");
            double b = in();
            switch (wybierz) {
                case 1:
                    System.out.println(a + "+" + b + "=" + (a + b));
                    break;
                case 2:
                    System.out.println(a + "-" + b + "=" + (a - b));
                    break;
                case 3:
                    System.out.println(a + "*" + b + "=" + (a * b));
                    break;
                case 4:
                    if (b != 0) System.out.println(a + "/" + b + "=" + (a / b));
                    else System.out.println("Nie dzieli sie przez 0");
                    break;
                case 5:
                    if (b != 0) System.out.println(a + "%" + b + "=" + (a % b));
                    else System.out.println("Nie dzieli sie przez 0");
                    break;
                default:
                    System.out.println("blad, prosze wprowadzic dane ponownie");
            }
        }
}