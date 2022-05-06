import java.util.Scanner;

public class IO {
    public static void main(String[] args) {
        double valor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        valor = sc.nextDouble();
        System.out.println("O valor é " + valor);
    }
}
