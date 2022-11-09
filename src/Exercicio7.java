public class Exercicio7 {
    public static void main(String[] args) {
        double altura = 10.0;
        double comprimento = 20.0;
        double profundidade = 1.8;
        double piscina = altura * comprimento * profundidade * 1000;

        System.out.printf("As dimensões da piscina são %.0fm x %.0fm x %.1fm.\n", altura, comprimento, profundidade);
        System.out.printf("Essa piscina comporta " + piscina + " litros de água.");
    }
}
