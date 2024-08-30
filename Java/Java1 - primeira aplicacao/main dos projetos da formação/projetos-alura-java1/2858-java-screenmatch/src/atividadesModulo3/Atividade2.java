package atividadesModulo3;

import java.util.Scanner;

// Peça ao usuário para inserir dois números inteiros.
// Compare os números e imprima uma mensagem indicando se são iguais,
// diferentes, o primeiro é maior ou o segundo é maior.
public class Atividade2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = s.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = s.nextInt();


        while(true){
            if(num1 < 0 || num2 < 0){
                System.out.println("insira números positivos");
                break;
            }
            if (num1 > num2){
                System.out.println("O primeiro numero foi: " + num1);
                System.out.println("O segundo numero foi: " + num2);
                System.out.println("O número "+ num1 + " é maior que " + num2);
                break;
            } else if (num1 < num2){
                System.out.println("O primeiro numero foi: " + num1);
                System.out.println("O segundo numero foi: " + num2);
                System.out.println("O número "+ num1 + " é menor que " + num2);
                break;
            }else {
                System.out.println("O primeiro numero foi: " + num1);
                System.out.println("O segundo numero foi: " + num2);
                System.out.println("O número "+ num1 + " e o " + num2 + " são iguais");
                break;
            }
        }
    }
}
