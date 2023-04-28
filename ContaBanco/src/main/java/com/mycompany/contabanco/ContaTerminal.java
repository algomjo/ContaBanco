package com.mycompany.contabanco;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        String agencia, nomeCliente;
        double saldo;

        System.out.print("Por favor, digite o número da Agência: ");
        agencia = input.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        numero = input.nextInt();
        input.nextLine();

        System.out.print("Por favor, digite o nome do cliente: ");
        nomeCliente = input.nextLine();

        System.out.print("Por favor, digite o saldo da conta: ");
        saldo = input.nextDouble();

        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        System.out.println(mensagem);
    }
}
