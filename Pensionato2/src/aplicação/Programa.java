package aplicação;

import java.util.Scanner;
import entidade.Pensionato;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Pensionato[] Quartos = new Pensionato[10];

		System.out.println("Quantos quartos será alugados: ");
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.println("Cliente #" + (i + 1));
			System.out.println("Insira o nome do Cliente #" + (i + 1));
			
			String nome = sc.next();
			System.out.println("Insira o endereço de email do Cliente #" + (i + 1));
			String email = sc.next();
			System.out.println("Insira o número do quarto para aloja-lo: ");
			int NQuarto = sc.nextInt();

			Quartos[i] = new Pensionato(nome, email, NQuarto);

		}

		System.out.println("Quartos ocupados: ");
		for (int i = 0; i < 10; i++) {
			if (Quartos[i] != null) {
				System.out.println(i + ": " + Quartos[i]);

			}

		}
		sc.close();

	}
}