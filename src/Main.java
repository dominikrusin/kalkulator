import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int A;
        int B;
        double wynik;

        System.out.println("Podaj pierwszą liczbę");
        A = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        B = scanner.nextInt();
        System.out.println("podaj działanie: +, -, *, /");
        char działanie  = scanner.next().charAt(0);
        switch (działanie) {
            case ('+'):
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

        }
    }
}
