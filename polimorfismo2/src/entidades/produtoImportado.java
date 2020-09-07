package entidades;

public class produtoImportado extends produto {
	
	private double taxaAlfandega;
	
	
	public produtoImportado() {
		
	}


	public produtoImportado(String nome, double preco, double custoAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = custoAlfandega;
	}


	public double getCustoAlfandega() {
		return taxaAlfandega;
	}


	public void setCustoAlfandega(double custoAlfandega) {
		this.taxaAlfandega = custoAlfandega;
	}
	
	
	@Override 
	public String etiqueta () {
		return this.getNome() + " R$ " + (this.getPreco() + taxaAlfandega) + " (taxa alfandegária: " + taxaAlfandega+")";
	}
	
	
	
	
	
	

}
