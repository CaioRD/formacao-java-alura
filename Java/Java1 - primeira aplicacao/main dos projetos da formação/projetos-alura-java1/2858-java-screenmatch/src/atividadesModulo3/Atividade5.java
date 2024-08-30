package atividadesModulo3;

import java.util.Scanner;

//Crie um programa que solicite ao usuário a entrada de um número inteiro.
// Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.

public class Atividade5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int numero = s.nextInt();

        if(numero % 2 == 0){
            System.out.println("O número "+ numero + " é par");
        }else{
            System.out.println("O número "+ numero + " é ímpar");

        }
    }
}
