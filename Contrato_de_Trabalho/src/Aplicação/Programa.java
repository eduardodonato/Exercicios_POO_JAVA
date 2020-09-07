package Aplicação;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.ContratoPorHora;
import entities.Departamento;
import entities.Funcionario;
import entities.enums.Nivel_Funcionario;

public class Programa {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com o nome do departamento: ");
		String departamento = sc.nextLine();
		System.out.println();
		System.out.println("Entre com os dados do trabalhador: ");
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("Nivel: ");
		String nivel = sc.nextLine();
		System.out.println("Qual a base de salario: ");
		double baseSalario = sc.nextDouble();
		Funcionario funcionario = new Funcionario(nome, Nivel_Funcionario.valueOf(nivel), baseSalario, new Departamento(departamento ));
		
		Date x = new Date();
		
		System.out.println("Quantos contratos foram feitos com esse tralhador: ");
		int N = sc.nextInt();
		
		for (int i = 0; i <= N ; i++) {
			System.out.println("Entre com os dados do contrato #" + (i+1));
			System.out.print("Data (DD/MM/YYYY");
			Date DataContrato = sdf.parse(sc.next());
			System.out.printf("Informe o valor recebido por hora trabalhada - Contrato #" + (i+1));
			double SalarioHora = sc.nextDouble();
			System.out.println("Informe o tempo de duração do trabalho contrato #" + (i+1));
			int horas = sc.nextInt();
			ContratoPorHora contrato = new ContratoPorHora(DataContrato, SalarioHora, horas);
			funcionario.adicionarContrato(contrato);
		}
		
		 System.out.println();
		 System.out.println("Entre com o mês e com o ano que se deseja calcular: (MM/YYYY)");
		 
		 String mesEano = sc.next();
			int mes = Integer.parseInt(mesEano.substring(0, 2));
			int ano = Integer.parseInt(mesEano.substring(3));
			System.out.println("Name: " + funcionario.getNome());
			System.out.println("Department: " + funcionario.getDepartamento().getNome());
			System.out.println("Income for " + mesEano + ": " + String.format("%.2f", funcionario.LucroFuncionario(ano, mes)));
			
			sc.close();
		}
} 
