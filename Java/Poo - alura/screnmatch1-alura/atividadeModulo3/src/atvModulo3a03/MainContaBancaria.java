package atvModulo3a03;

import java.util.Scanner;

public class MainContaBancaria {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        Scanner s = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\n======== MENU ========");
            System.out.println("Selecione uma das opções:");
            System.out.println("1 - Consultar saldo.");
            System.out.println("2 - Depositar um valor.");
            System.out.println("3 - Sacar um valor.");
            System.out.println("4 - Valor da tarifa mensal.");
            System.out.println("5 - Sair.");
            System.out.print("Opção: ");
            opcao = s.nextInt();

            switch (opcao) {
                case 1:
                    conta.consultarSaldo();
                    break;
                case 2:
                    conta.depositar();
                    break;
                case 3:
                    conta.sacar();
                    break;
                case 4:
                    conta.cobrarTarifa();
                    break;
                case 5:
                    System.out.println("Processo finalizado! Saindo da conta.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente!");
            }
        }

        s.close();
    }
}
