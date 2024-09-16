package atvModulo4a05;

public class Livro implements Calculavel{
    private String titulo;
    private double precoBase;
    private double desconto;

    public Livro(String titulo, double precoBase, double desconto) {
        this.titulo = titulo;
        this.precoBase = precoBase;
        this.desconto = desconto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase - (precoBase * (desconto / 100));
    }
}
