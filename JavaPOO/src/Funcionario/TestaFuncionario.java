package Funcionario;

import java.util.Date;

public class TestaFuncionario {

	public static void main(String[] args) {

		NovoFuncionario funcionario1 = new NovoFuncionario("Carlos Roberto", "Produção", "Coordenador", 5000, new Date());
		
		NovoFuncionario funcionario2 = new NovoFuncionario("Gabriela Ferreira", "Compras", "Analista Jr", 2500, new Date());
		
		funcionario1.visualizar();
		
		funcionario2.visualizar();
		
	}

}
