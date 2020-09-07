package entidade;

public class Pensionato {
	private String nome;
	private String email;
	private int NumeroQuarto;
	
	
	public Pensionato(String nome, String email, int NumeroQuarto) {
		this.nome = nome;
		this.email = email;
		this.NumeroQuarto = NumeroQuarto;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	public void setEmail (String email) {
		this.email = email;
	}
	
	
	public int getNumeroQuarto() {
		return NumeroQuarto;
	}


	public String toString() {
		return "***********P.E.N.S.I.O.N.A.T.O************************" +
				"\n" + "Quartos ocupados: "+ "\n" 
				+"Numero do Quarto: " + NumeroQuarto + "\n"
				+ "Cliente: " + nome +	"\n" 
				+ "Email: " + email + "\n";
				
	}
}