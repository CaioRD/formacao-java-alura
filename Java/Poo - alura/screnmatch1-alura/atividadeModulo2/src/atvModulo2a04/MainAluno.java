package atvModulo2a04;

public class MainAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Caio",8.0,7.0,9.0);
        Aluno aluno2 = new Aluno("Jorge",7.0,6.0,5.0);

        System.out.println("Aluno 1: ");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Nota 1: " + aluno1.getNota1());
        System.out.println("Nota 2: " + aluno1.getNota2());
        System.out.println("Nota 3: " + aluno1.getNota3());
        System.out.println("Média: " + aluno1.exibirNotas());
        aluno1.valorMedia();
        System.out.println();

        System.out.println("Aluno 2: ");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Nota 1: " + aluno2.getNota1());
        System.out.println("Nota 2: " + aluno2.getNota2());
        System.out.println("Nota 3: " + aluno2.getNota3());
        System.out.println("Média: " + aluno2.exibirNotas());
        aluno2.valorMedia();
        System.out.println();
    }
}
