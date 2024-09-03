package atvModulo3a03;

import java.util.Scanner;

public class ContaCorrente extends ContaBancaria {
    private double saldo;
    private double tarifa = 0.1; // tarifa de 10%

    Scanner s = new Scanner(System.in);

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public void depositar(){
        System.out.println("======== Opção de depósito ========");
        System.out.println("Digite o valor que deseja depositar: ");
        double valorDeposito = s.nextDouble();
        this.saldo += valorDeposito;
        System.out.println("Seu novo saldo é: " + this.saldo + " reais");
    }

    @Override
    public void sacar(){
        System.out.println("======== Opção de saque ========");
        System.out.println("Digite o valor que deseja sacar: ");
        double valorSaque = s.nextDouble();
        if (valorSaque > this.saldo){
            System.out.println("Valor indisponível para saque! Tente novamente!");
        } else {
            this.saldo -= valorSaque;
            System.out.println("Seu novo saldo após o saque é: " + this.saldo + " reais");
        }
    }

    @Override
    public void consultarSaldo(){
        System.out.println("======== Opção consultar saldo ========");
        System.out.println("Seu saldo atual é: " + this.saldo + " reais");
    }

    public void cobrarTarifa(){
        if (this.saldo > 0) {
            System.out.println("======== Cobrança da tarifa ========");
            double valorTarifa = this.saldo * this.tarifa;
            this.saldo -= valorTarifa;
            System.out.println("Valor cobrado da tarifa: " + valorTarifa + " reais");
            System.out.println("Seu saldo atual após a tarifa será: " + this.saldo + " reais");
        } else {
            System.out.println("Não existe saldo para tarifa!");
        }
    }
}
