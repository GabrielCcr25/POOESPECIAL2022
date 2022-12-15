package br.com.Questao1;

public class Conta {
    private int agencia;
    private int numConta;
    private double saldo;

    public Conta(int agencia, int numConta, double saldo) {
        this.agencia = agencia;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public Conta() {

    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void sacar(double valSaque){
        saldo -= valSaque;

    }
    public void depositar(double valDeposito){
        saldo+=valDeposito;

    }

    public void depositar() {
    }

    public void sacar() {
    }
}
