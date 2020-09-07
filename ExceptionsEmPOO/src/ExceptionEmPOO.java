
public class ExceptionEmPOO {

	public static void main(String[] args) {

		int numeros[] = { 4, 8, 5, 16, 32, 21, 64, 128 };
		int denominador[] = { 2, 0, 4, 8, 0, 2, 4 };

		for (int i = 0; i < numeros.length; i++) {

			try {
				if (numeros[i] % 2 != 0) {
					// lança a exception aqui
					throw new ExceçaoDivisaoNaoExata(numeros[i], denominador[i]);  //*Alterei aqui 
				}
				System.out.println(numeros[i] + "/" + denominador[i] + "=" + (numeros[i] / denominador[i]));
			}

			catch (ArithmeticException | ArrayIndexOutOfBoundsException |ExceçaoDivisaoNaoExata e) { // **Alterei aqui
				System.out.println("Ocorreu um erro!");
				e.printStackTrace(); //Para vermos onde ocorreu a exceção
			}

			
		}
	}
}
