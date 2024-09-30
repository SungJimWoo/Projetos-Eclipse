package herancaemjava.model;

import java.util.Date;

public class Conta {

	private long numeroConta;
	private Date dataAbertura;
	private Date dataEncerramento;
	private int situacao = 1; //Ativa
	private int senha;
	private double saldo = 0.0;
	
	public Conta(long numeroConta, int senha) {
		this.numeroConta = numeroConta;
		this.senha = senha;
		this.dataAbertura = new Date();
	}
	
	public long abrirConta() {
		this.situacao = 1;//Conta ativa
		return numeroConta;
	}
	
	public double consultarSaldo() {
		return saldo;
	}
	
	public String extratoConta() {
		return "Extrato da conta " +numeroConta+": \nSaldo atual: " +saldo;
	}
	
	public int sacarValor(double valor) {
		if(valor <= saldo) {
			saldo -= valor;
			return 1; //Sucesso
		} else {
			return 0;//Falha pelo saldo inferior
		}
	}
	
	public int despositarValor(long numeroConta, double valor) {
		if(this.numeroConta == numeroConta && situacao == 1) {
			saldo += valor;
			return 1;//Sucesso no depósito
		} else {
			return 0;//Falha por conta inexistente ou encerrada
		}
	}
	
	public int encerrarConta() {
		if(situacao == 1 && saldo == 0.0) {
			situacao = 0;//Conta encerrada
			dataEncerramento = new Date();
			return 1;//Sucesso
		} else {
			return 0;//Conta já encerrada ou há saldo na conta ainda
		}
	}
	
	public long getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(long numeroConta) {
		this.numeroConta = numeroConta;
	}
	public Date getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public Date getDataEncerramento() {
		return dataEncerramento;
	}
	public void setDataEncerramento(Date dataEncerramento) {
		this.dataEncerramento = dataEncerramento;
	}
	public int getSituacao() {
		return situacao;
	}
	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
