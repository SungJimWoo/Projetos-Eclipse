package apresentacaoclassesabstratas.aplication;

import apresentacaoclassesabstratas.enuns.Departamento;
import apresentacaoclassesabstratas.model.Estágiario;
import apresentacaoclassesabstratas.model.Gerente;

public class EmpresaTeste {

	public static void main(String[] args) {

		Gerente gerente1 = new Gerente("Carlos da Silveira", 5000.00, Departamento.TECNOLOGIA, 10000.00);
	
		Estágiario estagiario1 = new Estágiario("Ana Santos", 120, 15.00, Departamento.MARKETING);
		
		gerente1.detalhesGerente();
		System.out.println("------------");
		estagiario1.detalhesEstagiario();
	}

}
