package Aplicações;

import java.util.Scanner;

import entidade.Funcionario;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com a quantidade de empregados que serão registrados: ");
		int n = sc.nextInt();
		Funcionario[] empregado = new Funcionario[n];

		for (int i = 0; i < n; i++) {

			System.out.println("Entre com o numero de registro do funcionario #" + (i + 1));
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Insira o nome completo do funcionario #" + (i + 1));
			String nome = sc.nextLine();
			System.out.println("Informe o salário do funcionario #" + (i + 1));
			double salario = sc.nextDouble();

			empregado[i] = new Funcionario(id, nome, salario);

		}
		System.out.println("Entre com o Id do funcionario que receberá aumento: ");
		int id2 = sc.nextInt();
		for (Funcionario x : empregado) {

			if (x.getId() == id2) {
				System.out.println("Entre com o percentual que deseja aumentar no salario: ");
				int percentual = sc.nextInt();
				x.aumentoSalario(percentual);
			} else {
				System.out.println("O número de registro inserido não existe!");
				for (int i = 0; i < empregado.length; i++) {
					System.out.println(empregado[i].toString());
				}

			}

		}

		sc.close();
	}

}
