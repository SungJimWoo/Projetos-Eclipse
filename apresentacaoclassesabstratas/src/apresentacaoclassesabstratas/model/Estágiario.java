package apresentacaoclassesabstratas.model;

import apresentacaoclassesabstratas.enuns.Departamento;

public class Estágiario extends Funcionario{

	private int horasTrabalhadas;
	private double valorHora;
	
	public Estágiario(String nome, int horasTrabalhadas, double valorHora, Departamento departamento) {
		super(nome, horasTrabalhadas * valorHora, departamento);
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	@Override
	public double calcularBonus() {
		return 50.00;
	}
	
	public void detalhesEstagiario() {
		detalhesFuncionario();
		System.out.println("Horas trabalhadas: " +horasTrabalhadas);
		System.out.println("Valor por hora: " +valorHora);
		System.out.println("Sálario: " +horasTrabalhadas * valorHora);
		System.out.println("Bônus: " +calcularBonus());
	}
	
}
