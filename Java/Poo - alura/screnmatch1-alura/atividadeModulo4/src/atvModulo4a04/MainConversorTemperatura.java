package atvModulo4a04;

import java.util.Scanner;

//Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit()
// e fahrenheitParaCelsius(). Implemente uma classe ConversorTemperaturaPadrao
// que implementa essa interface com as fórmulas de conversão e exibe os resultados.
public class MainConversorTemperatura {
    public static void main(String[] args) {
        ConversorTemperatura conversor = new ConversorTemperaturaPadrao();
        Scanner s = new Scanner(System.in);

        System.out.println("Valor em Celsius ");
        System.out.println("Digite o valor que deseja converter em fahrenheit");
        double temperaturaCelsius = s.nextDouble();
        double temperaturaFahrenheit = conversor.celsiusParaFahrenheit(temperaturaCelsius);
        System.out.println(temperaturaCelsius + " Celsius é igual a " + temperaturaFahrenheit + " Fahrenheit.");

        System.out.println("Valor em Fahrenheit ");
        System.out.println("Digite o valor que deseja converter em Celsius");
        temperaturaFahrenheit = s.nextDouble();
        temperaturaCelsius = conversor.fahrenheitParaCelsius(temperaturaFahrenheit);
        System.out.println(temperaturaFahrenheit + " Fahrenheit é igual a " + temperaturaCelsius + " Celsius.");
    }
}
