package apresentacaoherancafuncionario;

public class Funcionario {

	private String nome;
	private double salario;
	
	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
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
	
	/*
	 * Método para calcular bônus,
	 * que pode ser sobrescrito nas subclasses.
	 */
	public double calcularBonus() {
		return salario * 0.10;
	}
	
	public void detalhesFuncionario() {
		System.out.println("Nome: " +nome);
		System.out.println("Sálario: " +salario);
		System.out.println("Bonificação: " +calcularBonus());
	}
}
