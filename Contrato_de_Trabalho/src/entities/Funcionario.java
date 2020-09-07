package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import entities.ContratoPorHora;

import entities.enums.Nivel_Funcionario;

public class Funcionario {

	private String nome;
	private Nivel_Funcionario nivel;
	private double salarioBase;

	// Como no diagrama UML mostra que um funcionario pode ter varios contratos
	// foi-se necessario criar um arraylLit com eles, tb no UMl fala que 1
	// funcionario
	// possui vinculo apenas com 1 departamento

	private Departamento departamento;
	private List<ContratoPorHora> contratos = new ArrayList<>();;

	// No caso acim, quando se tem uma composição que tem muitos ( funcionario tem
	// muitos contratos)
	// não deve ser incluido no contrutor

	public Funcionario() {

	}

	public Funcionario(String nome, Nivel_Funcionario nivel, double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Nivel_Funcionario getNivel() {
		return nivel;
	}

	public void setNivel(Nivel_Funcionario nivel) {
		this.nivel = nivel;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoPorHora> getContratos() {
		return contratos;
	}

	/*
	 * public void setContratos(List<ContratoPorHora> contratos) { this.contratos =
	 * contratos; }**** ESSE METODO DEVE SER APAGADO POIS AQUI GERA OUTRA LISTA E
	 * DEVE SER USADA AQUELA QUE CRIAMOS NO ARRAY
	 */

	// IMPLEMENTAÇÃO DOS METODOS DA CLASSE **************************

	public void adicionarContrato(ContratoPorHora contrato) {
		contratos.add(contrato);
	}

	public void removerContrato(ContratoPorHora contrato) {
		contratos.remove(contrato);
	}

	public double LucroFuncionario (int mes, int ano) {
		double soma = salarioBase;
		//Quanto que ele ganhou será o salario base somado com o tanto que ele ganhou com os contratos daquele mes
		// Devemos fazer um for para varrer os contratos do funcionario para testar quais sao desse mes e desse ano para entrar na soma ou nao
		
		
		//Na linha de baixo usamos o calendar para acesar o dia e o ano de analisa daquele contrato
		Calendar cal = Calendar.getInstance();
		
		for(ContratoPorHora c : contratos) {
			cal.setTime(c.getData());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = 1 + cal.get(Calendar.MONTH);
			if(ano == c_ano && mes == c_mes) {
				soma += c.ValorTotal();
				
			}
		
		}
		
		return soma;
	}

}
