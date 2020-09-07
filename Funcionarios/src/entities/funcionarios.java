package entities;

public class funcionarios {
	private int id;
	private String nome;
	private double salarios;
	
	
	public funcionarios(int id, String nome, double salario){
		this.id = id;
		this.nome = nome;
		this.salarios = salario;
	}

	public int getId(){
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarios() {
		return salarios;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void ReajusteSalarial (double percentual) {
		salarios = (salarios * percentual) /100.0;  
		
	}
	
	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f", salarios);
	}
	
	

}
