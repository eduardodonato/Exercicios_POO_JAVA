package Aplicacao;

import entidade.ContaParaEmpresas;
import entidade.ContaPoupan�a;
import entidade.conta;

public class ProgramaConta {

	public static void main(String[] args) {

		conta acc = new conta(1001, "Alex", 0.00); // CTRL + ESPA�O PARA ESCOLHER O CONTRUTOR COM ARGUMENTOS

		ContaParaEmpresas ContaEmpre = new ContaParaEmpresas(1002, "Maria", 0.00, 500.00);

		// *********************************** UPCASTING - � PEGAR UM OBJETO DO TIPO
		// CONTApARAEMPRESA E ATRIBUIR PARA UMA VARIAVEL DO TIPO CONTA

		conta conta1 = ContaEmpre;

		// N�o da erro quando voce passa um objeto da sub classe ser atribuido a uma
		// variavel da super classe pq a heren�a � uma rela��o � 1 ou seja, uma conta
		// empresarial � uma conta, como ela tb � uma conta podemos atribuir um objeto
		// do tipo conta empresarial para uma conta

		conta conta2 = new ContaParaEmpresas(1003, "Bob", 0.0, 200.00);

		// Acima remos a msm quest�o do comentario anterior

		conta conta3 = new ContaPoupan�a(1004, "Anna", 0.0, 0.01);

		// Objetos da sub classe e atribui-lo para uma variavel da SUPER classe

		// DOWNCASTING � o processo inverso

		// ContaParaEmpresas conta5 = conta2; --- Nao pode fazer isso, dar� erro, termos
		// q fazer uma casting manual
		ContaParaEmpresas conta5 = (ContaParaEmpresas) conta2;
		conta5.empresti(100);
		;

		// ContaParaEmpresas conta6 = (ContaParaEmpresas) conta3; // vai dar erro pois o
		// conta3 n�o � do tipo conta empresarial e sim conta poupan�a
		if (conta3 instanceof ContaParaEmpresas) {
			ContaParaEmpresas conta6 = (ContaParaEmpresas) conta3;
			conta6.empresti(200);
			System.out.println("Feito");
		}

		if (conta3 instanceof ContaPoupan�a) { // para testar se a conta3 � uma instanca da conta poupan�a, se for cria
												// a variavel acc5 recebendo o castingo para sa
			ContaPoupan�a Conta5 = (ContaPoupan�a) conta3;
			Conta5.AtualizarSaldo();
			System.out.println("Update!");

		}

		// Testando a sobreposi��o:
		conta conta7 = new conta(1001, "Beth", 1000.0);
		conta7.saque(200);
		System.out.println(conta7.getSaldo()); // A saida aqui dever� imprimir 795, descontando os 5, pois aqui ele usar� o metodo implementado dentro da super classe, e l� possui a exigencia de discontarmos 5 em cada saque
	
		conta conta8 = new ContaPoupan�a(1002, "Maria", 1000.0, 0.01);
		conta8.saque(200.0);
		System.out.println(conta8.getSaldo()); //A saida dever� imprimir 800, sem descontar os 5, pois aqui ele usar� o metodo implementado dentro da classe poupan�a
	
		// Testando o super:
		
		conta conta9 = new ContaParaEmpresas(1003, "Bob", 1000.0, 500.0);
		conta9.saque(200);
		System.out.println(conta9.getSaldo());  //Aqui a saida sera 793 pois usar� o metodo da sub clase contaParaEmpresa e l� diminue 2 de cada opera��o de saque
		
	
	
	}
}
