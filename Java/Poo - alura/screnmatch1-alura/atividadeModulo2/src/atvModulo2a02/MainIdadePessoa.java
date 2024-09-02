package atvModulo2a02;

public class MainIdadePessoa {
    public static void main(String[] args) {
        IdadePessoa pessoa1 = new IdadePessoa();
        IdadePessoa pessoa2 = new IdadePessoa();

        pessoa1.setNome("Caio");
        pessoa1.setIdade(24);

        pessoa2.setNome("André");
        pessoa2.setIdade(16);

        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos");
        System.out.println("Então " + pessoa1.getNome());
        pessoa1.medirIdade();

        System.out.println(pessoa2.getNome() + " tem " + pessoa2.getIdade() + " anos");
        System.out.println("Então " + pessoa2.getNome());
        pessoa2.medirIdade();
    }

}
