/*Crie uma classe para representar uma pessoa, com os atributos privados de nome, data de nascimento e altura. 
 * Crie os m�todos p�blicos necess�rios para sets e gets e tamb�m um m�todo para imprimir todos dados de uma pessoa. 
 * Crie um m�todo para calcular a idade da pessoa
 */

package Aplica��o;

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