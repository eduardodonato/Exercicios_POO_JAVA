
public class Exce�aoDivisaoNaoExata extends Exception {

	private int num;
	private int denom;

	public Exce�aoDivisaoNaoExata(int num, int denom) {

		this.num = num;
		this.denom = denom;
	}

	@Override
	public String toString() {
		return "O resuldado de " + num + " / " + denom + " n�o � um inteiro!";
	}

}
