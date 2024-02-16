public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o RafaFlix");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("O ano de lançamento do filme é: " + anoDeLancamento);
        boolean incluidoNoPlano = false;
        double media = (7.2 + 6.9 + 9 + 8.2) / 4;
        int estrelas = (int) media / 2;
        String sinopse = "Filme de aventura relacionado a aviação";

        System.out.println(sinopse);
        System.out.println("A nota do filme é: " + media);
        System.out.println("Esse filme é grátis? Resposta: " + incluidoNoPlano);
        System.out.println("O filme tem " + estrelas + " estrelas");

    }
}