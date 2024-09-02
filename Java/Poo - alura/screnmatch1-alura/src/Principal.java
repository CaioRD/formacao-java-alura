import br.com.alura.sreenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("Interestellar");
        meuFilme.setAnoLancamento(2014);
        meuFilme.setDuracaoFilme(270);

        meuFilme.exibirFichaTecnica();

        meuFilme.avaliaFilme(8);
        meuFilme.avaliaFilme(7);
        meuFilme.avaliaFilme(10);
        System.out.println("Total da soma de avaliações foi: " + meuFilme.getSomaAvaliacao());
        System.out.println("quantidade de avaliações: " + meuFilme.getTotalAvaliacao());
        System.out.println("A média de avaliações foi: " + meuFilme.mediaAvaliacao());
    }
}
