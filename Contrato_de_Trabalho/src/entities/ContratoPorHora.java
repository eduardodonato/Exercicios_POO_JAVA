package entities;

import java.util.Date;

public class ContratoPorHora {
	
	private Date data;
	private double ValorPorHora;
	private Integer horas;



	public ContratoPorHora() {
		
	}


	public ContratoPorHora (Date data, double ValorPorHora, Integer horas ) {
		this.data = data;
		this.ValorPorHora = ValorPorHora;
		this.horas = horas;
		
	}


	public double TotaldoContrato (double ValorPorHora, Integer horas ) {
	
		return ValorPorHora * horas;
		
	}
	
	

	public Date getData() {
		return data;
	}



	public void setData(Date data) {
		this.data = data;
	}



	public double getValorPorHora() {
		return ValorPorHora;
	}



	public void setValorPorHora(double valorPorHora) {
		this.ValorPorHora = valorPorHora;
	}



	public Integer getHoras() {
		return horas;
	}



	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	
	// IMPLEMENTAÇÃO DOS METODOS DA CLASSE **************************

	public double ValorTotal () {
		// Aqui consiste em multiplicar o valor por hora pela quantidade de horas
		return ValorPorHora * horas;
	
	}
	
	

}