package br.com.alura.sreenmatch.modelos;

import br.com.alura.sreenmatch.calculos.Classificavel;

public class Episodio extends Titulo implements Classificavel {
private int numero;
private String nome;
private Serie serie;
private int totalVisualicoes;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalVisualicoes() {
        return totalVisualicoes;
    }

    public void setTotalVisualicoes(int totalVisualicoes) {
        this.totalVisualicoes = totalVisualicoes;
    }

    @Override
    public int getClassificacao() {
        if (totalVisualicoes > 100){
            return 4;
        }else {
            return 2;
        }
    }

    public void setTotalVisualizacoes(int i) {
    }
}
