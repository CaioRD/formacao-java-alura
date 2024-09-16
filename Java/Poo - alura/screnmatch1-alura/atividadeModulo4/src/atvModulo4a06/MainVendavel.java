package atvModulo4a06;

//Crie uma interface Vendavel com métodos para calcular o preço total de um produto
// com base na quantidade comprada e aplicar descontos.
// Implemente essa interface nas classes Produto e Servico,
// cada uma fornecendo a sua própria lógica de cálculo de preço.
public class MainVendavel {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 2000.00);
        Servico servico = new Servico("Consultoria de TI", 150.00);

        produto.aplicarDesconto(10); // 10% de desconto
        servico.aplicarDesconto(20); // 20% de desconto

        int quantidadeProdutos = 3;
        int quantidadeHorasServico = 5;

        System.out.println("Preço total dos produtos: " + produto.calcularPrecoTotal(quantidadeProdutos));
        System.out.println("Preço total dos serviços: " + servico.calcularPrecoTotal(quantidadeHorasServico));
    }
}
