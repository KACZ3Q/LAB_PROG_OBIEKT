import java.util.InputMismatchException;
import java.util.Scanner;

class BlednaW extends Exception {
    public BlednaW(String message) {
        super(message);
    }
}
public class LAB08_W65532 {
    public static void main(String[] args) {
        zad1();
        zad2();
        zad3();
    }
    public static void zad1() {
        System.out.println("Podaj liczbe: ");
        Scanner input = new Scanner(System.in);
        double userInput = 0;
        while (true) {
            try {
                userInput = input.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Podaj poprawna liczbe! ");
                input.next();
            }
        }
        if (userInput < 0){
            throw new IllegalArgumentException(String.format("Pierwiastek kwadratowy z liczby"
                    +"%.4f nie istnieje",userInput));
        }
        System.out.println(String.format("Pierwiastek z %.4f = %.4f",userInput,Math.sqrt(userInput)));
    }

public static void zad2()
{
    try {
        System.out.println("-2!= "+silnia(-2));
        System.out.println("2!= "+silnia(2));
    }
    catch (BlednaW e){
        System.out.println("erro: "+e.getMessage());
    }
}

    public static int silnia(int n)  throws BlednaW{
        if (n<0){
            throw new BlednaW("Silnia z liczby ujemnej nie istnieje");
        }
        int wynik=1;
        for (int i = 2; i < n; i++) {
            wynik*=i;
        }
        return wynik;
    }
    public static void zad3(){

    }
}
