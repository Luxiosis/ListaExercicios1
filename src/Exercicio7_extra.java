public class Exercicio7_extra {
    public static void main(String[] args) {
        double altura = 10.0;
        double comprimento = 20.0;
        double profun_in = 1.2;
        double profun_fin = 1.8;
        double profun_total = (profun_fin + profun_in) / 2;
        double piscina = altura * comprimento * profun_total * 1000;

        System.out.printf("As dimensões da piscina são %.0fm x %.0fm. Sua profundiade inicial é %.1fm e sua profundidade final é %.1fm.\n", altura, comprimento, profun_in, profun_fin);
        System.out.printf("Essa piscina comporta " + piscina + " litros de água.");
    }
}
