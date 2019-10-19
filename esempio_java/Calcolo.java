package calcolo;

import java.util.Scanner;

public class Calcolo {

    public static void main(String[] args) {
        int b, h;
        Scanner tastiera = new Scanner(System.in);

        System.out.print("Inserisci la base: ");
        b = tastiera.nextInt();

        System.out.print("Inserisci l'altezza: ");
        h = tastiera.nextInt();

        System.out.print("Area: " + calcolo(b, h, 'a'));
        System.out.print("Perimetro: " + calcolo(b, h, 'p'));

    }

    private static int calcolo(int b, int h, char c) {
        switch (c) {
            case 'p':
                return 2 * (h + b);
            case 'a':
                return b * h;
            default:
                return 0;
        }
    }

}
