package br.com.alura.sreenmatch.modelos;

public class Filme {
    private String nome;
     private int anoLancamento;
     private boolean incluiPlano;
     private double somaAvaliacao;
     private int totalAvaliacao;
     private int duracaoFilme;

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public boolean isIncluiPlano() {
        return incluiPlano;
    }

    public int getDuracaoFilme() {
        return duracaoFilme;
    }

    public double getSomaAvaliacao() {
        return somaAvaliacao;
    }

    public int getTotalAvaliacao(){
         return totalAvaliacao;
     }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setIncluiPlano(boolean incluiPlano) {
        this.incluiPlano = incluiPlano;
    }

    public void setDuracaoFilme(int duracaoFilme) {
        this.duracaoFilme = duracaoFilme;
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
