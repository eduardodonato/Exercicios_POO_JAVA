package entidades;

public class empregadoTerceirizado extends empregado {

	private double despesaAdicional;

	public empregadoTerceirizado() {
	}

	public empregadoTerceirizado(String nome, Integer horas, double valorPorHora, double despesaAdicional) {
		super(nome, horas, valorPorHora);
		this.despesaAdicional = despesaAdicional;
	}

	public double getDespesaAdicional() {
		return despesaAdicional;
	}

	public void setDespesaAdicional(double despesaAdicional) {
		this.despesaAdicional = despesaAdicional;
	}

	@Overrride
	public double pagamento() {
		return super.pagamento() + despesaAdicional * 1.1;
	}

}
