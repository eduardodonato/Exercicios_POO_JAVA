/*Objetivo: Criar um programa que apresente uma exception personalizada.
Neste caso, a exception ocorrer� no momento da divis�o de um n�mero impar 
por um numero par, informando que o resultado gerar� um n�mero real
(n�o inteiro) diferente dos tipos dos dois arrays criados*/
public class ExceptionsPersonalizadas{

	public static void main(String[] args) {
		
		int numeros[] = { 4, 8, 5, 16, 32, 21, 64, 128 };
		int denominador[] = { 2, 0, 4, 8, 0, 2, 4 };

		for (int i = 0; i < numeros.length; i++) {

			try {
				if(numeros[i] %2 != 0) {
					//lan�a a exception aqui
					throw new Exception("Divis�o de n�mero impar, o resultado n�o ser� inteiro");
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
