package atvModulo4a05;

//Crie uma interface Calculavel com um método double calcularPrecoFinal().
// Implemente essa interface nas classes Livro e ProdutoFisico,
// cada uma retornando o preço final considerando descontos ou taxas adicionais.
public class MainCalculavel {
    public static void main(String[] args) {
        Livro livro = new Livro("Java Programming", 100.0, 10.0); // 10% de desconto
        ProdutoFisico produtoFisico = new ProdutoFisico("Mouse", 50.0, 15.0); // 15% de taxa adicional

        System.out.println("Preço final do livro: " + livro.calcularPrecoFinal());
        System.out.println("Preço final do produto físico: " + produtoFisico.calcularPrecoFinal());
    }
}
