package atvModulo4a06;

public class Produto implements Vendavel{
    private String nome;
    private double precoUnitario;
    private double desconto;

    public Produto(String nome, double precoUnitario) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.desconto = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return (precoUnitario - (precoUnitario * (desconto / 100))) * quantidade;
    }

    @Override
    public void aplicarDesconto(double desconto) {
        this.desconto = desconto;
    }

}
