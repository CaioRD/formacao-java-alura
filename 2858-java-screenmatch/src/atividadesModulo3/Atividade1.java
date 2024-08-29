package atividadesModulo3;


import java.util.Scanner;

/*
Crie um programa que solicite ao usuário digitar um número.
Se o número for positivo, exiba "Número positivo",
caso contrário, exiba "Número negativo".
 */
public class Atividade1 {
    public static void main(String[] args) {
        Atividade1 atividade = new Atividade1();
        atividade.executar();
        atividade.repetir();

    }
    public void executar(){
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = s.nextInt();

        if(numero > 0){
            System.out.println("O número que você digitou foi: " + numero);
            System.out.println("O numero é positivo.");
        }else{
            System.out.println("O número que você digitou foi: " + numero);
            System.out.println("O número é negativo");
        }
    }

    public void repetir(){
        Scanner s = new Scanner(System.in);


        int repete = 0;

        while (repete != 2){
            System.out.println("-----Menu:------");
            System.out.println("Para digitar novamente digite: 1");
            System.out.println("Para sair digite: 2");
            repete = s.nextInt();

            switch (repete){
                case 1:
                    System.out.println("Você escolheu a opção 1");
                    System.out.println("");
                    String[] args = {};
                    main(args);
                    break;
                case 2:
                    System.out.println("Você escolheu a opção 2");
                    System.out.println("Obrigado pela resposta");
                    break;
                default:
                    System.out.println("Insira uma opção válida");
            }
            s.close();
        }


    }
}
