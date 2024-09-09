package atvModulo4a01;

import java.util.Scanner;

public class MainConversorMoeda {
    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while(opcao !=2){
            if (opcao <= 0 && opcao >= 3){
                System.out.println("Por favor insira uma opção válida.");
            }
            System.out.println("\nSelecione uma Opção: ");
            System.out.println("Opção 1 - Converter um valor.");
            System.out.println("Opção 2 - sair.");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    conversor.converterDolarToReal();
                    break;
                case 2:
                    System.out.println("Você desejou sair.");
                    break;
            }
        }
        scanner.close();
    }
}
