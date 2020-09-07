package entidades;

public class produtosUsados extends produto {
	
	private String dataFabricacao;
	
	
	public produtosUsados() {
		
	}


	public produtosUsados(String nome, double preco, String dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}


	public String getDataFabricacao() {
		return dataFabricacao;
	}


	public void setDataFabricacao(String dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	
	@Override
	public String etiqueta () {
		return getNome() + "(usado)" + " R$ " + getPreco() + " (Fabricado em: " +this.dataFabricacao+")";
	}
	
	
	
	

}
