public class Filme {
     protected String nomeFilme;
     int anoLancamento;
     boolean incluiPlano;
     double somaAvaliacao;
     int totalAvaliacao;
     int duracaoFilme;


    public void exibirFichaTecnica(){
        System.out.println(nome);
        System.out.println("ano de lançamento do filme "+ anoLancamento);
    }

    void avaliaFilme(double nota){
        somaAvaliacao += nota;
        totalAvaliacao ++;
    }

    double mediaAvaliacao(){
        return somaAvaliacao / totalAvaliacao;
    }

}
