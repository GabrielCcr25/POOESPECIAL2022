package br.com.Questao1;

public class ContaPoupanca extends Conta{
    private double rendimento;


    public ContaPoupanca(int agencia, int numConta, double saldo) {
        super(agencia, numConta, saldo);
    }

    public ContaPoupanca(int agencia, int numConta, double saldo, double rendimento) {
        super(agencia, numConta, saldo);
        this.rendimento = rendimento;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }
}
