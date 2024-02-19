public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlanoBase = false;
        double media = (7.2 + 6.9 + 9 + 8.2) / 4;
        String tipoPlano = "Deluxe";

        if (anoDeLancamento > 2022) {
            System.out.println("Esse é um filme de lançamento!");
        } else {
            System.out.println("Esse é um filme retrô mas vale a pena assistir ;)");
        }
        if (incluidoNoPlanoBase || tipoPlano.equals("Deluxe")) {
            System.out.println("Você pode assistir a esse filme!");
        } else {
            System.out.println("Você precisa assinar nosso plano Deluxe para assistir a esse filme");
        }

    }
}
