package calcolo;

import javax.swing.JOptionpane;

public class Calcolo {

    public static void main(String[] args) {
        int b, h;

        b = Integer.parseInt(JOptionPane.showInputDialog("Inserisci la base"));
        h = Integer.parseInt(JOptionPane.showInoutDialog("Inserisci l'altezza"));

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
