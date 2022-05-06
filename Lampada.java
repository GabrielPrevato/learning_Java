import java.util.Scanner;

public class Lampada {
    boolean estado;

    void ligar() {
        estado = true;
    }

    void desligar() {
        estado = false;
    }

    void observar() {
        if (estado) {
            System.out.println("LIGADA...");
        } else {
            System.out.println("DESLIGADA...");
        }
    }

    String observar2() {
        if (estado) {
            return ("Ligada...");
        } else {
            return ("Desligada...");
        }
    }
    /*
     * void escolha() {
     * int i;
     * System.out.println("Escolha 1 para ligar e 2 para desligar");
     * Scanner sc = new Scanner(System.in);
     * i = sc.nextInt();
     * if (i == 1) {
     * ligar();
     * } else {
     * desligar();
     * }
     * 
     * }
     */

    public static void main(String[] args) {
        Lampada lamparina1 = new Lampada();
        Lampada lamparina2 = new Lampada();
        // lamparina.ligar();
        // lamparina.desligar();
        lamparina1.ligar();
        lamparina2.desligar();

        System.out.println(lamparina1.observar2());
        System.out.println(lamparina2.observar2());

        // lamparina.escolha();

    }
}