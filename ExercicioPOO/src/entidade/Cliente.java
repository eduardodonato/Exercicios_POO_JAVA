package entidade;

public class Cliente {
	
	private String nome;
	private int dataNascimento;
	private double altura;
	
	
	
	public Cliente() {
		
	}
	
	public Cliente(String nome, int dataNascimento, double altura ) {
		this.nome = nome;
		this.dataNascimento= dataNascimento;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	
	public double idade ( double anoNascimento, double anoAtual) {
		return anoAtual - anoNascimento;
	}
	
	
	public String toString() {
		return "Cliente [nome = " + nome + ", Data de nacimento = " + dataNascimento + ", Altura = " + altura + "]";
	}
	
	
	
	

}
