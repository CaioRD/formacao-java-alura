package atvModulo1a04;
//Crie uma classe Carro com atributos modelo, ano, cor
// e métodos para exibir a ficha técnica e calcular a idade do carro.
public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibeFichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    intcalculaIdade() {
        return 2024 - ano;
    }
}
