/*Crie uma classe para representar uma pessoa, com os atributos privados de nome, data de nascimento e altura. 
 * Crie os métodos públicos necessários para sets e gets e também um método para imprimir todos dados de uma pessoa. 
 * Crie um método para calcular a idade da pessoa
 */

package Aplicação;

import entidade.Cliente;

public class programa {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("ANNA", 1995, 1.72);
		
		double resultado;
		resultado = c1.idade(1986, 2020);
		System.out.println(resultado);
		System.out.println(c1);
	}
}