    package atvModulo4a01;

    import java.util.Scanner;

    //Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira
    // com o método converterDolarParaReal() para converter um valor em dólar para reais.
    // A classe deve receber o valor em dólar como parâmetro.
    public class ConversorMoeda implements ConversaoFinanceira {
        private double valorEmDolar;
        Scanner s = new Scanner(System.in);

        public double getValorEmDolar() {
            return valorEmDolar;
        }

        public void setValorEmDolar(double valorEmDolar) {
            this.valorEmDolar = valorEmDolar;
        }

        @Override
        public void converterDolarToReal(){
            //valor do dolar hoje 09/09/2024 = 5,58
            System.out.println("========MENU========");
            System.out.println("Digite o valor que você deseja converter: ");
            this.setValorEmDolar(s.nextDouble());
            System.out.println("Hoje o dolar custa 5,58 reais.");
            double valorConvertido = this.getValorEmDolar() * 5.58;
            System.out.println("Convertendo o valor " + this.getValorEmDolar() + " voce terá: " + valorConvertido + " reais.");



        }
    }
