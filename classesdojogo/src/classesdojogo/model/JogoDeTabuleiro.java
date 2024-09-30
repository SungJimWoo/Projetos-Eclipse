package classesdojogo.model;

public class JogoDeTabuleiro extends Jogo{

	private int qtdePecas;
	
	public JogoDeTabuleiro(String nomeJogo, double preco, int qtdePecas) {
		super(nomeJogo, preco);
		this.qtdePecas = qtdePecas;
	}

	public int getQtdePecas() {
		return qtdePecas;
	}

	public void setQtdePecas(int qtdePecas) {
		this.qtdePecas = qtdePecas;
	}
	
	@Override
	public String detalhesJogo() {
		return 	"Nome do Jogo: " +getNomeJogo()+ "\n" +
				"Preço: R$" +getPreco()+ "\n" +
				"Quantidade de Peças: " +qtdePecas;
	}
}

