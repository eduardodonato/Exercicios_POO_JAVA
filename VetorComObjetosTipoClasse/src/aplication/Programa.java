/*Criar um programa que leia um numero N (Que será a quantidade de produtos criados) COntendo nome e preço.
Armazene os N produtos em um vetor e mostre o preço médio deles. 
*/

package aplication;

import java.util.Scanner;

import entities.Product;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // "N" elementos

		Product[] vect = new Product[n];

		for (int i = 0; i < vect.length; i++) { // Percorrerá todas as posiçoes do vetor

			sc.nextLine(); // Por conta da nextInt usado anteriormente (linha 15). Como ficou pendente
							// usa-se assim para quebrar uma linha
			String name = sc.nextLine();
			double Price = sc.nextDouble();

			vect[i] = new Product(name, Price);
		}

		double soma = 0;
		for (int i = 0; i < vect.length; i++) {
			soma = soma + vect[i].getPreco(); // Aqui vc acessa o vetor na posição "i" e atraves do getPreco, recebe os
												// precos
		}

		double media = soma / vect.length;
		System.out.printf("A media dos preços correspondem a %.2f%n", media);

		sc.close();
	}

}
