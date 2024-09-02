package br.com.alura.sreenmatch.modelos;

public class Filme {
    public String nome;
     int anoLancamento;
     boolean incluiPlano;
     private double somaAvaliacao;
     private int totalAvaliacao;
     int duracaoFilme;

    public double getSomaAvaliacao() {
        return somaAvaliacao;
    }

    public int getTotalAvaliacao(){
         return totalAvaliacao;
     }


    public void exibirFichaTecnica(){
        System.out.println(nome);
        System.out.println("ano de lançamento do filme "+ anoLancamento);
    }

    public void avaliaFilme(double nota){
        somaAvaliacao += nota;
        totalAvaliacao ++;
    }

    public double mediaAvaliacao(){
        return somaAvaliacao / totalAvaliacao;
    }

}
