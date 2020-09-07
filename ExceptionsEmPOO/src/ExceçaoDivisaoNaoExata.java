
public class ExceçaoDivisaoNaoExata extends Exception {

	private int num;
	private int denom;

	public ExceçaoDivisaoNaoExata(int num, int denom) {

		this.num = num;
		this.denom = denom;
	}

	@Override
	public String toString() {
		return "O resuldado de " + num + " / " + denom + " não é um inteiro!";
	}

}
