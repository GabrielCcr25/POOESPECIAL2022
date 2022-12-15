package br.com.Questao1;
import java.util.Scanner;
public class MainQuestao1 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Entre o nome do cliente: ");
        String nome = ler.nextLine();
        System.out.println("Entre com o endereço do cliente: ");
        String endereco = ler.nextLine();
        System.out.println("Entre com o telefone ");
        String telefone = ler.nextLine();

        Cliente c1 = new Cliente();

        Conta conta1 = new Conta();
        System.out.println("Entre com o valor a ser depositado: ");
        double valDeposito = ler.nextDouble();
        conta1.depositar();
        System.out.println("Entre com o valor a ser sacado: ");
        double valSaque = ler.nextDouble();
        conta1.sacar();

        System.out.println();
        System.out.println(conta1.getSaldo());






    }
}
