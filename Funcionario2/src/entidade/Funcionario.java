package entidade;

public class Funcionario {
	
	private int id;
	private String nome;
	private double salario;
	
	public Funcionario (int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void aumentoSalario (int percentual) {
		this.salario =salario + salario * percentual /100; 
	}

	
	public String toString() {
		return "********** Lista de empregados: **********" + "\n" +"[Numero de Registro] "+ id +"\n" +"[Nome]: "
	+ nome + "\n" + "Salário atual: R$"+ salario;
		
	}
	

}
