package atvModulo2a03;

public class MainProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        produto1.setNome("video game");
        produto1.setPreco(1550.0);

        produto2.setNome("fone de ouvido");
        produto2.setPreco(130.0);

        System.out.println("O primeiro produto foi: " + produto1.getNome());
        System.out.println("O valor dele é: " + produto1.getPreco());
        produto1.aplicarDesconto();

        System.out.println("O segundo produto foi: " + produto2.getNome());
        System.out.println("O valor dele é: " + produto2.getPreco());
        produto2.aplicarDesconto();
    }
}
