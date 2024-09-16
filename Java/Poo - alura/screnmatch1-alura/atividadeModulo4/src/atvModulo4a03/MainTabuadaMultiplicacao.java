package atvModulo4a03;

import java.util.Scanner;

// Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada
// com o método mostrarTabuada() para exibir a tabuada de um número.
// A classe deve receber o número como parâmetro.
public class MainTabuadaMultiplicacao {
    public static void main(String[] args) {
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        Scanner s = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = s.nextInt();

        tabuada.mostrarTabuada(numero); // Exemplo com o número 7
    }
}
