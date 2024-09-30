package apresentacaoclassesabstratas.model;

import apresentacaoclassesabstratas.enuns.Departamento;

public class Gerente extends Funcionario{

	private double bonusAdicional;
	
	public Gerente(String nome, double salario, Departamento departamento, double bonusAdicional) {
		super(nome, salario, departamento);
		this.bonusAdicional = bonusAdicional;
	}

	public double getBonusAdicional() {
		return bonusAdicional;
	}

	public void setBonusAdicional(double bonusAdicional) {
		this.bonusAdicional = bonusAdicional;
	}

	@Override
	public double calcularBonus() {
		return super.calcularBonus() + bonusAdicional;
	}
	
	public void detalhesGerente() {
		detalhesFuncionario();//VÊM DO PAI
		System.out.println("Bônus Adicional: " +bonusAdicional);
	}
	
	
}