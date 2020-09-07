/*Objetivo: Criar um programa que apresente uma exception personalizada.
Neste caso, a exception ocorrerá no momento da divisão de um número impar 
por um numero par, informando que o resultado gerará um número real
(não inteiro) diferente dos tipos dos dois arrays criados*/
public class ExceptionsPersonalizadas{

	public static void main(String[] args) {
		
		int numeros[] = { 4, 8, 5, 16, 32, 21, 64, 128 };
		int denominador[] = { 2, 0, 4, 8, 0, 2, 4 };

		for (int i = 0; i < numeros.length; i++) {

			try {
				if(numeros[i] %2 != 0) {
					//lança a exception aqui
					throw new Exception("Divisão de número impar, o resultado não será inteiro");
				}
				System.out.println(numeros[i] + "/" + denominador[i] + "=" + (numeros[i] / denominador[i]));
			}

			catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println("Ocorreu um erro!");
			}
			
			catch (Exception e) {
				System.out.println("Aconteceu um erro");
				System.out.println(e.getMessage()); //Para sabermos o que exatamente ocorreu
			}
		}
	}
}
