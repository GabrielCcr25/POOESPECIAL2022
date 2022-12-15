package br.com.Questao1;

public class ContaCorrente extends Conta{
    private double taxa;


    public ContaCorrente(int agencia, int numConta, double saldo) {
        super(agencia, numConta, saldo);
    }

    public ContaCorrente(int agencia, int numConta, double saldo, double taxa) {
        super(agencia, numConta, saldo);
        this.taxa = taxa;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
}
