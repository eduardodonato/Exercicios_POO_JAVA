package aplicação;

import java.util.Scanner;

import entities.pensionato;

public class programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		pensionato[] vect = new pensionato[10];

		System.out.println("Quantos quartos você quer reservar? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Alugado: #" + i + ":");
			System.out.println("Insira o nome do cliente: ");
			sc.nextLine();
			String nome = sc.next();
			System.out.println("Entre o endereço de email do cliente: ");
			String email = sc.next();
			System.out.println("Insira o numero do quarto: ");
			int Nquarto = sc.nextInt();

			vect[Nquarto] = new pensionato(nome, email);

		}
		System.out.println();
		System.out.println("Quartos ocupados: ");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}

		}

		sc.close();

	}
}
