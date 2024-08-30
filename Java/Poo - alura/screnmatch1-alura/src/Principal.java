public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.nome ="Interestellar";
        meuFilme.anoLancamento = 2014;

        meuFilme.exibirFichaTecnica();

        meuFilme.avaliaFilme(8);
        meuFilme.avaliaFilme(7);
        meuFilme.avaliaFilme(10);
        System.out.println(meuFilme.somaAvaliacao);
        System.out.println(meuFilme.totalAvaliacao);
        System.out.println("A média de avaliações foi: " + meuFilme.mediaAvaliacao());
    }
}
