package classesdojogo.model;

public abstract class Jogo {

	private String nomeJogo;
	private String categoria;
	private String fornecedor;
	private char genero;
	private double preco;
	
	public Jogo(String nomeJogo, double preco) {
		this.nomeJogo = nomeJogo;
		this.preco = preco;
	}
	
	public String getNomeJogo() {
		return nomeJogo;
	}
	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public abstract String detalhesJogo();
	
	
}
