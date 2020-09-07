package aplicação;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.empregado;
import entidades.empregadoTerceirizado;

public class programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<empregado> list = new ArrayList<>();
		empregado e1;

		System.out.print("Entre com o numero de funcionarios: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do empregado #" + (i));
			System.out.println("Ele é terceirizado? (s/n)");
			char t = sc.next().charAt(0);
			if (t == 's') {
				System.out.println("Nome: ");
				String nome = sc.next();
				System.out.println("Entre com a quantidade de horas trabalhadas: ");
				Integer horas = sc.nextInt();
				System.out.println("Entre com o valor por hora: ");
				double valorPorHora = sc.nextDouble();
				System.out.println("Entre com a despesa adicional: ");
				double despesaAdicional = sc.nextDouble();
				e1 = new empregadoTerceirizado(nome, horas, valorPorHora, despesaAdicional);
				list.add(e1);
			}
			if (t == 'n') {
				System.out.println("Nome: ");
				String nome = sc.next();
				System.out.println("Entre com a quantidade de horas trabalhadas: ");
				Integer horas = sc.nextInt();
				System.out.println("Entre com o valor por hora: ");
				double valorPorHora = sc.nextDouble();
				e1 = new empregado(nome, horas, valorPorHora);
				list.add(e1);
			}

		}

		System.out.println();
		System.out.println("Pagamentos: ");
		for (empregado e : list ) {
			System.out.println(e.getNome() + "-" + " R$ " + String.format("%.2f", e.pagamento()));
		}
		
		
		
		
		sc.close();
	}
}
