package atividadesModulo3;

import java.util.Scanner;

//Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
public class Atividade4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.println("Digite um número: ");
        int numero = s.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + numero + " = " + numero * i);
        }
    }
}


