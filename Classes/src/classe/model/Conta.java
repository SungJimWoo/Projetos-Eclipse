package classe.model;

public class Conta {
	
	private int numero;
	private int agencia;
	private double saldo;
	private Cliente cliente;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", agencia=" + agencia + ", saldo=" + saldo + ", cliente=" + cliente + "]";
	}

}
