import br.com.alura.sreenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.sreenmatch.modelos.Filme;
import br.com.alura.sreenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("Interestellar");
        meuFilme.setAnoLancamento(2014);
        meuFilme.setDuracaoEmMinutos(270);

        meuFilme.exibirFichaTecnica();

        meuFilme.avaliaFilme(8);
        meuFilme.avaliaFilme(7);
        meuFilme.avaliaFilme(10);
        System.out.println("Total da soma de avaliações foi: " + meuFilme.getSomaAvaliacao());
        System.out.println("quantidade de avaliações: " + meuFilme.getTotalAvaliacao());
        System.out.println("A média de avaliações foi: " + meuFilme.mediaAvaliacao());

        Filme outroFilme = new Filme();

        outroFilme.setNome("Duna 2");
        outroFilme.setAnoLancamento(2024);
        outroFilme.setDuracaoEmMinutos(180);


        Serie serie = new Serie();
        serie.setNome("Game of thrones");
        serie.setAnoLancamento(2008);
        serie.exibirFichaTecnica();
        serie.setTemporadas(8);
        serie.setEpPorTemporada(10);
        serie.setMinutoPorEpisodio(65);
        System.out.println("Duração em minutos para maratonar Game of Thrones: " + serie.getDuracaoEmMinutos());


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());

    }
}
