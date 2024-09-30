package principal;

import apresentacaoherancafuncionario.Estagiario;
import apresentacaoherancafuncionario.Gerente;

public class Main {

	public static void main(String[] args) {

		Gerente gerente1 = new Gerente("Carlos Silva", 5000.00, 1000.00);
		Estagiario estagiario1 = new Estagiario("Ana Santos", 120, 11.00);
		
		gerente1.detalhesGerente();
		
		System.out.println("-----");
		
		estagiario1.detalhesEstagiario();
	}

	
}
