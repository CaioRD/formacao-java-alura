package atvModulo2a01;

public class MainContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();

        conta1.titular = "Caio";
        conta1.setNumeroConta(01);
        conta1.setSaldo(2000);

        conta1.exibirConta();

        conta1.setSaldo(2500);
        System.out.println("O novo saldo da conta é: "+ conta1.getSaldo());
    }
}
