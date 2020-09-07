package entidade;

public class ContaParaEmpresas extends conta {

	private double limitedeSaque;
	
	
	public  ContaParaEmpresas() {
		super(); //se tiver alguma logica futura emplementada na super classse sera incluida aqui na sub clasee
	}


	public ContaParaEmpresas(Integer numero, String titular, double saldo, double limitedeSaque) {
		super(numero, titular, saldo);   //chamando os argumentos da super classe
		this.limitedeSaque = limitedeSaque;
	}


	public double getLimitedeSaque() {
		return limitedeSaque;
	}


	public void setLimitedeSaque(double limitedeSaque) {
		this.limitedeSaque = limitedeSaque;
	}
	
	
	public void empresti(double valor) {
		deposito(valor);
		if (valor <= limitedeSaque) {
			saldo += valor -10;
		}
	}
	@Override  //Serve para mostrar ao programador que esse metodo abaixo não é igual ao da super classe. Caso apague não haverá problema. Contudo se houver algum erro no metodo (exemplo, escrever saque errado) não dará erro tambem pois o compilador vai crer que é um método novo especifico da conta poupança. Contudo se colocar o @Override novamente com algum erro no metodo ele acusará que existe erro presente no metodo.  
	public void saque (double valor) {  //metodo de sobreposição.  Pois na classe principal existe esse mesmo metodo (nome e atributos) (mesma assinatura) Contudo desconta um valor a cada saque, aqui vamos tirar esse débito
		super.saque(valor);
		saldo = saldo -2; 
	}
	
}
