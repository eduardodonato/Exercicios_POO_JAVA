package Aplicações;

import java.util.Scanner;
import conta.Conta;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Conta NovoCliente;

		System.out.println("Entre com o numero da conta: ");
		int Nconta = sc.nextInt();
		System.out.println("Entre com o nome do titular da conta: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.println("Possui deposito inicial: (s/n) ");
		char DepIni = sc.next().charAt(0);

		if (DepIni == 's') {
			System.out.println("Qual o valor que deseja depositar inicialmente: ");
			double valorIni = sc.nextDouble();
			NovoCliente = new Conta(Nconta, nome, valorIni);

		} else {
			NovoCliente = new Conta(Nconta, nome);
		}
		
		
		
		
		System.out.println();
		System.out.println(NovoCliente);
		System.out.println();
		System.out.println("Deposito: ");
		double dep = sc.nextDouble();
		NovoCliente.Deposito(dep);
		System.out.println(NovoCliente);
		System.out.println();
		System.out.println("Saque: ");
		double saque = sc.nextDouble();
		NovoCliente.Saque(saque);
		System.out.println(NovoCliente);
		System.out.println();
		

		sc.close();

	}

}
