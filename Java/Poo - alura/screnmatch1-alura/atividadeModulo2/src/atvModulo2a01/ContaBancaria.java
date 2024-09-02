package atvModulo2a01;

//Crie uma classe ContaBancaria com os seguintes atributos:
// numeroConta (privado), saldo (privado) e titular (publico).
// Implemente métodos getters e setters para os atributos privados.
public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular;

    public int getNumeroConta(){
        return numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibirConta(){
        System.out.println("O titular da conta é: " + titular);
        System.out.println("O número da conta é: " + numeroConta);
        System.out.println("O saldo da conta é: " + saldo);
    }
}


