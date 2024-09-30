package classesdojogo.model;

public class JogoDeCarta extends Jogo{

	private int qtdeCartas;
	
	public JogoDeCarta(String nomeJogo, double preco, int qtdeCartas) {
		super(nomeJogo, preco);
		this.qtdeCartas = qtdeCartas;
	}

	public int getQtdeCartas() {
		return qtdeCartas;
	}

	public void setQtdeCartas(int qtdeCartas) {
		this.qtdeCartas = qtdeCartas;
	}

	@Override
	public String detalhesJogo() {
		return 	"Nome do Jogo: " +getNomeJogo()+ "\n" +
				"Preço: R$" +getPreco()+ "\n" +
				"Quantidade de Cartas: " +qtdeCartas;
	}
}
