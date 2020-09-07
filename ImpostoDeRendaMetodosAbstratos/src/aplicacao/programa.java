package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Contribuinte;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

public class programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o numero de contribuintes: ");
		int n = sc.nextInt();
//		Contribuinte c;
		List <Contribuinte> lista = new ArrayList<>();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do imposto do contribuinte # " + i);
			System.out.println("Contibuinte individual(i) ou contibuinte empresarial(e)");
			char op = sc.next().charAt(0);

			if (op == 'i') {
				System.out.println("Entre com o nome do contribuinte: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.println("Informe o rendimento anual do contriuinte: ");
				double rendimentoAnual = sc.nextDouble();
				System.out.println("Entre com o total gastos em saúde pelo contriuinte: ");
				double gastoSaude = sc.nextDouble();
				lista.add(new PessoaFisica(nome, rendimentoAnual, gastoSaude));
			}

			if (op == 'e') {
				System.out.println("Entre com o nome da empresa contribuinte: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.println("Informe o rendimento anual da empresa contriuinte: ");
				double rendimentoAnual = sc.nextDouble();
				System.out.println("Informe o numero de funcionarios da empresa contribuinte: ");
				int numFunc = sc.nextInt();
				lista.add(new PessoaJuridica(nome, rendimentoAnual, numFunc));
			}
			

		}
		double soma = 0.0;
		System.out.println();
		System.out.println("Impostos a pagar: ");
		for(Contribuinte x : lista) {
			double imposto = x.imposto();
			System.out.println(x.getNome() + " : R$ " + String.format("%.2f",x.imposto()));
			soma += imposto;
			

			
		}
		
		System.out.println();
		System.out.println("Total de impostos apurados: " + String.format(" R$ " + "%.2f", soma));
		
		

		sc.close();
	}

}
