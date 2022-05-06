public class Cachorro {
    double tamanho;
    String raca;
    int idade;
    String cor;

    void latir() {
        System.out.println("Au Au ");
    }

    void correr() {
        System.out.println("Correndo...");
    }

    void dormir() {
        System.out.println("A mimir ZZZ ");
    }

    public static void main(String[] args) {
        Cachorro numero1 = new Cachorro();
        numero1.latir();
    }
}
