package entidade;

public class ContaPoupança  extends conta{
	
	
	private double taxaDeJuros;
	
	
	
	public ContaPoupança() {
		super();
	}



	public ContaPoupança(Integer numero, String titular, double saldo, double taxaDeJuros) {
		super(numero, titular, saldo);
		this.taxaDeJuros = taxaDeJuros;
	}



	public double getTaxaDeJuros() {
		return taxaDeJuros;
	}



	public void setTaxaDeJuros(double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}
	
	
	public void AtualizarSaldo() {
		saldo += saldo + taxaDeJuros;
		
	}
	
	@Override  //Serve para mostrar ao programador que esse metodo abaixo não é igual ao da super classe. Caso apague não haverá problema. Contudo se houver algum erro no metodo (exemplo, escrever saque errado) não dará erro tambem pois o compilador vai crer que é um método novo especifico da conta poupança. Contudo se colocar o @Override novamente com algum erro no metodo ele acusará que existe erro presente no metodo.  
	public void saque (double valor) {  //metodo de sobreposição.  Pois na classe principal existe esse mesmo metodo (nome e atributos) (mesma assinatura) Contudo desconta um valor a cada saque, aqui vamos tirar esse débito
		saldo = saldo - valor;
	}
	
	
	

}
