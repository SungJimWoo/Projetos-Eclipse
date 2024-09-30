package herancaemjava.model;

public class ContaEspecial extends Conta{
	
	private double limite;

	public ContaEspecial(long numeroConta, int senha, double limite) {
		super(numeroConta, senha);
		this.limite = limite;
	}

	@Override
	public int sacarValor(double valor) {
		if(valor <= consultarSaldo() + limite) {
			double saldoAtual = consultarSaldo();
			saldoAtual -= valor;
			return 1;
		} else {
			return 0;
		}
	}
	
	public double jurosConta(double taxa) {
		return consultarSaldo() * taxa;
	}
	
	
}
