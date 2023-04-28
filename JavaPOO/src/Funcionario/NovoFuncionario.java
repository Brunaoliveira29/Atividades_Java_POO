package Funcionario;

import java.util.Date;

public class NovoFuncionario {
	
		// Atributos
	
	private String nome;
	private String setor;
	private String cargo;
	private float salario;
	private Date dataAdmissao;
	
		// Métodos
	
	public NovoFuncionario(String nome, String setor, String cargo, float salario, Date dataAdmissao) {
		super();
		this.nome = nome;
		this.setor = setor;
		this.cargo = cargo;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
	}
	
		// Métodos Get e Set

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
			
		// Método visualizar
	
	public void visualizar() {
		
		System.out.println("***************Dados do Funcionário******************");
		System.out.println("Nome: " +this.nome);
		System.out.println("Setor: " +this.setor);
		System.out.println("Cargo: " +this.cargo);
		System.out.println("Salário: " +this.salario);
		System.out.println("Data de Admissão: " +this.dataAdmissao);
		System.out.println("\n");
	}
	
}
