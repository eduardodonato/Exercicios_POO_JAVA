package aplicação;

import java.util.Scanner;

import entities.Produto;

public class programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos produtos deseja entrar: ");
		int n = sc.nextInt();

		Produto[] vect = new Produto[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.println("Entre com o nome do produto #" + (i+1));
			String nome = sc.next();
			System.out.println("Entre com o preço do produto #" + (i+1));
			double preco = sc.nextDouble();
			vect[i] = new Produto(nome, preco); 
		}
		double soma = 0;
		
		for(int i = 0; i<vect.length; i++) {
			soma = soma + vect[i].getPreco();
		}
		double media = soma /n;
		System.out.printf("A media de valores dos produtos comprados foi R$ %.2f ", media);

		sc.close();
	}

}
