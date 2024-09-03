package br.com.alura.sreenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoLancamento;
    private boolean incluiPlano;
    private double somaAvaliacao;
    private int totalAvaliacao;
    private int duracaoEmMinutos;

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public boolean isIncluiPlano() {
        return incluiPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
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

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
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
