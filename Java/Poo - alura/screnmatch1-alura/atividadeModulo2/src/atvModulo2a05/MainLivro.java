package atvModulo2a05;

public class MainLivro {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.setAutor("Napoleon Hill");
        livro.setTitulo("Mais esperto que o diabo");

        livro.exibirDetalhes();
    }
}
