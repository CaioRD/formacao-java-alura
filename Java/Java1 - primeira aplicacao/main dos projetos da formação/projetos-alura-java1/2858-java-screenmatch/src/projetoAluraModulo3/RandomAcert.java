package projetoAluraModulo3;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

/*
Agora é com você! Pratique os conceitos que foram ensinados ao longo dessa aula com o seguinte desafio:
Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e
pedir para que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa deve informar
se o número digitado pelo usuário é maior ou menor do que o número gerado.

Divas:
Para gerar um número aleatório em Java: new Random().nextInt(100);
Utilize o Scanner para obter os dados do usuário;
Utilize uma variável para contar as tentativas;
Utilize um loop para controlar as tentativas;
Utilize a instrução break; para interromper o loop.
*/


public class RandomAcert {
    public static void main(String[] args) {
        RandomAcert jogo = new RandomAcert();
        jogo.jogar();
    }



     public void jogar(){
            Scanner s = new Scanner(System.in);
            Random r = new Random();


            int numeroAleatorio = r.nextInt(101);
            int tentativas = 1;
            int maxTentativas = 5;

            System.out.println("Digite um número entre 0 e 100: ");
            int valor = s.nextInt();

            while(tentativas <= maxTentativas){
                if (valor == numeroAleatorio){
                    System.out.println("Você acertou! O número secreto é: " + numeroAleatorio);
                    break;
                } else if (valor < numeroAleatorio) {
                    System.out.println("Essa é sua " + tentativas + "° O valor do número é maior");
                }else{
                    System.out.println("Essa é sua " + tentativas + "° O valor do número é menor");
                }
                tentativas++;

                if(tentativas <= maxTentativas){
                    System.out.println("Digite outro valor: ");
                    valor = s.nextInt();
                }
            }

            if (valor != numeroAleatorio){
                System.out.println("Você não conseguiu acertar o número. O valor correto é: " + numeroAleatorio);
            }
         int opcao = 0;

         while(opcao != 2){
             System.out.println("");
             System.out.println("jogar novamente digite 1 ");
             System.out.println("Não jogar novamente digite 2");
             opcao = s.nextInt();

             switch (opcao){
                 case 1:
                     System.out.println("Você escolheu jogar novamente. ");
                     System.out.println("");
                     String[] args = {};
                     main(args);
                     break;
                 case 2:
                     System.out.println("Você escolheu encerrar o jogo. ");
                     System.out.println("Obrigado por jogar. ");
                     break;
             }
         }
         s.close();
        }

    }

