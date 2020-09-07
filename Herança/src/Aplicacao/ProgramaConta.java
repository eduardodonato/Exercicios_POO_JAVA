package Aplicacao;

import entidade.ContaParaEmpresas;
import entidade.ContaPoupança;
import entidade.conta;

public class ProgramaConta {

	public static void main(String[] args) {

		conta acc = new conta(1001, "Alex", 0.00); // CTRL + ESPAÇO PARA ESCOLHER O CONTRUTOR COM ARGUMENTOS

		ContaParaEmpresas ContaEmpre = new ContaParaEmpresas(1002, "Maria", 0.00, 500.00);

		// *********************************** UPCASTING - É PEGAR UM OBJETO DO TIPO
		// CONTApARAEMPRESA E ATRIBUIR PARA UMA VARIAVEL DO TIPO CONTA

		conta conta1 = ContaEmpre;

		// Não da erro quando voce passa um objeto da sub classe ser atribuido a uma
		// variavel da super classe pq a herença é uma relação é 1 ou seja, uma conta
		// empresarial é uma conta, como ela tb é uma conta podemos atribuir um objeto
		// do tipo conta empresarial para uma conta

		conta conta2 = new ContaParaEmpresas(1003, "Bob", 0.0, 200.00);

		// Acima remos a msm questão do comentario anterior

		conta conta3 = new ContaPoupança(1004, "Anna", 0.0, 0.01);

		// Objetos da sub classe e atribui-lo para uma variavel da SUPER classe

		// DOWNCASTING é o processo inverso

		// ContaParaEmpresas conta5 = conta2; --- Nao pode fazer isso, dará erro, termos
		// q fazer uma casting manual
		ContaParaEmpresas conta5 = (ContaParaEmpresas) conta2;
		conta5.empresti(100);
		;

		// ContaParaEmpresas conta6 = (ContaParaEmpresas) conta3; // vai dar erro pois o
		// conta3 não é do tipo conta empresarial e sim conta poupança
		if (conta3 instanceof ContaParaEmpresas) {
			ContaParaEmpresas conta6 = (ContaParaEmpresas) conta3;
			conta6.empresti(200);
			System.out.println("Feito");
		}

		if (conta3 instanceof ContaPoupança) { // para testar se a conta3 é uma instanca da conta poupança, se for cria
												// a variavel acc5 recebendo o castingo para sa
			ContaPoupança Conta5 = (ContaPoupança) conta3;
			Conta5.AtualizarSaldo();
			System.out.println("Update!");

		}

		// Testando a sobreposição:
		conta conta7 = new conta(1001, "Beth", 1000.0);
		conta7.saque(200);
		System.out.println(conta7.getSaldo()); // A saida aqui deverá imprimir 795, descontando os 5, pois aqui ele usará o metodo implementado dentro da super classe, e lá possui a exigencia de discontarmos 5 em cada saque
	
		conta conta8 = new ContaPoupança(1002, "Maria", 1000.0, 0.01);
		conta8.saque(200.0);
		System.out.println(conta8.getSaldo()); //A saida deverá imprimir 800, sem descontar os 5, pois aqui ele usará o metodo implementado dentro da classe poupança
	
		// Testando o super:
		
		conta conta9 = new ContaParaEmpresas(1003, "Bob", 1000.0, 500.0);
		conta9.saque(200);
		System.out.println(conta9.getSaldo());  //Aqui a saida sera 793 pois usará o metodo da sub clase contaParaEmpresa e lá diminue 2 de cada operação de saque
		
	
	
	}
}
