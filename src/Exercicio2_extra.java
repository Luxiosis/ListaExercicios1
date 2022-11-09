public class Exercicio2_extra {
    public static void main(String[] args) {
        int fileira = 10;
        int cadeiras = 8;
        int total = fileira * cadeiras;
        int deficiencia = total / 10;

        System.out.println("A sala de cinema tem " + fileira + " fileiras e " + cadeiras + " cadeiras em cada.");
        System.out.println("A capacidade dessa sala é de " + total + " pessoas, sendo que " + deficiencia + " lugares são reservados para PCDs.");
    }
}
