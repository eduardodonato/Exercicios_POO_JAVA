
package entities;

public class conta {
	private int NumConta;
	private String Titular;
	private double Saldo;

	public conta(int NumConta, String Titular, double DepIni) {
		this.NumConta = NumConta;
		this.Titular = Titular;
		Deposito(DepIni);

	}

	public conta(int NumConta, String Titular) {
		this.NumConta = NumConta;
		this.Titular = Titular;
	}

	public void Deposito(double ValorDep) {
		Saldo += ValorDep;
	}

	public void Saque(double ValorSaque) {
		this.Saldo = Saldo - ValorSaque - 5.0;

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

	public double getSaldo() {
		return Saldo;
	}

	public String toString() {
		return "Account " + NumConta + ", Titular: " + Titular + ", Extrato: R$ " + String.format("%.2f", Saldo);

	}

}

