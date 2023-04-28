package Cliente;

public class TestaCliente {

	public static void main(String[] args) {
		
		CadastroCliente cliente1 = new CadastroCliente("Bruna Oliveira", "15 99129-3456", "389.506.745-26", "Sorocaba", "São Paulo");
				
		CadastroCliente cliente2 = new CadastroCliente("Débora Silva", "15 99758-3114", "459.523.144-87", "Campinas", "São Paulo");
		
		cliente1.visualizar();
		
		cliente2.visualizar();
	
	}

}
