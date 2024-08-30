package atvModulo1a04;

public class MainCarro {
    public static void main(String[] args) {
        Carro meuCarro =new Carro();
        meuCarro.modelo = "Gol";
        meuCarro.ano = 2020;
        meuCarro.cor = "Preto";

        // Exibir ficha técnica
        meuCarro.exibeFichaTecnica();

        // Calcular idade do carro
        System.out.println("Idade do carro: " + meuCarro.calculaIdade() + " anos");
    }
}
