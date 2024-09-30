package apresentacaoherancafuncionario;

public class Estagiario extends Funcionario {

	private int horasTrabalho;
	private double valorHora;
	
	public Estagiario(String nome, int horasTrabalho, double valorHora) {
		super(nome, horasTrabalho * valorHora);
		this.horasTrabalho = horasTrabalho;
		this.valorHora = valorHora;
	}

	public int getHorasTrabalho() {
		return horasTrabalho;
	}

	public void setHorasTrabalho(int horasTrabalho) {
		this.horasTrabalho = horasTrabalho;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	//Sobreescrita do método calcularBonus() do FUNCIONARIO
	@Override
	public double calcularBonus() {
		return 50.00; //Bônus fixo de R$50,00 para estágiario
	}
	
	public void detalhesEstagiario() {
		detalhesFuncionario();
		System.out.println("Horas trablhadas: " +horasTrabalho);
		System.out.println("Valor hora: " +valorHora);
		System.out.println("Bônus: " +calcularBonus());
	}
	
}
