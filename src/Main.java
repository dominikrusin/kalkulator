import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double A;
        double B;
        double wynik;

        System.out.println("Podaj pierwszą liczbę");
        A = scanner.nextDouble();
        System.out.println("podaj działanie: +, -, *, /");
        char działanie  = scanner.next().charAt(0);
        System.out.println("Podaj drugą liczbę");
        B = scanner.nextDouble();
        switch (działanie) {
            case ('+'):
 //               wynik = A + B;
                System.out.println(A + B);
                break;
            case ('-'):
                System.out.println(A - B);
                break;
            case ('*'):
                System.out.println(A*B);
                break;
            case ('/'):
            if (B==0) {
                System.out.println("Error. dzilenie przez ZERO!!!! AAAA koniec świata");
            }else {
                System.out.println(A/B);
            }
                break;
            default: System.out.println("Error! Błędny symbol działania");
  //          System.out.println(A + działanie + B + "=" + wynik);

        }
    }
}
