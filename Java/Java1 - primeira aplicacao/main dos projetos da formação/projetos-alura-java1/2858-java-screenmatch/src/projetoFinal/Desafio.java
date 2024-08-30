package projetoFinal;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Caio Roberto";
        String tipoConta = "Corrente";
        double saldo = 1500.00;
        int opcao = 0;

        System.out.println("================================================");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n================================================");


        String menu = """
                <- Selecione uma opção ->
                1 - consultar saldo.
                2 - depositar um valor.
                3 - resgatar um valor.
                4 - sair.                
                """;


        Scanner s = new Scanner(System.in);
        while( opcao != 4){
            System.out.println(menu);
            opcao = s.nextInt();

            if (opcao == 1){
                System.out.println("Seu saldo é: " + saldo);
            } else if (opcao == 2){
                System.out.println("Digite o valor que deseja depositar");
                double depositarValor = s.nextDouble();
                saldo += depositarValor;
                System.out.println("O seu saldo agora é de: " + saldo);
            } else if (opcao == 3){
                System.out.println("Digite o valor que deseja transferir: ");
                double resgateValor = s.nextDouble();
                if (resgateValor <= saldo){
                    saldo -= resgateValor;
                    System.out.println("Seu saldo agora é de: " + saldo);
                }else{
                    System.out.println("Saldo insuficiente para resgate. ");
                }

            }else if (opcao != 4){
                System.out.println("Opção invalida. ");
            }
        }
    }
}
