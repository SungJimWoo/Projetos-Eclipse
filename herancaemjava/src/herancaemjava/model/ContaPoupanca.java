package herancaemjava.model;

import java.util.Date;

public class ContaPoupanca extends Conta{

	private Date dataAniversario;
	
	public ContaPoupanca(long numeroConta, int senha, Date dataAniversario) {
		super(numeroConta, senha);
		this.dataAniversario = dataAniversario;
	}
	
	public double calcularRendimento(Date dataAtual, double taxaRendimento) {
		if(dataAtual.equals(dataAniversario)) {
			return consultarSaldo() * taxaRendimento;
		} else {
			return 0.0;
		}
	}

}
