public class Exercicio4 {
    public static void main(String[] args) {
        double reais = 10.00;
        double dolares = reais / 5.12820512821;
        double euros = reais / 5.12820512821;
        double libras = reais / 5.88235294118;
        double pesos = reais / 0.03214503841;
        double coroas = reais / 0.21061499578;

        System.out.printf("O valor recebido é de %.2f reais.\n", reais);
        System.out.println("Isso equivale a:");
        System.out.printf("- %.2f dólares\n", dolares);
        System.out.printf("- %.2f euros\n", euros);
        System.out.printf("- %.2f libras\n", libras);
        System.out.printf("- %.2f pesos argentinos\n", pesos);
        System.out.printf("- %.2f coroas tchecas\n", coroas);
    }
}
