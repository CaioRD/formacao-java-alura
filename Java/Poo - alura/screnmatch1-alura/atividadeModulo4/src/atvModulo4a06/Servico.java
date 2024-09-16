package atvModulo4a06;

public class Servico implements Vendavel{
    private String descricao;
    private double precoPorHora;
    private double desconto;

    public Servico(String descricao, double precoPorHora) {
        this.descricao = descricao;
        this.precoPorHora = precoPorHora;
        this.desconto = 0.0;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoPorHora() {
        return precoPorHora;
    }

    public void setPrecoPorHora(double precoPorHora) {
        this.precoPorHora = precoPorHora;
    }

    @Override
    public double calcularPrecoTotal(int quantidadeHoras) {
        return (precoPorHora - (precoPorHora * (desconto / 100))) * quantidadeHoras;
    }

    @Override
    public void aplicarDesconto(double desconto) {
        this.desconto = desconto;
    }
}
