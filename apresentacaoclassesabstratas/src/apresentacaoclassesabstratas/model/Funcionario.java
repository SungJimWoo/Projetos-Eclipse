package apresentacaoclassesabstratas.model;

import apresentacaoclassesabstratas.enuns.Departamento;

//Classe abstrata, onde possui as propriedades e métodos em comuns
abstract class Funcionario {

	private String nome;
	private double salario;
	private Departamento departamento;
	
	public Funcionario(String nome, double salario, Departamento departamento) {
		this.nome = nome;
		this.salario = salario;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	//Método para calcular bônus que pode ser sobreescrito nas subclasses
	public double calcularBonus() {
		return salario * 0.10; //Bônus padrão de 10%
	}
	
	public void detalhesFuncionario() {
		System.out.println("Nome: " +nome);
		System.out.println("Sálario: " +salario);
		System.out.println("Departamento: " +departamento);
		System.out.println("Bônus: " +calcularBonus());
	}
}
