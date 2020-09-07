package entidades;

public class PessoaFisica extends Contribuinte {

	private double gastosComSaude;

	public PessoaFisica() {

	}

	public PessoaFisica(String nome, double rendaAnual, double gastosComSaude) {
		super(nome, rendaAnual);
		this.gastosComSaude = gastosComSaude;
	}

	public double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}

	@Override
	public double imposto() {
		if (getRendaAnual() < 20000.00) {
			return getRendaAnual() * 0.15 - gastosComSaude * 0.5;
		} else {
			return getRendaAnual() * 0.25 - gastosComSaude * 0.5;
		}

	}

}
