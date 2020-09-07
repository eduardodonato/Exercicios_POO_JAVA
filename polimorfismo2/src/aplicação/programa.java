package aplicação;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


import entidades.produto;
import entidades.produtoImportado;
import entidades.produtosUsados;

public class programa {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com a quantidade de produtos: ");
		int n = sc.nextInt();

		produto p;
		Queue<produto> lista = new LinkedList<>();

		for (int i = 1; i <= n; i++) {
			System.out.println("Produto #" + i);
			System.out.println("Qual a categoria do produto: |Produto comum(c)|  |Produto Importado(i)|  |Produto usado(u)|");
			char op = sc.next().charAt(0);
			if (op == 'c') {
				System.out.println("Nome do produto: ");
				String nome = sc.next();
				System.out.println("Peço do produto: ");
				double preco = sc.nextDouble();
				p = new produto(nome, preco);
				lista.add(p);
			}
			if(op == 'i') {
				System.out.println("Nome do produto: ");
				String nome = sc.next();
				System.out.println("Peço do produto: ");
				double preco = sc.nextDouble();
				System.out.println("Preço da tarifa alfandegaria: ");
				double taxa = sc.nextDouble();
				p = new produtoImportado(nome, preco, taxa);
				lista.add(p);
							
			}
			if( op == 'u') {
				System.out.println("Nome do produto: ");
				String nome = sc.next();
				System.out.println("Peço do produto: ");
				double preco = sc.nextDouble();
				System.out.println("Informe a data da fabricação: ");
				String data = sc.next();
				p = new produtosUsados(nome, preco, data);
				lista.add(p);
			}
			
		}
		
		System.out.println();
		System.out.println("Etiqueta de produtos: ");
		for(produto  x : lista ) {
			System.out.println(x.etiqueta());
					
		}
		
		
		

		sc.close();
	}

}
