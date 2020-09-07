package application;

import java.util.Scanner;
import entities.conta;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		conta Cliente;

		System.out.println("Entre com o numero da conta: ");
		int NumC = sc.nextInt();
		System.out.println("Entre com o nome do titular da conta: ");
		sc.nextLine();
		String Nome = sc.nextLine();

		System.out.println("Haverá algum deposito inicial: (s/n)");
		char resposta = sc.next().charAt(0);
		if (resposta == 's') {
			System.out.println("Insira o valor a ser depositado: ");
			double ValorDepositar = sc.nextDouble();
			Cliente = new conta(NumC, Nome, ValorDepositar);

		} else {
			Cliente = new conta(NumC, Nome);
		}

		System.out.println();
		System.out.println(Cliente);

		System.out.println("Insira um valor a ser depositado: ");
		double ValDeposito = sc.nextDouble();
		Cliente.Deposito(ValDeposito);
		System.out.println("Conta atualizada: ");
		System.out.println(Cliente);

		System.out.println();
		System.out.println("Insira um valor a ser sacado: ");
		double Saque = sc.nextDouble();
		Cliente.Saque(Saque);
		System.out.println("Conta atualizada: ");
		System.out.println(Cliente);

		sc.close();

	}

}

