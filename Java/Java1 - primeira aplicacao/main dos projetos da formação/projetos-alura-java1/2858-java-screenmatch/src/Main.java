import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double celcius = 25.5;
        double fahrenheight = (celcius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %2f Celcius é equivalente a %2f fahrenheight ", celcius, fahrenheight);
        System.out.println(mensagem);

    }
}

