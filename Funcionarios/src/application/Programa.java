package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.funcionarios;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<funcionarios> list = new ArrayList<>();

		System.out.println("Quantos funcionarios você pretende registrar: ");
		double N = sc.nextDouble();

		for (int i = 0; i < N; i++) {
			System.out.println();
			System.out.println("Empregado #" + (i+1) + ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			while (IdExistente(list, id)) {
				System.out.print("Id já existente. Tente novamente: ");
				id = sc.nextInt();
			}

			System.out.print("Entre com o nome do funcionario: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Entre com o Salario do funcionario: ");
			double salary = sc.nextDouble();
			list.add(new funcionarios(id, nome, salary));      /////////////////////////////////////////////////////////////
		}

		// PART 2 - Atualizando o salario do funcionario escolhido:

		System.out.println();
		System.out.print("Entre com o ID do funcionario que terá um aumento: ");
		int id = sc.nextInt();
		funcionarios empregado = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);  ///////////////////////////////
		if (empregado == null) {
			System.out.println("O Id. inserido não existe!");
		} else {
			System.out.print("Entre com a porcentagem do aumento: ");
			double percentage = sc.nextDouble();
			empregado.ReajusteSalarial(percentage);
		}

		// PART 3 - Listar empregados:

		System.out.println();
		System.out.println("Lista de empregados cadastrados:");
		for (funcionarios obj : list) {
			System.out.println(obj);
		}

		sc.close();
	}

	public static boolean IdExistente(List<funcionarios> list, int id) {   /////////////////////////////////////////////////////////////////////////
		funcionarios empregado = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);/////////////////////////////////////////
		return empregado != null;/////////////////////////////////////////////////////////////////////////////////////
	}
}