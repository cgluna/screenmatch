public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme();

        filme1.nome = "Interestelar";
        filme1.anoDeLancamento = 2018;
        filme1.avaliacao = 10.0;
        filme1.duracaoEmMinutos = 200;
        filme1.incluidoNoPlano = true;
        filme1.totalDeAvaliacoes = 1;

        System.out.println(filme1.nome);
    }
}