package apresentacaoherancafuncionario;

//Subclasse Gerente, herda de Funcionario.
public class Gerente extends Funcionario{

	private double bonusAdicional;

	public Gerente(String nome, double salario, double bonusAdicional) {
		super(nome, salario);
		this.bonusAdicional = bonusAdicional;
	}

	public double getBonusAdicional() {
		return bonusAdicional;
	}

	public void setBonusAdicional(double bonusAdicional) {
		this.bonusAdicional = bonusAdicional;
	}
	
	//Sobreescrita do método calcularBonus() para incluir adicional do GERENTE
	@Override
	public double calcularBonus() {
		// TODO Auto-generated method stub
		return super.calcularBonus() + bonusAdicional;
	}
	
	public void detalhesGerente() {
		detalhesFuncionario(); // VEM DO PAI
		System.out.println("Bônus adicional: " +bonusAdicional);
	}
	
}
