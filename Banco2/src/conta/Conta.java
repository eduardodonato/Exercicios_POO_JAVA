package conta;

public class Conta {
	private int NumConta;
	private String Titular;
	private double Saldo;

	public Conta(int NumConta, String Titular, double DepIni) {
		this.Titular = Titular;
		this.NumConta = NumConta;
		this.Saldo = DepIni;

	}

	public Conta(int NumConta, String Titular) {
		this.NumConta = NumConta;
		this.Titular = Titular;

	}

	public int getNumConta() {
		return NumConta;
	}

	public String getTitular() {
		return Titular;
	}

	public void setTitular(String titular) {
		Titular = titular;
	}

	public void Deposito(double deposito) {
		Saldo = Saldo + deposito;
	}

	public void Saque(double quantia) {
		this.Saldo = Saldo - quantia - 5;
	}

	public String toString() {
		return "*****Extrato da conta***** " + "\n" + "[Conta de número]: " + NumConta + "\n" + "[Titular]: " + Titular
				+ "\n" + "[Saldo atualizado]: " + String.format("%.2f", Saldo) + "\n" + "****************************";

	}

}
