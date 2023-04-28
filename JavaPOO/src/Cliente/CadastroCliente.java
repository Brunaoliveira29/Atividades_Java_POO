package Cliente;

public class CadastroCliente {

		// Atributos
	
	private String nome;
	private String telefone;
	private String cpf;
	private String cidade;
	private String estado;
	
		// Métodos
	
	public CadastroCliente(String nome, String telefone, String cpf, String cidade, String estado) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
		this.cidade = cidade;
		this.estado = estado;
		
	}
	
		// Métodos Get e Set

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
		// Método visualizar
	
	public void visualizar() {
		
		System.out.println("*****************Dados do Cliente********************");
		System.out.println("Nome: " +this.nome);
		System.out.println("Telefone: " +this.telefone);
		System.out.println("CPF: " +this.cpf);
		System.out.println("Cidade: " +this.cidade);
		System.out.println("Estado: " +this.estado);
		System.out.println("\n");
	}

}
