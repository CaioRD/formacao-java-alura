package atvModulo4a05;

public class ProdutoFisico implements Calculavel{
    private String nome;
    private double precoBase;
    private double taxaAdicional;

    public ProdutoFisico(String nome, double precoBase, double taxaAdicional) {
        this.nome = nome;
        this.precoBase = precoBase;
        this.taxaAdicional = taxaAdicional;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public double getTaxaAdicional() {
        return taxaAdicional;
    }

    public void setTaxaAdicional(double taxaAdicional) {
        this.taxaAdicional = taxaAdicional;
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase + (precoBase * (taxaAdicional / 100));
    }
}
