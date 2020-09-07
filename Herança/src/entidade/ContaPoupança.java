package entidade;

public class ContaPoupan�a  extends conta{
	
	
	private double taxaDeJuros;
	
	
	
	public ContaPoupan�a() {
		super();
	}



	public ContaPoupan�a(Integer numero, String titular, double saldo, double taxaDeJuros) {
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
	
	@Override  //Serve para mostrar ao programador que esse metodo abaixo n�o � igual ao da super classe. Caso apague n�o haver� problema. Contudo se houver algum erro no metodo (exemplo, escrever saque errado) n�o dar� erro tambem pois o compilador vai crer que � um m�todo novo especifico da conta poupan�a. Contudo se colocar o @Override novamente com algum erro no metodo ele acusar� que existe erro presente no metodo.  
	public void saque (double valor) {  //metodo de sobreposi��o.  Pois na classe principal existe esse mesmo metodo (nome e atributos) (mesma assinatura) Contudo desconta um valor a cada saque, aqui vamos tirar esse d�bito
		saldo = saldo - valor;
	}
	
	
	

}
